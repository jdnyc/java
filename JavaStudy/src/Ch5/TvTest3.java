package Ch5;

class TvTest3{
	public static void main (String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		//int���� �⺻���� 0���� �ʱ�ȭ �Ǿ�����
		System.out.println("t1�� channel����" + t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel����" + t2.channel+"�Դϴ�.");
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� ����");
		
		// t2�� t1�� �����ϰ� �ִ� �ν��Ͻ��� ���� �����ϰ� �ȴ�
		System.out.println("t1�� channel����" + t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel����" + t2.channel+"�Դϴ�.");
	}
}
