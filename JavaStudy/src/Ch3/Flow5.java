package Ch3;
import java.util.Scanner;

public class Flow5 {
	//중첩 if문 => if문 블럭 내에 또 다른 if문 포함
	//90점 이상에서 98점 이상은 A+, 94점 미만은 A-
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		//점수가 90점 이상일 경우
		if(score >= 90) {
			if(score >= 98) {
				//점수가 90점 이상에서 98점 이상일 경우 A+ 출력
				System.out.println("A+학점입니다");
			} else if(score <=94) {
				//점수가 90점 이상에서 94점 이하일 경우 A- 출력
				System.out.println("A-학점입니다");
			} else {
				//90점 이상에서 위의 2 조건 제외한 나머지 A 출력
			System.out.println("A학점입니다");
			}
		} else if (score >= 80 ) {
			if(score >= 88) {
				System.out.println("B+학점입니다");
			} else if(score <=84) {
				System.out.println("B-학점입니다");
			} else {
			System.out.println("B학점입니다");
			}
		} else {
			System.out.println("D학점입니다");
		}
	}
}
