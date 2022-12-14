package Ch4;

public class Array21 {
	//배열
	public static void main(String[] args) {
		//2차원배열
		int[][] score = {
						{100,100,100},
						{20,20,20},
						{30,30,30},
						{40,40,40}
						};
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		//2차원배열 향상된 for문
		for (int[] tmp : score) {
			for(int i : tmp) {
				sum += i;
			}
		}
		
		System.out.println("sum="+sum);
	}
}

