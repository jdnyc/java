package Ch3;

public class Flow25 {
	//반복문 이름, menu
	public static void main(String[] args) {
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					//Loop1을 완전히 빠져나간다 (바깥쪽 반복문 빠져나감
					//break Loop1;
				//2중 반복문의 안쪽 반복문을 빠져나감
				break;
				//Loop1 바깥쪽 반복문을 계속 진행
				//continue Loop1;
				//안쪽 반복문 계속 실행
				//continue;
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
	}
}
