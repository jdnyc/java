package Ch3;
import java.util.Scanner;

public class Flow8 {
	//�ֹε�� ��ȣ�� ���� ���� Ȯ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ֹε�� ��ȣ�� �Է��ϼ���");
		System.out.println("000000-0000000");
		
		//�ֹε�Ϲ�ȣ
		String reg = sc.nextLine();
		//8��°�� 1�̸� ����, 2�� ����
		char sex = reg.charAt(7);
		
		switch(sex) {
			//int���� �ƴ� char�� �Է¹޾ұ⿡ ''�� �־����
			case '1':
				System.out.println("�����Դϴ�");
				break;
			case '2':
				System.out.println("�����Դϴ�");
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�");
		}	
	}
}
