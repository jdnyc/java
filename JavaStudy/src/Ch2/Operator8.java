package Ch2;

public class Operator8 {
	//�ڷ��� ���ս�
	public static void main(String[] args) {
		char c1 = 'a';
		//c2�� c1 ����
		char c2 = c1;
		//c3�� ���� ����
		char c3 = ' ';
		
		int i = c1+1;
		
		c3 = (char)(c1+1);
		c2++;
		c2++;
		//a=97 �׷��Ƿ� 97+1�� 98
		System.out.println("i="+i);
		//97�� �ι� �����Ͽ� 99�� �ǰ� ���ڴ� c
		System.out.println("c2="+c2);
		//98�� �������� b
		System.out.println("c3="+c3);
	}
}
