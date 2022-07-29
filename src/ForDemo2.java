
public class ForDemo2 {
	public static void main(String[] args) {
		/*
		 * x는 1부터 2씩 증가,
		 * y는 100부터 3씩 감소할때
		 * 교차할때의 x, y의 값?
		 */
//		int x,y;
//		for(x=1, y=100; x<101; x+=2, y-=3) {
//			if(x>y) break;		//break: 반복을 멈춰라 = 반복문 for를 벗어나는거
//		}
//		System.out.printf("x=%d, y=%d\n", x, y);
		
		
		
		//1부터 10까지 출력 - for문 사용
		//원래방법
//		for(int i=1;i<11;i++) {
//			System.out.print(i + "\t");
//		}
		
		//다른방법
//		int i =1 ;			//초기화를 바깥으로 뺌
//		for(    ; i<11;   ) {
//			System.out.print(i+"\t"');
//			i++;
//		}
		
		
		
		//while문 : 참일동안만 반복
		//1부터 10까지 출력 - while문
//		int y = 1; 	//while은 초기화 무조건 바깥에
//		while(y<11) {
//			System.out.print(y + "\t");
//			y++;		//증감 필수!!! 없으면 바로 무한루프돔
//		}
		
		
		//for문 구구단
//		for(int i=1;i<10;i++) {
//			for(int j=2;j<10;j++) {
//				System.out.printf("%d x %d = %d\t", j, i, j*i);	
//			}
//			System.out.println();
//		}
//		
		
		//while문 구구단
		int i = 1;
		while(i<10) {
			int j = 2;
			while(j<10) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		//무한루프 -> for 안에 다 비워놓으면 무한루프
//		for( ; ; ) {
//			System.out.println("Hello, world");
//		}
		
		
	}
}
