package Ch4;

public class Array13 {
	//�迭
	public static void main(String[] args) {
		//�󵵼� ���ϱ�
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		//������ �� ����
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10);
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
			counter[numArr[i]]++;
			//numArr[i]�� ���� ������ ī���� �ϳ� �߰�
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.println(i+"�ǰ��� :"+ counter[i]);
		}
	}
}
