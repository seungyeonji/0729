
public class DoWhileDemo {
	public static void main(String[] args) {
		//1부터 10까지 출력
		//for문
		for(int i=1;i<11;i++){
			System.out.print(i + "\t");
		}
		
		System.out.println();
		System.out.println();
		
		//while문
		int j =1;		//초기치
		while(j<11) {	//조건
			System.out.print(j+"\t");
			j++;		//증감
		}
		System.out.println();
		System.out.println();
		
		
		//do while문
		//while 조건 내리고 앞에 do 붙이고 while조건 뒤에 ; 붙여주면됨
		int k = 1; 	//초기치
		do {
			System.out.print(k + "\t");
			k++; 		//증감
		}while(k<11);		//조건
		
	}
	
}
