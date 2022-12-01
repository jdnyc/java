package Ch1;

import java.util.*;

public class Variable2 {

	public static void main(String[] args) {
		
		//상수의 선언과 사용
		//상수 이름은 항상 대문자
		final int WIDTH = 20;
		final int HEIGHT = 10;
		
		//삼각형 면적 구하는 공식
		int triangleArea = (WIDTH * HEIGHT) / 2;
		//사각형 면적 구하는 공식
		int squareArea = WIDTH * HEIGHT;
		
		System.out.println(triangleArea);
		System.out.println(squareArea);
		
		System.out.println();
		
		//접두사
		int octNum = 010; //8진수로 10, 10진수로 8
		int hexNum = 0x10; //16진수 10, 10진수 16
		
		//10진수 출력
		System.out.println(octNum);
		System.out.println(hexNum);
		//8진수, 16진수 출력
		String rOctNum = Integer.toOctalString(octNum);
		String rHexNum = Integer.toHexString(hexNum);
		System.out.println(rOctNum);
		System.out.println(rHexNum);
		
		System.out.println();
		//리터럴 타입 불일치 (넓은 타입에 좁은타입 값 저장)
		int i = 'A'; //문자 'A'의 유니코드 저장됨
		long l = 123; //int보다 long 범위가 넓기에 저장 가능
		
		//int i =0x123456789; //int 타입의 범위가 넘는 값이기에 에러
		
		//문자 리터럴
		String s = ""; //문자열은 내용이 없는 빈 문자열 선언 가능
		//char ch = ''; 문자 리터럴은 반드시 하나의 문자가 필요함
		char ch = ' '; //공백 문자로 초기화 가능
		
		/*--------------------------------------------------*/
		
		//String
		//String 선언
		String str = "Java";
		String str1 = new String("Java");

		//str, str1 둘다 같은 의미로 선언
		System.out.println(str1);
		System.out.println(str);
		
		//덧셈 연산자
		String name = "Ja" + "va";
		String name1 = name + 8.0;
		
		System.out.println(name);
		System.out.println(name1);
		
		/*
		 * 문자열 + any type => 문자열 + 문자열
		 * any type + 문자열 => 문자열 + 문자열
		 */
		
		//변수 타입확인
		//변수명.getClase().getName()
		
		String A = "Java";
		int a = 5;
		
		System.out.println(name+a); //문자열+정수형 = 문자열
		System.out.println((name+a).getClass().getName()); //변수 타입확인
		
		/*-----------------------------------------------------*/
		
		//printf() 형식화 된 출력
		
		int b = 14;
		
		//8진수로 b를 표현
		System.out.printf("b:%o%n", b);
		System.out.printf("b:%x%n", b);
		
		/*-----------------------------------------------------*/
		
		//Scanner
		//Scanner sc 선언
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두자리 정수 입력 : ");
		String input = sc.nextLine(); //문자열로 입력받는 input 선언
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 : "+input); //입력받은 문자열 출력
		System.out.printf("num=%d%n", num); //입력받은 문자열을 정수로 변환시킨 값 출력
	}

}
