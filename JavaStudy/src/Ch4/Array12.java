package Ch4;

public class Array12 {
	//�迭
	public static void main(String[] args) {
		//�����ϱ�
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]= (int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false; //�ڸ��ٲ� üũ
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true; //�ڸ��ٲ� �߻������� true
				}
			}
			
			if(!changed)
				break; //�ڸ��ٲ��� ������ �ݺ����� �����
			
			for(int k=0; k<numArr.length; k++)
				System.out.print(numArr[k]); //���ĵ� ��� ���
			System.out.println();
		}
	}
}
