package Ch4;

public class Array8 {
	//배열
	public static void main(String[] args) {
		//최대값과 최소값
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		//배열의 첫번째 값으로 최대값, 최소값 초기화
		int max = score[0];
		int min = score[0];
		
		for(int i=0; i<score.length; i++) {
			if(score[i]>max) {
				//score[i]가 max보다 크면 max에 값 저장
				max = score[i];
			} else if(score[i]<min) {
				//score[i]가 min보다 작으면 min에 값 저장
				min = score[i];
			}
		}
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}
}
