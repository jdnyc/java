package Ch3;

import java.util.Scanner;

public class Flow24 {
	//반복문 이름
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("(1) squaer");
			System.out.println("(2) suqare root");
			System.out.println("(3) log");
			
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
			
			for(;;) {
				System.out.println("계산할 값 입력 (계산 종료:0, 전체 종료:99)");
				
				num = sc.nextInt();
				
				if(num==0)
					break;
				if(num==99)
					break outer;
				switch(menu) {
				//제곱 구함
				case 1: System.out.println("result: " + num*num);
						break;
				//root 구함
				case 2: System.out.println("result: " + Math.sqrt(num));
						break;
				//log 구함
				case 3: System.out.println("result: " + Math.log(num));
						break;
				}
			}
		}
	}
}
