package Ch3;

public class Flow17 {
	//while, 1���� ���ؼ� ���� �հ� 100 ������ ��
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		//i ���� �����ڷ� sum�� 100�̸��϶� �ݺ��� ����
		while((sum=sum+(++i))<100) {
			System.out.printf("%d - %d%n", i, sum);
		}
	}
}
