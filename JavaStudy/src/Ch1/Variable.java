package Ch1;

public class Variable {
	public static void main(String args[]) {
		int year = 0;
		//���� year �� 0���� �ʱ�ȭ
		int age = 14;
		//���� age �� 14�� �ʱ�ȭ
		
		System.out.println(year);
		System.out.println(age);
		//���
		
		System.out.println();
		
		year = age+2000;
		//���� age ���� 2000�� ���� ���� year�� ����
		//�� 14+2000 
		age = age+1;
		//���� age�� ����� ���� 1 ����
		//�� 14+1
		System.out.println(year);
		System.out.println(age);
		
		/*----------------------------------------*/
		
		int x = 20, y = 10;
		int tmp = 0; // �ӽ� �� ������ ���� ���� ����
		
		tmp = x; //x�� �ִ� �� tmp�� ����
		x = y; //0�� �� x�� y�� ����
		y= tmp; //x�� ���� �ְ� 0�� �� y�� x���� ����ִ� tmp�� ����

		System.out.println("x =" + x +"," + "y =" + y);
		//x�� y�� �� ��ȯ Ȯ��
	}
}
