package Ch3;
import java.util.Scanner;

public class Flow2 {
	//���� ��� ����
	//���� �Է� ��, ������ ���� ���� ���
	public static void main(String[] args) {
		System.out.println("���� �Է�");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			//������ 90�� �̻��̸� A���� ���
			System.out.println("A�����Դϴ�");
		} else if (score >= 80 ) {
			//������ 80�� �̻��̸� B���� ���
			System.out.println("B�����Դϴ�");
		} else if (score >= 70 ) {
			//������ 70�� �̻��̸� C���� ���
			System.out.println("C�����Դϴ�");
		} else {
			//�� �� ������ D���� ���
			System.out.println("D�����Դϴ�");
		}
	}
}
