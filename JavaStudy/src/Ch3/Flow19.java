package Ch3;

import java.util.Scanner;

public class Flow19 {
	//do-while, ���� ���߱�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0, answer = 0;
		
		//1���� 100 ������ ������ �� ����, random�� 0���� �����ϱ⿡ +1����
		answer = (int)(Math.random() * 100) + 1; 
		
		do {
			System.out.print("1�� 100���� ���� �Է� >>");
			input = sc.nextInt();
			if(input > answer) {
				System.out.println("�� ������");
			} else if(input < answer) {
				System.out.println("�� ū��");
			}
		} while(input!=answer);
		
		System.out.println("����");	
	}
}
