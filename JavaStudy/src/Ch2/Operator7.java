package Ch2;

public class Operator7 {
	//자료형 값손실
	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		//int 타입으로 계산됨 => 오버플로우 발생
		long b = 1_000_000 * 1_000_000L;
		//int*long 타입이기에 Long 타입으로 계산됨
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		//int형의 범위
		//2,147,483,648 ~ 2,147,483,647
		int x = 1000000;
		int result1 = x*x/x;
		int result2 = x/x*x;
		System.out.println(result1);
		//오버플로우 발생 후 나눗셈
		System.out.println(result2);
		//오버플로우 발생하지 않음
	}

}
