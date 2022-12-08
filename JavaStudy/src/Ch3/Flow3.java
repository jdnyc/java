package Ch3;
import java.util.Scanner;

public class Flow3 {
	//조건문
	public static void main(String[] args) {
		int input;
		
		System.out.println("숫자 하나 입력");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		//입력받은 숫자를 정수형으로 변환
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다");
		}
		
		if(input!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		}
	}
}
