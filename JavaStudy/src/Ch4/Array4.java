package Ch4;

public class Array4 {
	//�迭
	public static void main(String[] args) {
		//for���� �̿��� �迭�� ����
		int[] arr = new int[5];
		//���� �迭���� ���̰� 2���� �迭 ����
		int[] tmp = new int[arr.length*2];
		
		for(int i=0; i<arr.length; i++) {
			//arr[i]�� ���� tmp[i]�� ����
			tmp[i] = arr[i];
		}
		
		arr = tmp; //�������� arr�� ���ο� �迭�� ����Ű�� �Ѵ�.
	}
}
