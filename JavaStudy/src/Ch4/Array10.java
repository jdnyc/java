package Ch4;

public class Array10 {
	//배열
	public static void main(String[] args) {
		//섞기
		int[] ball = new int[45]; //길이 45 배열
		
		//배열의 각 요소에 1~45 값 저장
		for(int i=0; i< ball.length; i++) 
			ball[i] = i+1;
		
		int tmp = 0; //값 바꾸는데 사용할 변수
		int j = 0; //임의의 값 저장할 변수
		
		//0~5번째 요소까지 모두 6개만 바꿈
		for(int i=0; i<6; i++) {
			//0~44범위의 임의의 값
			j=(int)(Math.random()*45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}
}
