package Ch5;

//객체지향 프로그래밍
class CallStackTest {
	public static void main(String[] args) {
		//main이 firstMethod()호출
		firstMethod(); //static 메서드는 객체 생성 없이 호출 가능
	}


	static void firstMethod() {
		//secondMethod()호출
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}

