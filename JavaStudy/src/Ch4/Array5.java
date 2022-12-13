package Ch4;

public class Array5 {
	//배열
	public static void main(String[] args) {
		//예제
		int[] arr = new int[5]; //길이가 5인 배열 arr
		
		//1~5 저장
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
		System.out.println("변경전");
		System.out.println("arr.length:"+ arr.length);
		//기존 배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		//기존 배열보다 길이가 2배인 배열 생성
		int[] tmp = new int[arr.length*2];
		
		for(int i=0; i<arr.length; i++) {
			//arr[i]의 값을 tmp[i]에 저장
			tmp[i] = arr[i];
		}
		
		arr = tmp; //참조변수 arr이 새로운 배열을 가리키게 한다.
		
		System.out.println("변경후");
		System.out.println("arr.length:"+ arr.length);
		//기존 배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
	}
}
