package Ch3;
public class Flow13 {
	//for 반복문, 행
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.printf("{%d, %d}", i,j);
			}
			System.out.println();
		}
		
	}
}
