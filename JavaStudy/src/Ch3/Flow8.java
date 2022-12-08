package Ch3;
import java.util.Scanner;

public class Flow8 {
	//주민등록 번호를 통한 성별 확인
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록 번호를 입력하세요");
		System.out.println("000000-0000000");
		
		//주민등록번호
		String reg = sc.nextLine();
		//8번째가 1이면 남자, 2면 여자
		char sex = reg.charAt(7);
		
		switch(sex) {
			//int형이 아닌 char로 입력받았기에 ''가 있어야함
			case '1':
				System.out.println("남자입니다");
				break;
			case '2':
				System.out.println("여자입니다");
				break;
			default:
				System.out.println("잘못입력하셨습니다");
		}	
	}
}
