package Ch3;
import java.util.Scanner;

public class Flow7 {
	//����������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����(1), ����(2), ��(3)�� �Է��ϼ���");
		int user = sc.nextInt();
		/*
		 * Math.random() �޼���� 0.0�� 1.0���� ������ ���ϴ� �ϳ��� double�� ��ȯ
		 * �׷��Ƿ� 1~3 ���� ������ ���ϱ� ���ϸ� 0.0<=Math.random()<1.0�� 3�� ������
		 * �׷��� 0.0<=Math.random()*3<3.0�� �Ǵµ�
		 * 1���� 3������ ���� ���;� �ϱ⿡ 1�� �����ش�
		 * 1 <=(int)(Math.random()*3)+1 < 4
		 * �׷��� (int)(Math.random()*3)+1�� �Ǵ� ��
		 */
		int com = (int)(Math.random()*3)+1;
		
		switch(user) {
			case 1:
				System.out.println("����� �����Դϴ�");
			break;
			case 2:
				System.out.println("����� �����Դϴ�");
			break;
			case 3:
				System.out.println("����� ���Դϴ�");
		}
		
		switch(com) {
		case 1:
			System.out.println("��ǻ�ʹ� �����Դϴ�");
		break;
		case 2:
			System.out.println("��ǻ�ʹ� �����Դϴ�");
		break;
		case 3:
			System.out.println("��ǻ�� ���Դϴ�");
		}
	
		switch(user-com) {
		case 2:	case -1:
			System.out.println("��");
			break;
		case 1: case -2:
			System.out.println("�̱�");
			break;
		case 0:
			System.out.println("���");
		}
	}
}
