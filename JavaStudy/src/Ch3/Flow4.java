package Ch3;
import java.util.Scanner;

public class Flow4 {
	//if-else��
		public static void main(String[] args) {
			System.out.println("���� �ϳ� �Է�");
			
			Scanner sc = new Scanner(System.in);
			
			int input = sc.nextInt();
			
			
			if(input==0) {
				//�Է��� ���ڰ� 0 �̸� ���
				System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�");
			} else {
				//�Է��� ���ڰ� 0�� �ƴϸ� ���
				System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�", input);
			}

			//��ȣ ���ŵ� ����
			if(input==0) 
				//�Է��� ���ڰ� 0 �̸� ���
				System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�");
			else 
				//�Է��� ���ڰ� 0�� �ƴϸ� ���
				System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�", input);
		}	
}
