package Ch5;

class TvTest2{
	public static void main (String args[]) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		//int���� �⺻���� 0���� �ʱ�ȭ �Ǿ�����
		System.out.println("t1�� channel����" + t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel����" + t2.channel+"�Դϴ�.");
		
		t1.channel = 7;
		System.out.println("t1�� ä�ΰ��� 7�� ����");
		
		//���� Ŭ�����κ��� �����Ǿ��, �� �ν��Ͻ��� �Ӽ��� ���� �ٸ� ���� ���� ����
		System.out.println("t1�� channel����" + t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel����" + t2.channel+"�Դϴ�.");
	}
}
