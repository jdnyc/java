package Ch5;

//��ü���� ���α׷���
class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[]args)�� ���۵Ǿ���");
		firstMethod(); //static �޼���� ��ü ���� ���� ȣ�� ����
		System.out.println("main(String[]args)�� ������");
	}


	static void firstMethod() {
		//secondMethod()ȣ��
		System.out.println("firstMethod()�� ���۵Ǿ���");
		secondMethod();
		System.out.println("firstMethod()�� ������");
	}
	
	static void secondMethod() {
		System.out.println("secnondMethod()�� ���۵Ǿ���");
		System.out.println("secondMethod()�� ������");
	}
}

