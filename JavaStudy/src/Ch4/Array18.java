package Ch4;

public class Array18 {
	//�迭
	public static void main(String[] args) {
		//String, char �迭 ��ȯ
		String source = "SOSHELF";
		
		String[] morse = {".-","-...","-.-","-..",".",
						  "..-.","--.","....","..",".---",
						  "-.-",".-..","--","-.","---",
						  ".--.","--.-",".-.","...","-",
						  "..-","...-",".--","-..-","-.--",
						  "--.."};
		String result ="";
		
		for (int i = 0; i < source.length(); i++) {
			result += morse[source.charAt(i)-'A'];
		}
		
		System.out.println("source:"+ source);
		System.out.println("mores:"+ result);
	}
}

