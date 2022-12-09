package Ch3;

import java.util.Scanner;

public class Flow11 {
	//for 반복문, 별 찍기
	public static void main(String[] args) {
		int num = 0;
		
		System.out.println("*을 출력할 라인의 수 입력");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		//num 숫자 만큼 행 출력
		for(int i=0; i<num; i++) {
			//i의 숫자만큼 별을 늘려감
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
