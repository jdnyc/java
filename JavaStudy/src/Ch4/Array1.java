package Ch4;

public class Array1 {
	//배열
	public static void main(String[] args) {
		//배열의 생성
		int[] a; //int 타입 배열 다루기 위한 참조변수 a 선언
		a = new int[5]; //int 타입 값 5개 저장할 수 있는 배열
		
		//한줄로 배열의 선언과 생성
		int[] store = new int[5]; //길이 5인 int 배열 store
		
		//예제
		//길이 5인 int 배열 score 
		int[] score =new int[5];
		int k=1;
		
		score[0]=50; //인덱스0에 50 저장
		score[1]=60; //인덱스1에 60 저장
		score[k+1]=70; //k=1이므로 인덱스2에 70저장
		score[3]=80; //인덱스3에 80 저장
		score[4]=90; //인덱스4에 90 저장
		
		//score[3]값과 score[4]값의 합
		int tmp = score[k+2]+score[4];
		
		//for문을 통한 배열의 모든 요소들 출력
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d]:%d%n",i, score[i]);
		}
		
		//tmp값 출력 	
		System.out.printf("tmp:%d%n", tmp);
		//index 범위를 벗어난 값
		System.out.printf("score[%d]:%d%n", 7, score[7]);
	}

}
