package Ch2;

public class Operator5 {
	//���ս�
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b);
		
		/*���� 10*30�� 300
		 * ������ byte ���� -127~127 ����
		 * 300�� 100101100������
		 * 44��   00101100
		 * �׷��Ƿ� �� �ս� �߻� => ū �ڷ��� ����� �ؾ��ϴ� ����
		*/
		System.out.println(c);
	}

}
