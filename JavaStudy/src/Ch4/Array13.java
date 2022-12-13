package Ch4;

public class Array13 {
	//배열
	public static void main(String[] args) {
		//빈도수 구하기
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		//임의의 수 저장
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10);
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
			counter[numArr[i]]++;
			//numArr[i]의 값이 있으면 카운터 하나 추가
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println(i+"의개수 :"+ counter[i]);
		}
	}
}
