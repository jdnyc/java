package Ch4;


public class Array17 {
	//�迭
	public static void main(String[] args) {
		//String, char �迭 ��ȯ
		String src = "ABCDE";
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i); // src�� i��° ���� ch�� ����
			System.out.println("src.charAt("+i+"):"+ch);
		}
		
		//String�� char�迭�� ��ȯ
		char [] chArr = src.toCharArray();
		
		//char�迭 ���
		System.out.println(chArr);
	}
}

