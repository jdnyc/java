package Ch3;

import java.util.Scanner;

public class Flow14 {
	//for 반복문, 향상된 for문
	public static void main(String[] args) {
		
		int [] arr = {10, 20, 30, 40, 50};
		
		int sum = 0;
		
		//배열의 모든 요소 출력
		for(int i : arr) {
			System.out.println(i);
		}
		
		//배열의 모든 요소 합
		for(int i : arr) {
			sum = sum+i;
		}
		System.out.println("sum = "+sum);
	}
}
