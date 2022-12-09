package Ch3;

public class Flow17 {
	//while, 1부터 더해서 누적 합계 100 이하의 값
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		//i 증가 연산자로 sum이 100미만일때 반복문 수행
		while((sum=sum+(++i))<100) {
			System.out.printf("%d - %d%n", i, sum);
		}
	}
}
