package Ch5;

//��ü���� ���α׷���
class Tv {
	//Tv�� �Ӽ�(�������)
	String color; //����
	Boolean power; //��������
	int channel; //ä��
	
	//Tv�� ���(�޼���)
	void power() {power = !power;} //Tv�� Ű�ų� ���� ���
	void channelUp() {channel++;} //ä���� ���̴� ���
	void channelDow() {channel--;} //ä���� ���ߴ� ���
}

class TvTest{
	public static void main(String args[]) {
		Tv t;	//Tv�ν��Ͻ��� �����ϱ� ���� ���� t ����
		t = new Tv();	//Tv�ν��Ͻ� ����
		t.channel = 7;	//channel�� 7�� �Ѵ�
		t.channelDow();//channel down
		System.out.println("���� ä���� "+t.channel+"�Դϴ�.");
	}
}
