package Ch3;

import java.util.Scanner;

public class Flow11 {
	//for �ݺ���, �� ���
	public static void main(String[] args) {
		int num = 0;
		
		System.out.println("*�� ����� ������ �� �Է�");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		//num ���� ��ŭ �� ���
		for(int i=0; i<num; i++) {
			//i�� ���ڸ�ŭ ���� �÷���
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
