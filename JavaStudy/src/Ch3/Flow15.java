package Ch3;

import java.util.Scanner;

public class Flow15 {
	//while 반복문 감소 연산자
	public static void main(String[] args) {
		int i=5;
		/*
		//i 감소가 0이 아니면 조건식 반복
		while(i--!=0) {
			System.out.println(i + " - I can do it.");
		}
		*/
		while(i!=0){
			i--;
			System.out.println(i + " - I can do it.");
		}
	}
}
