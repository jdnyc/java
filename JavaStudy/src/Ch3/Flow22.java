package Ch3;

public class Flow22 {
	//continue
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			//3의 배수면 다음으로 넘어가게 함
			if(i%3==0)
				continue;
			System.out.println(i);
		}
	}
}
