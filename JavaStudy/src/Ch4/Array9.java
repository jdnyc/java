package Ch4;

public class Array9 {
	//�迭
	public static void main(String[] args) {
		//����
		int[] numArr = new int[10]; //���� 10�� numArr �迭
		
		for(int i=0; i<numArr.length; i++) {
			//�迭�� 0~9�� ���ڷ� �ʱ�ȭ
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			//0~9 �� �� ���� ���Ƿ� ��´�
			int n = (int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println(numArr[i]);
		}
	}
}
