package Ch4;

public class Array5 {
	//�迭
	public static void main(String[] args) {
		//����
		int[] arr = new int[5]; //���̰� 5�� �迭 arr
		
		//1~5 ����
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
		System.out.println("������");
		System.out.println("arr.length:"+ arr.length);
		//���� �迭 ���
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		//���� �迭���� ���̰� 2���� �迭 ����
		int[] tmp = new int[arr.length*2];
		
		for(int i=0; i<arr.length; i++) {
			//arr[i]�� ���� tmp[i]�� ����
			tmp[i] = arr[i];
		}
		
		arr = tmp; //�������� arr�� ���ο� �迭�� ����Ű�� �Ѵ�.
		
		System.out.println("������");
		System.out.println("arr.length:"+ arr.length);
		//���� �迭 ���
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
	}
}
