package Ch5;

//객체지향 프로그래밍
class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[]args)이 시작되었음");
		firstMethod(); //static 메서드는 객체 생성 없이 호출 가능
		System.out.println("main(String[]args)이 끝났음");
	}


	static void firstMethod() {
		//secondMethod()호출
		System.out.println("firstMethod()가 시작되었음");
		secondMethod();
		System.out.println("firstMethod()가 끝났음");
	}
	
	static void secondMethod() {
		System.out.println("secnondMethod()가 시작되었음");
		System.out.println("secondMethod()가 끝났음");
	}
}

