package Ch2;

public class Operator12 {
	//�� ������
	public static void main(String[] args) {
		//%b�� boolean�� ���
		//������, �Ǽ��� ��
		System.out.printf("10 == 10.0f \t %b%n", 10==10.0f);
		//������, ������ ��
		System.out.printf("'0' == 0 \t %b%n", '0'==0);
		//������, �ڵ� ��
		System.out.printf("'A' == 65 \t %b%n", 'A'==65);
		//������, ������ ��
		System.out.printf("'A' > 'B' \t %b%n", 'A'>'B');
		//������, ������ �ٸ��� ��
		System.out.printf("'A'+1 != 'B' \t %b%n", 'A'+1 != 'B');
	}
}
