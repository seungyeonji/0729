
public class DoWhileDemo2 {
	public static void main(String[] args) {
		//1부터 6까지 랜덤값을 추출하되 서로 다른 2개를 출력하는 프로그램
		//-> do while이 편함 (일단 주사위 돌리고 난 뒤 두 수 비교)
		
		//do while문
//		int n1 = (int)(Math.random()*6+1);
//		int n2 = (int)(Math.random()*6+1);
//		do {
//			System.out.printf("첫번째 수 : %d\n", n1);
//			System.out.printf("두번째 수 : %d", n2);
//		}while(n1==n2);
		

		//do while문 강사님 답
//		int rand1, rand2;
//		do {
//			rand1 = (int)(Math.random()*6+1);
//			rand2 = (int)(Math.random()*6+1);
//		}while(rand1==rand2);
//		System.out.println("rand1 = " + rand1 + ", rand2 = " + rand2);

		
		
		//1부터 45까지 서로 다른 숫자 6개 추출하기(중복제외 로또번호)
		//do while문		
		int n1, n2, n3, n4, n5, n6;
		do {
			n1 = (int)(Math.random()*45+1);
			n2 = (int)(Math.random()*45+1);
			n3 = (int)(Math.random()*45+1);
			n4 = (int)(Math.random()*45+1);
			n5 = (int)(Math.random()*45+1);
			n6 = (int)(Math.random()*45+1);
		}while(n1 ==n2 ||n1 ==n3 ||n1 ==n4 ||n1 ==n5 ||n1 ==n6 ||
				n2 ==n3 ||n2 ==n4 ||n2 ==n5 ||n2 ==n6 ||
				n3 ==n4 ||n3 ==n5 ||n3 ==n6 ||
				n4 ==n5 ||n4 ==n6 ||
				n5 ==n6); // ==은 이항연산자
		
		System.out.printf("%d, %d, %d, %d, %d, %d", n1, n2, n3, n4, n5, n6);
		
		
		
		
		//for문
		//for 쓰면 if문 써야함
//		int rand1, rand2;
//		for( ; ; ) {
//			rand1 = (int)(Math.random()*6+1);
//			rand2 = (int)(Math.random()*6+1);
//			if(rand1 != rand2) break;
//		}
		
//		System.out.println("rand1 = " + rand1 + ", rand2 = " + rand2);
		
		
		
		
		
		//while문
//		int rand1, rand2;
//		while(true) {
//			rand1 = (int)(Math.random()*6+1);
//			rand2 = (int)(Math.random()*6+1);
//			if(rand1!=rand2) break;
//		}
//		System.out.println("rand1 = " + rand1 + ", rand2 = " + rand2);
//		
//		
	}
}
