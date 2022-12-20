package Ch5;

class TvTest2{
	public static void main (String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		//int형의 기본값인 0으로 초기화 되어있음
		System.out.println("t1의 channel값은" + t1.channel+"입니다.");
		System.out.println("t2의 channel값은" + t2.channel+"입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 채널값을 7로 변경");
		
		//같은 클래스로부터 생성되었어도, 각 인스턴스의 속성은 서로 다른 값을 유지 가능
		System.out.println("t1의 channel값은" + t1.channel+"입니다.");
		System.out.println("t2의 channel값은" + t2.channel+"입니다.");
	}
}
