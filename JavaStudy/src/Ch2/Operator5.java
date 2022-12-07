package Ch2;

public class Operator5 {
	//값손실
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b);
		
		/*원래 10*30은 300
		 * 하지만 byte 형은 -127~127 범위
		 * 300은 100101100이지만
		 * 44는   00101100
		 * 그러므로 값 손실 발생 => 큰 자료형 사용을 해야하는 이유
		*/
		System.out.println(c);
	}

}
