package Ch2;

public class Operator6 {
	//������ ��Ģ����
	public static void main(String[] args) {
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';

		//d�� �ڵ� 100, a�� �ڵ� 97
		System.out.println(d-a);
		//���� 2 �ڵ�� 50, ���� 0 �ڵ�� 48
		System.out.println(two-zero);
		//���ڵ��� �ڵ� Ȯ��
		System.out.println((int)a);
		System.out.println((int)d);
		System.out.println((int)zero);
		System.out.println((int)two);
		
		char c1 = 'a';
		
		//������ ����
		//char c2 =  c1+1;
		
		char c2 = 'a'+1;
		System.out.println(c2);
	}
}
