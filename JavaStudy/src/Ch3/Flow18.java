package Ch3;

import java.util.Scanner;

public class Flow18 {
	//while, 1���� ���ؼ� ���� �հ� 100 ������ ��
	public static void main(String[] args) {
		int num;
		int sum=0;
		//while���� ���ǽ����� ��� �� boolean ����
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.print(">>");
			
			num = sc.nextInt();
			
			if(num!=0) {
				sum = sum+num;
			} else {
				//0�� �Է��ϸ� ���±����� �հ踦 ����
				flag = false;
			}
		}
		
		System.out.println("�հ� : " + sum);
	}
}
