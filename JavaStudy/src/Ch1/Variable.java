package Ch1;

public class Variable {
	public static void main(String args[]) {
		int year = 0;
		//변수 year 값 0으로 초기화
		int age = 14;
		//변수 age 값 14로 초기화
		
		System.out.println(year);
		System.out.println(age);
		//출력
		
		System.out.println();
		
		year = age+2000;
		//변수 age 값에 2000을 더해 변수 year에 저장
		//즉 14+2000 
		age = age+1;
		//변수 age에 저장된 값을 1 증가
		//즉 14+1
		System.out.println(year);
		System.out.println(age);
		
		/*----------------------------------------*/
		
		int x = 20, y = 10;
		int tmp = 0; // 임시 값 저장을 위한 변수 선언
		
		tmp = x; //x에 있는 값 tmp에 저장
		x = y; //0이 된 x에 y값 저장
		y= tmp; //x에 값을 주고 0이 된 y에 x값이 들어있는 tmp값 저장

		System.out.println("x =" + x +"," + "y =" + y);
		//x와 y의 값 변환 확인
	}
}
