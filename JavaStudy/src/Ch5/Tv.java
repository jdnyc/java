package Ch5;

//객체지향 프로그래밍
class Tv {
	//Tv의 속성(멤버변수)
	String color; //색깔
	Boolean power; //전원상태
	int channel; //채널
	
	//Tv의 기능(메서드)
	void power() {power = !power;} //Tv를 키거나 끄는 기능
	void channelUp() {channel++;} //채널을 높이는 기능
	void channelDow() {channel--;} //채널을 낮추는 기능
}

class TvTest{
	public static void main(String args[]) {
		Tv t;	//Tv인스턴스를 참조하기 위한 변수 t 선언
		t = new Tv();	//Tv인스턴스 생성
		t.channel = 7;	//channel값 7로 한다
		t.channelDow();//channel down
		System.out.println("현재 채널은 "+t.channel+"입니다.");
	}
}
