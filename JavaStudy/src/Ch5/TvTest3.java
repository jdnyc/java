package Ch5;

class TvTest3{
	public static void main (String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		//int형의 기본값인 0으로 초기화 되어있음
		System.out.println("t1의 channel값은" + t1.channel+"입니다.");
		System.out.println("t2의 channel값은" + t2.channel+"입니다.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경");
		
		// t2는 t1이 참조하고 있던 인스턴스를 같이 참조하게 된다
		System.out.println("t1의 channel값은" + t1.channel+"입니다.");
		System.out.println("t2의 channel값은" + t2.channel+"입니다.");
	}
}
