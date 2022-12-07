package Ch2;

public class Operator14 {
	//문자열 비교
	public static void main(String[] args) {
		String str = "abc";
		//String 클래스의 객체 생성
		String str2 = new String("abc");
		
		//""는 출력이 따로 안되니까 \를 사용함
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str==\"abc\" ? %b%n", str=="abc");
		System.out.printf(" str.equals(\"abc\") ? %b%n", str.equals("abc"));
		System.out.printf(" str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf(" str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		//equalsIgnoreCase는 대소문자 구별하지 않고 비교
		System.out.printf(" str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}
}
