import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String[] args) {
		
		// 정수 한개 입력받아서 짝수인지 홀수인지 알려주는 프로그램
		Scanner sc = new Scanner(System.in);
		while(true){	//반복 시작 시점(일단 무한루프 돌리고 나중에 물어보고 빠져나옴)
			System.out.print("정수 한 개 : ");
			int su = sc.nextInt();
			System.out.println(su + "는 " + ((su%2==0)? "짝수입니다":"홀수입니다"));
			System.out.print("Again(y/n)? : ");	//n을 누를때 그만하는건데 n을 언제누를지 모르니까 이럴때 쓰는게 while
			String y_n = sc.next(); 		//scanner는 char 읽을수 업으니까 string으로
			if(y_n.equals("n")||y_n.equals("N")) break;		//n을 눌렀을때 종료(break = 속해있는 반복문(while)을 벗어나는것)
		}
		System.out.println("Program is over...");
	}
}
