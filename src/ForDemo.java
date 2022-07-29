import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
		//1부터 100까지 더하기
//		int sum = 0;	//지역변수 초기화
//		for(int i = 1; i<=100; i++) {
//			sum+=i;		//sum = sum + i;
//		}
//		System.out.println("sum = " + sum);
		
		//팩토리얼
		Scanner sc = new Scanner(System.in);		//ctrl + shift + o 해서 import
		System.out.print("몇 fatorial : ");
		int su = sc.nextInt();
		int result = 1;
		for(int i = su ; i>=1 ; i--) {		//i>=1 대신 i>0 써도됨
			result *= i;			//result = result * i;		//누적해서 곱하기
		}
		System.out.printf("%d! = %d\n", su, result);
	}
}
