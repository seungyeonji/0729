import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		
		// 정수 한개 입력받아서 짝수인지 홀수인지 알려주는 프로그램
		//whileDemo1 에서 while 쓴거랑 비교
		Scanner sc = new Scanner(System.in);
		String y_n;			//y_n은 지역변수기 때문에 중괄호 벗어나서 만들어줘야함
		do{
			System.out.print("정수 한 개 : ");
			int su = sc.nextInt();
			System.out.println(su + "는 " + ((su%2==0)? "짝수입니다":"홀수입니다"));
			System.out.print("Again(y/n)? : ");	//n을 누를때 그만하는건데 n을 언제누를지 모르니까 이럴때 쓰는게 while
			y_n = sc.next();			//y_n을 입력 받아야 하니까 sc.next()
		}while(y_n.equals("y")||y_n.equals("Y"));
		System.out.println("Program is over...");
	}
}
