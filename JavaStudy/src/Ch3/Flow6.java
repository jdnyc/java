package Ch3;
import java.util.Scanner;

public class Flow6 {
	//���� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� �Է��ϼ���");
		int month = sc.nextInt();
		
		switch(month) {
			//3,4,5 �Է� �� "���� ������ ���Դϴ�" ���
			case 3:
			case 4:
			case 5:
				System.out.println("���� ������ ���Դϴ�");
				break;
			//6,7,8 �Է� �� "���� ������ �����Դϴ�" ���
			case 6:
			case 7:
			case 8:
				System.out.println("���� ������ �����Դϴ�");
				break;
			//9,10,11 �Է� �� "���� ������ �����Դϴ�" ���
			case 9:
			case 10:
			case 11:
				System.out.println("���� ������ �����Դϴ�");
				break;
			//�� �� ������ �Է� �� "���� ������ �ܿ��Դϴ�" ���
			default:
			case 12:
			case 1:
			case 2:
				System.out.println("���� ������ �ܿ��Դϴ�");
		}
	}
}
