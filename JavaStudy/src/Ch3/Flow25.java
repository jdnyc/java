package Ch3;

public class Flow25 {
	//�ݺ��� �̸�, menu
	public static void main(String[] args) {
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					//Loop1�� ������ ���������� (�ٱ��� �ݺ��� ��������
					//break Loop1;
				//2�� �ݺ����� ���� �ݺ����� ��������
				break;
				//Loop1 �ٱ��� �ݺ����� ��� ����
				//continue Loop1;
				//���� �ݺ��� ��� ����
				//continue;
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
	}
}
