package Ch3;

import java.util.Scanner;

public class Flow23 {
	//continue, menu
	public static void main(String[] args) {
		int menu = 0;

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) squaer");
			System.out.println("(2) suqare root");
			System.out.println("(2) log");
			
			menu = sc.nextInt();
			
			//0번 입력시 프로그램 종료 시키고 조건문에서 빠져나옴
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			} //1, 3, 0 선택 말고 다른거 선택시 아래 문구 뜨고 다시 조건문 실행
				else if (!(1<=menu && menu<=3)) {
				System.out.println("메뉴 잘못선택, 종료는 0");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 "+menu+"번 입니다.");
		}
	}
}
