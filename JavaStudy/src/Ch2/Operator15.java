package Ch2;

import java.util.Scanner;

public class Operator15 {
	//�Է��� ���ڰ� ����, ���������� Ȯ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = ' ';
		System.out.println("�Է��ϼ���");
		
		//Scanner�� �Է¹��� ���� String Ÿ������ �ۿ� ���� �� ����
		//nextLine�� ���͸� ġ�� ������ �� ���ڿ��� ��� ����
		//next �޼ҵ�� �����̽� ������ �Է¹��� �� ����
		String str = sc.nextLine();
		//charAt�� String ���� ����� ���ڿ� �� �ѱ��ڸ� �����ؼ� charŸ������ ��ȯ
		ch = str.charAt(0);
		
		if('0'<=ch&&ch<='9') {
			System.out.println("�����Դϴ�");
		} else if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')) {
			System.out.println("�������Դϴ�");
		}
	}
}
