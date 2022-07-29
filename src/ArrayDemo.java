
public class ArrayDemo {
	public static void main(String[] args) {
//		int a = 5;
//		int b = 7;
//		int c =9 ;
		
		//배열은 여러개의 변수(data)를 조금 더 쉽게 핸들링하기 위한 방법
		//배열은 주소를 저장
		
//		int a; 	//Declaration(선언)
//		a = 10;  //Assignment(할당)
//		int b = 5; 	//Initialization(초기화)
//		
//		//배열은 똑같은 애들을 묶은것
//		int [] array;	//Declaration = 지금부터 정수들의 주소를 저장하겠다
//		array = new int[4];	//Assignment	
//		int [] array1 = {1,2,3,4};	//Initialization -> 자바가 내부적으로 new를 붙여서 올림
//		
		// 인덱스 : 시작주소에 대한 상대번지
		
		//4,2,9,5를 넣는방법 3가지 -> 각각 쓰임새가 다르기 때문에 무조건 3번이 좋다는건 아님
		//1st way -> 개수가 많아지면 복잡해짐
//		int[] array;
//		array = new int[4];	//배열은 주소이기 때문에 주소를 만들어 줘야함 -> 방 4개를 먼저 만들어줘야함
//		array[0]=4;
//		array[1]=2;
//		array[2]=9;
//		array[3]=5;
		
		//2nd way
//		int[] array;
//		array = new int[] {4,2,9,5};	//방의 개수를 쓰지말자
		
		//3rd way(initialization)
		//이 방법의 치명적인 단점은 한줄에 선언과 할당을 같이하기 때문에 줄을 바꾸면 에러남
		//ex. int[] array; 	array = {4,2,9,5}; 이렇게 두줄로 하면 에러남
//		int [] array = {4,2,9,5};
		
		
		//double array
		//우리 반 학생 3명의 몸무게를 배열에 저장하는 프로그램
		//1st way
//		double [] array;
//		array = new double[3];
//		array[0]=67.9;
//		array[1]=43.7;
//		array[2]=56.2;
		
		//2nd way
//		double [] array;
//		array = new double[] {67.9, 43.7, 56.2};
		
		//3rd way
//		double [] array = {67.9, 43.7, 56.2};
		
		
		
		//char array
		//평점 저장
		//1st way
//		char [] array;
//		array = new char[5];
//		array[0] = 'A';
//		array[1] = 'C';
//		array[2] = 'B';
//		array[3] = 'F';
//		array[4] = 'A';
		
		//2nd way
//		char[] array;	//선언
//		array = new char[] {'A', 'C', 'B', 'F', 'A'};	//할당
		
		//3rd way
//		char [] array = {'A', 'C', 'B', 'F', 'A'}; 	//초기화 = 선언+할당 한줄에
		
		
		//boolean array
		//정규직 여부 저장
		//1st way
//		boolean [] array;	//선언
//		array = new boolean[3];	//생성
//		array[0] = true;
//		array[1] = false;
//		array[2] = false;
		
		
		//2nd way
//		boolean [] array; 	//선언
//		array = new boolean[] {true, false, false};
		
		//3rd way
		boolean [] array = {true, false, false};
		
		for(int i =0; i<3; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
		
		
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		//참조형 array - String 객체배열 -> 다음주에 계속
		//학생 4명 이름 저장
		//1st way
//		String [] array; 	//선언
//		array = new String[4];
//		array[0] = "한지민";
//		array[1] = "박지민";
//		array[2] = "Henry";
//		array[3] = "Michael jackson";		//이때까지는 사이즈 다 똑같았는데 이 경우는 사이즈가 다름
													//String = 주소 = 4바이트
													//번지(주소)만 저장하기 때문에 거기 들어가는 값의 크기가 달라도 상관없음
													//주소만 저장하니까 인덱스만 알면됨
		
		
		
		}
}
