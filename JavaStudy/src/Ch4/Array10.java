package Ch4;

public class Array10 {
	//�迭
	public static void main(String[] args) {
		//����
		int[] ball = new int[45]; //���� 45 �迭
		
		//�迭�� �� ��ҿ� 1~45 �� ����
		for(int i=0; i< ball.length; i++) 
			ball[i] = i+1;
		
		int tmp = 0; //�� �ٲٴµ� ����� ����
		int j = 0; //������ �� ������ ����
		
		//0~5��° ��ұ��� ��� 6���� �ٲ�
		for(int i=0; i<6; i++) {
			//0~44������ ������ ��
			j=(int)(Math.random()*45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}
}
