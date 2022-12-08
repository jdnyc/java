package Ch3;
import java.util.Scanner;

public class Flow7 {
	//가위바위보
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위(1), 바위(2), 보(3)를 입력하세요");
		int user = sc.nextInt();
		/*
		 * Math.random() 메서드는 0.0과 1.0사이 범위에 속하는 하나의 double값 반환
		 * 그러므로 1~3 사이 정수를 구하기 원하면 0.0<=Math.random()<1.0에 3을 곱해줌
		 * 그러면 0.0<=Math.random()*3<3.0이 되는데
		 * 1에서 3사이의 값을 얻어와야 하기에 1을 더해준다
		 * 1 <=(int)(Math.random()*3)+1 < 4
		 * 그래서 (int)(Math.random()*3)+1이 되는 것
		 */
		int com = (int)(Math.random()*3)+1;
		
		switch(user) {
			case 1:
				System.out.println("당신은 가위입니다");
			break;
			case 2:
				System.out.println("당신은 바위입니다");
			break;
			case 3:
				System.out.println("당신은 보입니다");
		}
		
		switch(com) {
		case 1:
			System.out.println("컴퓨터는 가위입니다");
		break;
		case 2:
			System.out.println("컴퓨터는 바위입니다");
		break;
		case 3:
			System.out.println("컴퓨터 보입니다");
		}
	
		switch(user-com) {
		case 2:	case -1:
			System.out.println("짐");
			break;
		case 1: case -2:
			System.out.println("이김");
			break;
		case 0:
			System.out.println("비김");
		}
	}
}
