package Ch2;

public class Operator14 {
	//���ڿ� ��
	public static void main(String[] args) {
		String str = "abc";
		//String Ŭ������ ��ü ����
		String str2 = new String("abc");
		
		//""�� ����� ���� �ȵǴϱ� \�� �����
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str==\"abc\" ? %b%n", str=="abc");
		System.out.printf(" str.equals(\"abc\") ? %b%n", str.equals("abc"));
		System.out.printf(" str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf(" str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		//equalsIgnoreCase�� ��ҹ��� �������� �ʰ� ��
		System.out.printf(" str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}
}
