package Ch3;

public class Flow1 {
	//���ǹ�
	public static void main(String[] args) {
		int x=0;
		
		System.out.printf("x=%d�϶�, ���� ���� %n", x);
		
		//{} �����ص� ��
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		//x�� 0�� �ƴϴ�
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		/*---------------------------------------------*/
		//���
		int score = 60;
		//��ȣ ���� ����
		if(score>60)
			System.out.println("�հ�");
		//��ȣ ���� �� ���� �ۼ�
		if(score>60) System.out.println("�հ�");
	}

}
