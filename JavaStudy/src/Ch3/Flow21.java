package Ch3;

public class Flow21 {
	//break
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			//sum의 값이 100초과가 되면 while문을 벗어난다
			if(sum>100)
				break;
			++i;
			sum+=i;
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}
}
