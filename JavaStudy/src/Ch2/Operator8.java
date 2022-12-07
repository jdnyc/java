package Ch2;

public class Operator8 {
	//자료형 값손실
	public static void main(String[] args) {
		char c1 = 'a';
		//c2에 c1 대입
		char c2 = c1;
		//c3에 공백 대입
		char c3 = ' ';
		
		int i = c1+1;
		
		c3 = (char)(c1+1);
		c2++;
		c2++;
		//a=97 그러므로 97+1은 98
		System.out.println("i="+i);
		//97이 두번 증가하여 99가 되고 문자는 c
		System.out.println("c2="+c2);
		//98의 문자형은 b
		System.out.println("c3="+c3);
	}
}
