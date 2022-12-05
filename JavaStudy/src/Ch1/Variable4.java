package Ch1;

public class Variable4 {
	public static void main(String args[]) {
		double d = 85.4; //실수형 변수 d 선언
		int score = (int) d; //실수형인 double형 변수를 정수형인 int형 변수로 형변환
		
		System.out.println("score = "+score);
		System.out.println("d = "+d);
		
		/*---------------------------------------------------*/
		//값손실
		//큰 타입에서 작은 타입으로 변환
		int i = 10;
		byte b = (byte)i;
		System.out.println("int 10 -> byte = " + b);
		//작은 타입에서 큰 타입으로 변환
		b = 10;
		i = (int)b;
		System.out.println("byte 10 -> int = "+i);
		
		b = -2;
		i = (int)b;
		System.out.println("byte -2 -> int = "+i);
		
		//byte -2를 int형으로 형 변환 한 것 Integer 클래스 사용하여 2진수 표현
		//2의 보수법 때문에 앞은 1로 표현
		System.out.println("i = "+Integer.toBinaryString(i));
		
		float f = 9.1234567f;
		double d1 = 9.1234567;
		double d2 = (double) f;
		
		System.out.printf("f = %20.18f\n", f);
		//20자리 중 18자리는 소수점 이하 수 출력
		System.out.printf("d1 = %20.18f\n", d1);
		System.out.printf("d2 = %20.18f\n", d2);
		
		int a = 91234567;
		//8자리 정수
		float f1 = (float)a;
		//int를 float으로 변환
		int i2 = (int) f1;
		//float으로 변환한 f1 다시 int로 변환
		
		double dd = (double)a;
		//int를 double로 변환
		int i3 = (int) dd;
		//double로 변환한 dd 다시 int로 변환
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("a = %d\n", a);
		System.out.printf("f1 = %f i2 = %d\n", f1, i2);
		System.out.printf("dd = %f i3 = %d\n", f1, i3);
		//i3과 i2는 정밀도 때문에 값이 다름을 알 수 있다
		System.out.printf("(int)%f = %d\n", f2, i4);
		//float을 int로 형변환할때 반올림이 발생하지 않음을 알 수 있다

		
	}
}
