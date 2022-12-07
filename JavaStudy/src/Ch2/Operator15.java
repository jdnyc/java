package Ch2;

import java.util.Scanner;

public class Operator15 {
	//입력한 문자가 숫자, 영문자인지 확인
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = ' ';
		System.out.println("입력하세요");
		
		//Scanner로 입력받을 때는 String 타입으로 밖에 받을 수 없다
		//nextLine은 엔터를 치기 전까지 쓴 문자열을 모두 리턴
		//next 메소드는 스페이스 전까지 입력받은 것 리턴
		String str = sc.nextLine();
		//charAt은 String 으로 저장된 문자열 중 한글자만 선택해서 char타입으로 변환
		ch = str.charAt(0);
		
		if('0'<=ch&&ch<='9') {
			System.out.println("숫자입니다");
		} else if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')) {
			System.out.println("영문자입니다");
		}
	}
}
