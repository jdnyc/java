package Ch1;

public class Variable4 {
	public static void main(String args[]) {
		double d = 85.4; //�Ǽ��� ���� d ����
		int score = (int) d; //�Ǽ����� double�� ������ �������� int�� ������ ����ȯ
		
		System.out.println("score = "+score);
		System.out.println("d = "+d);
		
		/*---------------------------------------------------*/
		//���ս�
		//ū Ÿ�Կ��� ���� Ÿ������ ��ȯ
		int i = 10;
		byte b = (byte)i;
		System.out.println("int 10 -> byte = " + b);
		//���� Ÿ�Կ��� ū Ÿ������ ��ȯ
		b = 10;
		i = (int)b;
		System.out.println("byte 10 -> int = "+i);
		
		b = -2;
		i = (int)b;
		System.out.println("byte -2 -> int = "+i);
		
		//byte -2�� int������ �� ��ȯ �� �� Integer Ŭ���� ����Ͽ� 2���� ǥ��
		//2�� ������ ������ ���� 1�� ǥ��
		System.out.println("i = "+Integer.toBinaryString(i));
		
		float f = 9.1234567f;
		double d1 = 9.1234567;
		double d2 = (double) f;
		
		System.out.printf("f = %20.18f\n", f);
		//20�ڸ� �� 18�ڸ��� �Ҽ��� ���� �� ���
		System.out.printf("d1 = %20.18f\n", d1);
		System.out.printf("d2 = %20.18f\n", d2);
		
		int a = 91234567;
		//8�ڸ� ����
		float f1 = (float)a;
		//int�� float���� ��ȯ
		int i2 = (int) f1;
		//float���� ��ȯ�� f1 �ٽ� int�� ��ȯ
		
		double dd = (double)a;
		//int�� double�� ��ȯ
		int i3 = (int) dd;
		//double�� ��ȯ�� dd �ٽ� int�� ��ȯ
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("a = %d\n", a);
		System.out.printf("f1 = %f i2 = %d\n", f1, i2);
		System.out.printf("dd = %f i3 = %d\n", f1, i3);
		//i3�� i2�� ���е� ������ ���� �ٸ��� �� �� �ִ�
		System.out.printf("(int)%f = %d\n", f2, i4);
		//float�� int�� ����ȯ�Ҷ� �ݿø��� �߻����� ������ �� �� �ִ�

		
	}
}
