package Ch4;

public class Array7 {
	//�迭
	public static void main(String[] args) {
		//�� �հ� ���
		int sum = 0;//���� ����
		float average = 0f; //��� ����
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			//�ݺ����� ���� ������ ���� ���� ���� ����
			sum += score[i];
		}
		
		// ��� = ����/���� ����
		average = sum / (float)score.length;
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+average);
	}
}
