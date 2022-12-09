package Ch3;

import java.util.Scanner;

public class Flow18 {
	//while, 1부터 더해서 누적 합계 100 이하의 값
	public static void main(String[] args) {
		int num;
		int sum=0;
		//while문의 조건식으로 사용 될 boolean 변수
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.print(">>");
			
			num = sc.nextInt();
			
			if(num!=0) {
				sum = sum+num;
			} else {
				//0을 입력하면 여태까지의 합계를 구함
				flag = false;
			}
		}
		
		System.out.println("합계 : " + sum);
	}
}
