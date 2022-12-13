package Ch4;

import java.util.Arrays;

public class Array2 {
	//배열
	public static void main(String[] args) {
		//배열이름.length
		int [] score = new int[5];
		
		//배열의 길이를 직접 적어주는 것 보다 배열이름.length 사용
		for(int i=0; i<score.length; i++){
			System.out.println(score[i]);
		}
		//배열의 생성,초기화 동시
		int[] a = new int[]{50, 60, 70, 80, 90};
		/* new int[] 생략가능
		 * int[] score = {50, 60, 70, 80, 90}; 
		*/
		
		//배열의 선언, 생성 따로하는 경우
		int[] b; //배열 b 선언
		b = new int[] {50,60}; //가능
		/*
		 * 불가능
		 * b = {50,60};
		 */
		
		//길이가 0인 배열 선언
		//셋다 가능
		int[] c = new int[0];
		int[] d = new int[] {};
		int[] e = {};
		
		//배열의 출력
		//for문 이용
		int [] iArr = {100, 95, 80, 70, 60};

		//for문 이용한 배열의 요소 순서대로 하나씩 출력
		for(int i=0; i<iArr.length; i++){
			System.out.println(iArr[i]);
		}
		
		//메서드사용
		System.out.println(Arrays.toString(iArr));
		
		//바로 배열의 이름 출력
		System.out.println(iArr);
		
		//char형 배열의 이름 바로 출력
		char[] chArr= {'a', 'b'};
		System.out.println(chArr);
	}

}
