package Ch4;

import java.util.Scanner;

public class Array23 {
	//�迭
	public static void main(String[] args) {
		//��ǥ�� Xǥ�ϱ�
		final int SIZE = 10; //��� SIZE ����
		int x=0, y=0;
		
		char[][] board = new char [SIZE][SIZE];
		byte[][] shipBoard = {
			   //1,2,3,4,5,6,7,8,9
				{0,0,0,0,0,0,1,0,0},
				{1,1,1,1,0,0,1,0,0},
				{0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,0,0,0},
				{1,1,0,1,0,0,0,0,0},
				{0,0,0,1,0,0,0,0,0},
				{0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,1,1,1,0}
		};
		
		// 1�࿡ ���ȣ, 1���� ����ȣ ����
		for(int i=1; i<SIZE; i++)
			board[0][i] = board[i][0] = (char)(i+'0');
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("��ǥ�� �Է��ϼ��� (���� 00) : ");
			String input = scanner.nextLine();
			
			//�α��ڸ� �Է��� ���
			if(input.length()==2) {
				//�α��� �� ù��° ����
				x = input.charAt(0) - '0'; //���ڸ� ���ڷ� ��ȯ
				//�α��� �� �ι�° ����
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0)
					break;
			}
			
			if(input.length() != 2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			
			//���� 1�̸� '0'��, board[x][y]�� ����
			board[x][y] = shipBoard[x-1][y-1]==1 ? '0' : 'x';
			
			for(int i=0; i<SIZE; i++) {
				System.out.println(board[i]);
			}
			System.out.println();
		}
	}
}

