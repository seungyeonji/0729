import java.util.Scanner;

public class ForDemo1 {
	public static void main(String[] args) {
		//구구단 출력 - 2중 for문 사용(for 안에 for) = 2차원배열
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 단? : ");
//		int dan = sc.nextInt();
//		for(int i=1;i<10;i++){
//			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//	}
		
		System.out.println("                                                   <<< 구구단 >>>                                                    ");
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);	
			}
			System.out.println();
		}
		
		
		
		
		
		//<다중for문 연습>
		//별 다섯개 찍기 -> 별 하나를 다섯번 찍는거
//		for(int i=1;i<6;i++) {
//			System.out.print("★\t");
//		}
		
		
		
		//별 세로로 다섯개 찍기
//		for(int i=1;i<6;i++) {
//		System.out.println("★");
//		}
		
		//한개씩 증가하는 별 찍기		
//		for(int i=1;i<6;i++) {	//밑으로 내려가는 반복
//			for(int j=1;j<=i;j++) {	//옆으로 가는 반복
//				System.out.print("★\t");
//			}
//			System.out.println();		//수위아저씨가 층을 바꾼다
//		}
		
		
		//위에 문제를 내가 직접 했는데 맨마지막에 한줄이 더 나옴
		
//		for(int i=1;i<6;i++) {
//			System.out.println("★");
//			for(int j=1;j<=i;j++) {
//				System.out.print("★\t");
//			}
//		}
		
		
		//한개씩 감소하는 별 찍기
//		for(int i=5;i>0;i--) {
//			for(int j=1 ;j<=i;j++) {
//				System.out.print("★\t");
//			}
//			System.out.println();
//		}
		
		
//		A
//		AB
//		ABC
//		ABCD
//		... 출력
		
//		for(int i=65;i<=90;i++) {
//			for(int j=65;j<=i;j++) {		//j도 똑같이 65부터 시작
//				System.out.printf("%c",j);
//			}
//			System.out.println();
//		}

		
	}
}
