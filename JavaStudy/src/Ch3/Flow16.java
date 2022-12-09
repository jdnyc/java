package Ch3;

import java.util.Scanner;

public class Flow16 {
	//while, 각 자리수의 합
	public static void main(String[] args) {
		int num=0, sum=0;
		System.out.println("숫자를 입력");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			
			sum+=num%10; //sum = sum+num%10 각 자리수의 합
			//%3d는 3자리만 표현
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			//10을 나눠서 나머지 자리 수 구함
			num/=10;
		}
		
		System.out.println("각 자리수의 합: "+sum);
	}
}
