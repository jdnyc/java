package Ch3;

public class Flow10 {
	//for 반복문 (1~10까지 합)
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum = sum+i;
			System.out.printf("1부터 %d 까지의 합: %d%n",i, sum);
		}
	}
}
