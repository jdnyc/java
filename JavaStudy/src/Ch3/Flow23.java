package Ch3;

import java.util.Scanner;

public class Flow23 {
	//continue, menu
	public static void main(String[] args) {
		int menu = 0;

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) squaer");
			System.out.println("(2) suqare root");
			System.out.println("(2) log");
			
			menu = sc.nextInt();
			
			//0�� �Է½� ���α׷� ���� ��Ű�� ���ǹ����� ��������
			if(menu==0) {
				System.out.println("���α׷� ����");
				break;
			} //1, 3, 0 ���� ���� �ٸ��� ���ý� �Ʒ� ���� �߰� �ٽ� ���ǹ� ����
				else if (!(1<=menu && menu<=3)) {
				System.out.println("�޴� �߸�����, ����� 0");
				continue;
			}
			
			System.out.println("�����Ͻ� �޴��� "+menu+"�� �Դϴ�.");
		}
	}
}
