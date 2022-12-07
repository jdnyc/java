package Ch2;

public class Operator6 {
	//문자형 사칙연산
	public static void main(String[] args) {
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';

		//d는 코드 100, a는 코드 97
		System.out.println(d-a);
		//문자 2 코드는 50, 문자 0 코드는 48
		System.out.println(two-zero);
		//문자들의 코드 확인
		System.out.println((int)a);
		System.out.println((int)d);
		System.out.println((int)zero);
		System.out.println((int)two);
		
		char c1 = 'a';
		
		//컴파일 에러
		//char c2 =  c1+1;
		
		char c2 = 'a'+1;
		System.out.println(c2);
	}
}
