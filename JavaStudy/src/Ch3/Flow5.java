package Ch3;
import java.util.Scanner;

public class Flow5 {
	//��ø if�� => if�� �� ���� �� �ٸ� if�� ����
	//90�� �̻󿡼� 98�� �̻��� A+, 94�� �̸��� A-
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		//������ 90�� �̻��� ���
		if(score >= 90) {
			if(score >= 98) {
				//������ 90�� �̻󿡼� 98�� �̻��� ��� A+ ���
				System.out.println("A+�����Դϴ�");
			} else if(score <=94) {
				//������ 90�� �̻󿡼� 94�� ������ ��� A- ���
				System.out.println("A-�����Դϴ�");
			} else {
				//90�� �̻󿡼� ���� 2 ���� ������ ������ A ���
			System.out.println("A�����Դϴ�");
			}
		} else if (score >= 80 ) {
			if(score >= 88) {
				System.out.println("B+�����Դϴ�");
			} else if(score <=84) {
				System.out.println("B-�����Դϴ�");
			} else {
			System.out.println("B�����Դϴ�");
			}
		} else {
			System.out.println("D�����Դϴ�");
		}
	}
}
