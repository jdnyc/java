package Ch4;

public class Array1 {
	//�迭
	public static void main(String[] args) {
		//�迭�� ����
		int[] a; //int Ÿ�� �迭 �ٷ�� ���� �������� a ����
		a = new int[5]; //int Ÿ�� �� 5�� ������ �� �ִ� �迭
		
		//���ٷ� �迭�� ����� ����
		int[] store = new int[5]; //���� 5�� int �迭 store
		
		//����
		//���� 5�� int �迭 score 
		int[] score =new int[5];
		int k=1;
		
		score[0]=50; //�ε���0�� 50 ����
		score[1]=60; //�ε���1�� 60 ����
		score[k+1]=70; //k=1�̹Ƿ� �ε���2�� 70����
		score[3]=80; //�ε���3�� 80 ����
		score[4]=90; //�ε���4�� 90 ����
		
		//score[3]���� score[4]���� ��
		int tmp = score[k+2]+score[4];
		
		//for���� ���� �迭�� ��� ��ҵ� ���
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d]:%d%n",i, score[i]);
		}
		
		//tmp�� ��� 	
		System.out.printf("tmp:%d%n", tmp);
		//index ������ ��� ��
		System.out.printf("score[%d]:%d%n", 7, score[7]);
	}

}
