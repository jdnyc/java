package Ch2;

public class Operator12 {
	//비교 연산자
	public static void main(String[] args) {
		//%b는 boolean형 출력
		//정수형, 실수형 비교
		System.out.printf("10 == 10.0f \t %b%n", 10==10.0f);
		//문자형, 정수형 비교
		System.out.printf("'0' == 0 \t %b%n", '0'==0);
		//문자형, 코드 비교
		System.out.printf("'A' == 65 \t %b%n", 'A'==65);
		//문자형, 문자형 비교
		System.out.printf("'A' > 'B' \t %b%n", 'A'>'B');
		//문자형, 문자형 다른지 비교
		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 != 'B');
	}
}
