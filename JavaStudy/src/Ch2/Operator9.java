package Ch2;

public class Operator9 {
	//소문자, 대문자 변경
	public static void main(String[] args) {
		char lowerCase = 'a';
		//대문자 A가 소문자 a 보다 32 적음.
		char upperCase = (char)(lowerCase -32);
		System.out.println(upperCase);
		//반대로 소문자로 변경하려면 32를 더하면 된다.
	}
}
