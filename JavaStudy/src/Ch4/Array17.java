package Ch4;


public class Array17 {
	//배열
	public static void main(String[] args) {
		//String, char 배열 변환
		String src = "ABCDE";
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i); // src의 i번째 문자 ch에 저장
			System.out.println("src.charAt("+i+"):"+ch);
		}
		
		//String을 char배열로 변환
		char [] chArr = src.toCharArray();
		
		//char배열 출력
		System.out.println(chArr);
	}
}

