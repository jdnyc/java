package Ch3;
import java.util.Scanner;

public class Flow4 {
	//if-else문
		public static void main(String[] args) {
			System.out.println("숫자 하나 입력");
			
			Scanner sc = new Scanner(System.in);
			
			int input = sc.nextInt();
			
			
			if(input==0) {
				//입력한 숫자가 0 이면 출력
				System.out.println("입력하신 숫자는 0 입니다");
			} else {
				//입력한 숫자가 0이 아니면 출력
				System.out.printf("입력하신 숫자는 %d입니다", input);
			}

			//괄호 제거도 가능
			if(input==0) 
				//입력한 숫자가 0 이면 출력
				System.out.println("입력하신 숫자는 0 입니다");
			else 
				//입력한 숫자가 0이 아니면 출력
				System.out.printf("입력하신 숫자는 %d입니다", input);
		}	
}
