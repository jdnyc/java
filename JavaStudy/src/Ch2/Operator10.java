package Ch2;

public class Operator10 {
	//Math.round = �ݿø��ؼ� ������ ����� �޼ҵ�
	//���� �ڸ����� �ݿø��ϱ� (int)Math.round(num/10.0) * 10
	//�Ҽ��� ù°�ڸ����� �ݿø� Math.round(pie*10)/10.0);
	public static void main(String[] args) {
		double pi = 3.141592;
		//3141.5���� �ݿø��ؼ� Math.round���� 3142�� �ȴ�
		double pi2 = Math.round(pi*1000)/1000.0;
		System.out.println(pi2);
	}
}
