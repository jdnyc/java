package Ch1;

import java.util.*;

public class Variable2 {

	public static void main(String[] args) {
		
		//����� ����� ���
		//��� �̸��� �׻� �빮��
		final int WIDTH = 20;
		final int HEIGHT = 10;
		
		//�ﰢ�� ���� ���ϴ� ����
		int triangleArea = (WIDTH * HEIGHT) / 2;
		//�簢�� ���� ���ϴ� ����
		int squareArea = WIDTH * HEIGHT;
		
		System.out.println(triangleArea);
		System.out.println(squareArea);
		
		System.out.println();
		
		//���λ�
		int octNum = 010; //8������ 10, 10������ 8
		int hexNum = 0x10; //16���� 10, 10���� 16
		
		//10���� ���
		System.out.println(octNum);
		System.out.println(hexNum);
		//8����, 16���� ���
		String rOctNum = Integer.toOctalString(octNum);
		String rHexNum = Integer.toHexString(hexNum);
		System.out.println(rOctNum);
		System.out.println(rHexNum);
		
		System.out.println();
		//���ͷ� Ÿ�� ����ġ (���� Ÿ�Կ� ����Ÿ�� �� ����)
		int i = 'A'; //���� 'A'�� �����ڵ� �����
		long l = 123; //int���� long ������ �б⿡ ���� ����
		
		//int i =0x123456789; //int Ÿ���� ������ �Ѵ� ���̱⿡ ����
		
		//���� ���ͷ�
		String s = ""; //���ڿ��� ������ ���� �� ���ڿ� ���� ����
		//char ch = ''; ���� ���ͷ��� �ݵ�� �ϳ��� ���ڰ� �ʿ���
		char ch = ' '; //���� ���ڷ� �ʱ�ȭ ����
		
		/*--------------------------------------------------*/
		
		//String
		//String ����
		String str = "Java";
		String str1 = new String("Java");

		//str, str1 �Ѵ� ���� �ǹ̷� ����
		System.out.println(str1);
		System.out.println(str);
		
		//���� ������
		String name = "Ja" + "va";
		String name1 = name + 8.0;
		
		System.out.println(name);
		System.out.println(name1);
		
		/*
		 * ���ڿ� + any type => ���ڿ� + ���ڿ�
		 * any type + ���ڿ� => ���ڿ� + ���ڿ�
		 */
		
		//���� Ÿ��Ȯ��
		//������.getClase().getName()
		
		String A = "Java";
		int a = 5;
		
		System.out.println(name+a); //���ڿ�+������ = ���ڿ�
		System.out.println((name+a).getClass().getName()); //���� Ÿ��Ȯ��
		
		/*-----------------------------------------------------*/
		
		//printf() ����ȭ �� ���
		
		int b = 14;
		
		//8������ b�� ǥ��
		System.out.printf("b:%o%n", b);
		System.out.printf("b:%x%n", b);
		
		/*-----------------------------------------------------*/
		
		//Scanner
		//Scanner sc ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� ���� �Է� : ");
		String input = sc.nextLine(); //���ڿ��� �Է¹޴� input ����
		int num = Integer.parseInt(input);
		
		System.out.println("�Է³��� : "+input); //�Է¹��� ���ڿ� ���
		System.out.printf("num=%d%n", num); //�Է¹��� ���ڿ��� ������ ��ȯ��Ų �� ���
	}

}
