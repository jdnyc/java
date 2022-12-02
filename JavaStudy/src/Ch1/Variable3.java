package Ch1;

public class Variable3 {
	public static void main(String args[]) {
		//논리형
		boolean power = true; //power는 true 값을 가짐
		/*
		 * boolean power = FALSE; boolean은 소문자 true/false 값만 가능하기에 에러
		 */
		
		//문자형
		char c = 'A'; //문자 'A'를 char 타입 변수 c에 저장
		char c2 = 65;
		System.out.println(c2); //정수로 초기화 해도 문자로 출력 (유니코드 값)
		System.out.println(c+3); //유니코드 정수에 정수를 더하면 정수값이 나옴
		//문자의 유니코드 아는 법
		int code = (int)c;
		System.out.println(code);
		
		//특수문자 다루기
		System.out.println('\''); //작은따옴표 출력
		System.out.println('\n'); //개행
		System.out.println("\"Hello\""); //큰따옴표 출력
		System.out.println("c:\\"); //역슬래쉬 출력
		
		/*------------------------------------------------------------*/
		//오버플로우
		short sMin = -32768; //short 범위에서 최소값
		short sMax = 32767; //short 범위에서 최대값
		char cMin = 0; //char 범위에서 최소값
		char cMax = 65535; //char 범위에서 최대값
		
		/*
		 * 최소값-1 = 최대값
		 * 최대값+1 = 최소값
		 */
		System.out.println("sMin = "+sMin);
		System.out.println("sMin-1 = "+(short)(sMin-1)); //최소값-1 = 최대값 (short최대값)
		System.out.println("sMax = "+sMax);
		System.out.println("sMax+1 = "+(short)(sMax+1)); //최대값+1 = 최소값 (short최소값)
		System.out.println("cMin = "+(int)cMin);
		System.out.println("cMin-1 = "+(int)--cMin); //최소값-1 = 최대값 (char최대값)
		System.out.println("cMax = "+(int)cMax);
		System.out.println("cMax+1 = "+(int)++cMax); //최대값+1 = 최소값 (short최소값)
		
		//실수형
		/*
		 * float 정밀도 7자리
		 * double 정밀도 15자리
		 */
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.printf("       123456789012345678901234%n");
		System.out.printf("f  : %f%n", f); //소숫점 이하 6째 자리까지 출력하고 7자리에서 반올림함
		System.out.printf("f  : %24.20f%n", f); //%24.20f = 24자리 중 20자리는 소수점 이하 수를 출력하라
		//원래 저장한 값과 오차가 생겨서 출력된다
		System.out.printf("f2 : %24.20f%n", f2); //원래 저장한 값과 오차가 생겨서 출력된다
		System.out.printf("d  : %24.20f%n", d); //소숫점 이하 14째 자리까지 출력하고 15자리에서 반올림함
	}
}
