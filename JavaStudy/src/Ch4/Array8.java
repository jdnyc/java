package Ch4;

public class Array8 {
	//�迭
	public static void main(String[] args) {
		//�ִ밪�� �ּҰ�
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		//�迭�� ù��° ������ �ִ밪, �ּҰ� �ʱ�ȭ
		int max = score[0];
		int min = score[0];
		
		for(int i=0; i<score.length; i++) {
			if(score[i]>max) {
				//score[i]�� max���� ũ�� max�� �� ����
				max = score[i];
			} else if(score[i]<min) {
				//score[i]�� min���� ������ min�� �� ����
				min = score[i];
			}
		}
		
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּҰ�:"+min);
	}
}
