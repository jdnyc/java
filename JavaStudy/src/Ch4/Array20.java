package Ch4;

public class Array20 {
	//배열
	public static void main(String[] args) {
		//커맨드라인
		if(args.length != 3) {
			System.out.println("usage: java Array20 NUM1 OP NUM2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]); //문자열을 숫자로 변환
		char op = args[1].charAt(0);	//문자열을 문자로 변환
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		
		switch(op) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case 'x':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		default :
			System.out.println("지원되지 않는 연산");
		}
		
		System.out.println("결과:"+result);
	}
}

