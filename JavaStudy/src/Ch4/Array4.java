package Ch4;

public class Array4 {
	//배열
	public static void main(String[] args) {
		//for문을 이용한 배열의 복사
		int[] arr = new int[5];
		//기존 배열보다 길이가 2배인 배열 생성
		int[] tmp = new int[arr.length*2];
		
		for(int i=0; i<arr.length; i++) {
			//arr[i]의 값을 tmp[i]에 저장
			tmp[i] = arr[i];
		}
		
		arr = tmp; //참조변수 arr이 새로운 배열을 가리키게 한다.
	}
}
