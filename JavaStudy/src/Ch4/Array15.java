package Ch4;


public class Array15 {
	//�迭
	public static void main(String[] args) {
		//String �迭 ����
		String[] names = {"Kim", "Park", "Yi"}; //����� �ʱ�ȭ
		
		//names �迭 ��� ���
		for (int i = 0; i < names.length; i++) 
			System.out.println("names["+i+"]:"+names[i]);
			
		String tmp = names[2]; //�迭 ����° ��� tmp�� ����
		
		System.out.println("tmp:" + tmp);
		
		names[0] = "Yu"; //�迭�� ù��° ��� Yu�� ����
		
		for(String str : names) //���� for��
			System.out.println(str);
	}

}
