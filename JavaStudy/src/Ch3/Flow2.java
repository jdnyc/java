package Ch3;
import java.util.Scanner;

public class Flow2 {
	//점수 출력 예제
	//점수 입력 후, 점수에 대한 학점 출력
	public static void main(String[] args) {
		System.out.println("점수 입력");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			//점수가 90점 이상이면 A학점 출력
			System.out.println("A학점입니다");
		} else if (score >= 80 ) {
			//점수가 80점 이상이면 B학점 출력
			System.out.println("B학점입니다");
		} else if (score >= 70 ) {
			//점수가 70점 이상이면 C학점 출력
			System.out.println("C학점입니다");
		} else {
			//그 외 점수는 D학점 출력
			System.out.println("D학점입니다");
		}
	}
}
