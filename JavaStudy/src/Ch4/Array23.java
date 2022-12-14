package Ch4;

import java.util.Scanner;

public class Array23 {
	//배열
	public static void main(String[] args) {
		//좌표에 X표하기
		final int SIZE = 10; //상수 SIZE 선언
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
		
		// 1행에 행번호, 1열에 열번호 저장
		for(int i=1; i<SIZE; i++)
			board[0][i] = board[i][0] = (char)(i+'0');
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.printf("좌표를 입력하세요 (종료 00) : ");
			String input = scanner.nextLine();
			
			//두글자를 입력한 경우
			if(input.length()==2) {
				//두글자 중 첫번째 숫자
				x = input.charAt(0) - '0'; //문자를 숫자로 변환
				//두글자 중 두번째 숫자
				y = input.charAt(1) - '0';
				
				if(x==0 && y==0)
					break;
			}
			
			if(input.length() != 2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			//값이 1이면 '0'을, board[x][y]에 저장
			board[x][y] = shipBoard[x-1][y-1]==1 ? '0' : 'x';
			
			for(int i=0; i<SIZE; i++) {
				System.out.println(board[i]);
			}
			System.out.println();
		}
	}
}

