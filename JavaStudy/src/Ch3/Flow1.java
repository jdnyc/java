package Ch3;

public class Flow1 {
	//조건문
	public static void main(String[] args) {
		int x=0;
		
		System.out.printf("x=%d일때, 참인 것은 %n", x);
		
		//{} 생략해도 됨
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		//x는 0이 아니다
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		/*---------------------------------------------*/
		//블록
		int score = 60;
		//괄호 생략 가능
		if(score>60)
			System.out.println("합격");
		//괄호 생략 및 한줄 작성
		if(score>60) System.out.println("합격");
	}

}
