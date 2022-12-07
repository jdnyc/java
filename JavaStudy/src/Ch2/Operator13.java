package Ch2;

public class Operator13 {
	//실수형 비교
	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		//10.0f는 오차없이 저장
		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);
		//0.1f는 2진수로 변환하는 과정에서 오차가 발생
		System.out.printf("0.1==0.1f %b%n", 0.1==0.1f);
		//%19.17f => 19자리 수 중 17자리는 소수점 이하 수를 출력
		System.out.printf("f=%19.17f%n", f);
		System.out.printf("d=%19.17f%n", d);
		System.out.printf("d2=%19.17f%n", d2);
		System.out.printf("d==f %b%n", d==f);
		System.out.printf("d==d2 %b%n", d==d2);
		System.out.printf("d2==f %b%n", d2==f);
		System.out.printf("(float)d==f %b%n", (float)d==f);
	}
}
