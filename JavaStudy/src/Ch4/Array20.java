package Ch4;

public class Array20 {
	//�迭
	public static void main(String[] args) {
		//Ŀ�ǵ����
		if(args.length != 3) {
			System.out.println("usage: java Array20 NUM1 OP NUM2");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]); //���ڿ��� ���ڷ� ��ȯ
		char op = args[1].charAt(0);	//���ڿ��� ���ڷ� ��ȯ
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
			System.out.println("�������� �ʴ� ����");
		}
		
		System.out.println("���:"+result);
	}
}

