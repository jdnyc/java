package Ch3;
import java.util.Scanner;

public class Flow6 {
	//계절 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 월을 입력하세요");
		int month = sc.nextInt();
		
		switch(month) {
			//3,4,5 입력 시 "현재 계절은 봄입니다" 출력
			case 3:
			case 4:
			case 5:
				System.out.println("현재 계절은 봄입니다");
				break;
			//6,7,8 입력 시 "현재 계절은 여름입니다" 출력
			case 6:
			case 7:
			case 8:
				System.out.println("현재 계절은 여름입니다");
				break;
			//9,10,11 입력 시 "현재 계절은 가을입니다" 출력
			case 9:
			case 10:
			case 11:
				System.out.println("현재 계절은 가을입니다");
				break;
			//그 외 나머지 입력 시 "현제 계절은 겨울입니다" 출력
			default:
			case 12:
			case 1:
			case 2:
				System.out.println("현재 계절은 겨울입니다");
		}
	}
}
