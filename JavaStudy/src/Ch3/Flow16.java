package Ch3;

import java.util.Scanner;

public class Flow16 {
	//while, �� �ڸ����� ��
	public static void main(String[] args) {
		int num=0, sum=0;
		System.out.println("���ڸ� �Է�");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			
			sum+=num%10; //sum = sum+num%10 �� �ڸ����� ��
			//%3d�� 3�ڸ��� ǥ��
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			//10�� ������ ������ �ڸ� �� ����
			num/=10;
		}
		
		System.out.println("�� �ڸ����� ��: "+sum);
	}
}
