package Ch4;

public class Array19 {
	//배열
	public static void main(String[] args) {
		//커맨드라인
		System.out.println("매개변수의 개수:" + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"]=\""+args[i]+"\"");
		}
	}
}

