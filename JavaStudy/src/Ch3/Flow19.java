package Ch3;

import java.util.Scanner;

public class Flow19 {
	//do-while, 숫자 맞추기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0, answer = 0;
		
		//1에서 100 사이의 임의의 수 저장, random은 0부터 시작하기에 +1해줌
		answer = (int)(Math.random() * 100) + 1; 
		
		do {
			System.out.print("1과 100사이 정수 입력 >>");
			input = sc.nextInt();
			if(input > answer) {
				System.out.println("더 작은수");
			} else if(input < answer) {
				System.out.println("더 큰수");
			}
		} while(input!=answer);
		
		System.out.println("정답");	
	}
}
