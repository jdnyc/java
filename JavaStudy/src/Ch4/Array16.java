package Ch4;


public class Array16 {
	//배열
	public static void main(String[] args) {
		//String 배열 예제
		//16진수를 2진수로 표현하는 예제
		//16진수
		char[] hex = {'C', 'A', 'F', 'E'};
		
		//2진수
		String[] binary = { "0000", "0001", "0010", "0011",
							"0100", "0101", "0110", "0111",
							"1000", "1001", "1010", "1011",
							"1100", "1101", "1110", "1111"};
		
		String result = "";
		
		for (int i = 0; i < hex.length; i++) {
			if(hex[i] >='0' && hex[i] <= '9') {
				result += binary[hex[i]-'0'];
			} else {
				result += binary[hex[i]-'A'+10];
			}
		}
		
		System.out.println("hex:" + new String(hex));
		System.out.println("binary:"+result);
	}
}

