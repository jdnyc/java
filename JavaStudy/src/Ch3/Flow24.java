package Ch3;

import java.util.Scanner;

public class Flow24 {
	//�ݺ��� �̸�
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("(1) squaer");
			System.out.println("(2) suqare root");
			System.out.println("(3) log");
			
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
			
			for(;;) {
				System.out.println("����� �� �Է� (��� ����:0, ��ü ����:99)");
				
				num = sc.nextInt();
				
				if(num==0)
					break;
				if(num==99)
					break outer;
				switch(menu) {
				//���� ����
				case 1: System.out.println("result: " + num*num);
						break;
				//root ����
				case 2: System.out.println("result: " + Math.sqrt(num));
						break;
				//log ����
				case 3: System.out.println("result: " + Math.log(num));
						break;
				}
			}
		}
	}
}
