package Ch3;

public class Flow21 {
	//break
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			//sum�� ���� 100�ʰ��� �Ǹ� while���� �����
			if(sum>100)
				break;
			++i;
			sum+=i;
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}
}
