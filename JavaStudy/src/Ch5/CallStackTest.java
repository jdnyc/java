package Ch5;

//��ü���� ���α׷���
class CallStackTest {
	public static void main(String[] args) {
		//main�� firstMethod()ȣ��
		firstMethod(); //static �޼���� ��ü ���� ���� ȣ�� ����
	}


	static void firstMethod() {
		//secondMethod()ȣ��
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}

