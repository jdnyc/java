package Ch3;

public class Flow10 {
	//for �ݺ��� (1~10���� ��)
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum = sum+i;
			System.out.printf("1���� %d ������ ��: %d%n",i, sum);
		}
	}
}
