package Ch3;
import java.util.Scanner;

public class Flow3 {
	//���ǹ�
	public static void main(String[] args) {
		int input;
		
		System.out.println("���� �ϳ� �Է�");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		//�Է¹��� ���ڸ� ���������� ��ȯ
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
		}
		
		if(input!=0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input);
		}
	}
}
