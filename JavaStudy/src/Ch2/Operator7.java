package Ch2;

public class Operator7 {
	//�ڷ��� ���ս�
	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		//int Ÿ������ ���� => �����÷ο� �߻�
		long b = 1_000_000 * 1_000_000L;
		//int*long Ÿ���̱⿡ Long Ÿ������ ����
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		//int���� ����
		//2,147,483,648 ~ 2,147,483,647
		int x = 1000000;
		int result1 = x*x/x;
		int result2 = x/x*x;
		System.out.println(result1);
		//�����÷ο� �߻� �� ������
		System.out.println(result2);
		//�����÷ο� �߻����� ����
	}

}
