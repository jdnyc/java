package Ch2;

public class Operator10 {
	//Math.round = 반올림해서 정수로 만드는 메소드
	//일의 자리에서 반올림하기 (int)Math.round(num/10.0) * 10
	//소수점 첫째자리까지 반올림 Math.round(pie*10)/10.0);
	public static void main(String[] args) {
		double pi = 3.141592;
		//3141.5에서 반올림해서 Math.round값은 3142가 된다
		double pi2 = Math.round(pi*1000)/1000.0;
		System.out.println(pi2);
	}
}
