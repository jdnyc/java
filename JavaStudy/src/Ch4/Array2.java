package Ch4;

import java.util.Arrays;

public class Array2 {
	//�迭
	public static void main(String[] args) {
		//�迭�̸�.length
		int [] score = new int[5];
		
		//�迭�� ���̸� ���� �����ִ� �� ���� �迭�̸�.length ���
		for(int i=0; i<score.length; i++){
			System.out.println(score[i]);
		}
		//�迭�� ����,�ʱ�ȭ ����
		int[] a = new int[]{50, 60, 70, 80, 90};
		/* new int[] ��������
		 * int[] score = {50, 60, 70, 80, 90}; 
		*/
		
		//�迭�� ����, ���� �����ϴ� ���
		int[] b; //�迭 b ����
		b = new int[] {50,60}; //����
		/*
		 * �Ұ���
		 * b = {50,60};
		 */
		
		//���̰� 0�� �迭 ����
		//�´� ����
		int[] c = new int[0];
		int[] d = new int[] {};
		int[] e = {};
		
		//�迭�� ���
		//for�� �̿�
		int [] iArr = {100, 95, 80, 70, 60};

		//for�� �̿��� �迭�� ��� ������� �ϳ��� ���
		for(int i=0; i<iArr.length; i++){
			System.out.println(iArr[i]);
		}
		
		//�޼�����
		System.out.println(Arrays.toString(iArr));
		
		//�ٷ� �迭�� �̸� ���
		System.out.println(iArr);
		
		//char�� �迭�� �̸� �ٷ� ���
		char[] chArr= {'a', 'b'};
		System.out.println(chArr);
	}

}
