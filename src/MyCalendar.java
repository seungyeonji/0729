
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		//달력 만들기
		//그달 1일이 무슨 요일인지 -> 총 날수를 더해서 7로 나눈 나머지가 딱 떨어지면 일요일 1이면 월요일 등등	
		//그달 마지막날이 몇일인지만 알면됨
		
		Scanner sc = new Scanner(System.in);
			//main에서 만든애들은 전부다 지역변수
		
		System.out.print("Year : ");	//연도 입력받기
		int year = sc.nextInt();
		
		System.out.print("Month : ");		//월 입력받기
		int month = sc.nextInt();
		
		int day = 1;		//달력은 항상 1일기준
		int sum = 0;		//서기1년씩 계속 누적해서 더하기(윤년 366일, 평년 365일)
		for(int i =1; i< year; i++) {
			if(year % 400==0 ||(year%4==0 && year%100==0)){		//i가 윤년입니까?		//gc 쓰지말고 그냥 조건식 넣어줘야함
				sum+=366;			//i가 윤년이라면
			}else {
				sum+=365;			//i가 윤년이 아니라면
			}
		}	//작년 12월 31일까지 합
		
	
		for(int i = 1; i<month ; i++) {		//int i 써도됨 -> for 안에 있는 지역변수기 때문에
			sum += getLastDay(year, i);
		}	//입력한 연도, 월 전까지 합 계산
		sum ++;	//입력한 연도, 월의 마지막날 다음날이니까 +1
		
		int space = sum%7;		//앞에서부터 몇번째부터 날짜 입력할건지, 앞에는 다 공백처리
		
		System.out.println("            <<<" + year + "년" + month + "월>>>");
//		System.out.println("日\t月\t火\t水\t木\t金\t土");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//첫째주 공백 출력							//금요일이면 별이 다섯개
		int count = 0;
		for(int i=0;i<space;i++) {
			System.out.print("★\t");
			count++;
		}
		
		//첫주 1일부터 마지막날까지 출력
		int lastDay = getLastDay(year, month);
		for(int i =1;i<=lastDay;i++) {
			System.out.print(i+"\t");
			count++;
			if(count%7==0) System.out.println();
		}
		
		
		
		//맞게 나오는지 test
//		switch(sum%7) {
//		case 0:	
//			System.out.println("SUN");
//			break;
//		case 1:
//			System.out.println("MON");
//			break;
//		case 2:
//			System.out.println("TUE");
//			break;
//		case 3:
//			System.out.println("WED");
//			break;
//		case 4:
//			System.out.println("THU");
//			break;
//		case 5:
//			System.out.println("FRI");
//			break;
//		case 6:
//			System.out.println("SAT");
//			break;
		
	}		//main() end
	
	
	//연도와 월을 입력받아서 그 달 마지막 일을 넘겨주는 메소드
	
	static int getLastDay(int year, int month) {		//위에 month랑 다른 지역에 있기 때문에 같은 이름이어도 충돌하지 않음
		int lastDay = 0;
		if(month == 2) {	//2월이라면
			if(year % 400==0 ||(year%4==0 && year%100==0))  lastDay = 29; 	//2월인데, 윤년이면
			else lastDay = 28; //2월인데, 윤년이 아니면
		}else if(month !=2) {	//2월이 아니라면
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
				lastDay = 31;
			else lastDay = 30;
		}
		return lastDay;
		
		}
	}



