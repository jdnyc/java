package Ch2;

public class Operator {
	//증감연산 전위, 후위
	public static void main(String[] args) {
		//증감연산자
		int i = 5;
		i++; // i=i+1과 같은의미
		System.out.println(i);
		
		i=5;
		++i;
		System.out.println(i);
		
		i=5;
		int j=0;
		j = i++;
		System.out.println("j=i++; 실행후, i=" + i +", j="+ j);
		
		i=5;
		j=0;
		j = ++i;
		System.out.println("j=++i; 실행후, i=" + i +", j="+ j);
		
		int x=5;
		
		x = x++ - ++x;
		System.out.println(x);
	}

}
