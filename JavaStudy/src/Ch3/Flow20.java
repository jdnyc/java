package Ch3;

public class Flow20 {
	//do-while, 369
	public static void main(String[] args) {
		for(int i=1; i<15; i++) {
			System.out.printf("i=%d", i);
			
			int tmp=i;
			
			do {
				//tmp%10�� 3�� ������� Ȯ��
				if(tmp%10%3==0 && tmp%10!=0) {
					System.out.print("¦");
				}
			} while((tmp/10)!=0);
			System.out.println();
		}
	}
}
