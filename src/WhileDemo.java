
public class WhileDemo {
	public static void main(String[] args) {
		
		//while문으로 구구단 출력
//		int i = 1;	//바깥쪽 while문의 초기값
//		while(i<10) {
//			int j = 2;		//안쪽 while의 초기값
//			while(j<10) {
//				System.out.printf("%d x %d = %d\t", j, i, j*i);
//				j++;		//증감 안까먹으려면 while 문 틀잡을때 미리 써놓기
//			}			//수위아저씨가 순찰 다 돌았음			
//			System.out.println();	//순찰끝났으니까 내려오기
//			i++;
//		}
		
		//어제 했던 for문 연습문제(0728-Practice2.java) while로 바꿔보기
		//사실 이런 문제는 시작과 끝이 명확해서 for문 쓰는게 더 좋음
		
		int count=0, line=1;
		int i = 65;
		while(i<=90) {
			if(line%2==0) System.out.printf("%c\t", i+32);
			else System.out.printf("%c\t", i);
			count++;
			if(count%5==0) {
				System.out.println();
				line++;
			}
			i++;
		}
		
		
		
		
	}
}
