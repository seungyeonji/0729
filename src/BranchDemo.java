import java.util.Scanner;

public class BranchDemo {
	public static void main(String[] args) {
		//i가 7의 배수라면 출력하시오
//		for(int i =1; i<101; i++) {
//			if(i%7==0) System.out.printf(i + "\t");
//			//else continue; 라는 코드가 숨어있음
//			//continue는 반복을 계속하기 위한 코드 (<-> break)
//		}
		
		//다중반복문
		//알파벳 한줄에 하나씩 증가하면서 출력
//		outer : //라벨(label)은 항상 : 씀
//					//라벨은 중첩반복문 벗어날때만 사용
//		for(int i = 65;i<91;i++) {
//			int  j = 65; 	//while은 항상 초기치 바깥으로 빼줘야함
//			inner :
//			while(j<=i) {	//조건
//				System.out.printf("%c", j);
//				if(j==70) break outer;		//그냥 break; 하면 while을 벗어나게 하는 반복문
//													//break 뒤에 내가 벗어나고 싶은 라벨을 써주면 됨 -> for이 outer 니까 break outer 하면 for문 벗어남
//				j++; 	//증감
//			}
//			System.out.println();
//		}
		
			
		//continue, break를 써야하는 이유
		String systemPassword = "ABCD";
		Scanner sc = new Scanner(System.in);
		System.out.print("Input password : ");
		String userPassword = sc.nextLine();
		int i;
		for(i=0; i<4; i++) {
			if(systemPassword.charAt(i) == userPassword.charAt(i)) continue;
			else break;
		}
		if(i==4) System.out.println("Success");
		else System.out.println("Failure");					//이 프로그램의 단점은 4번만 비교하기 때문에 뒤에 뭘 넣든 success가 뜬다는것
																		//단지 continue와 break를 설명하기 위해서 만든 프로그램
		
	}
}
