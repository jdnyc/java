package Ch1;

public class Variable3 {
	public static void main(String args[]) {
		//����
		boolean power = true; //power�� true ���� ����
		/*
		 * boolean power = FALSE; boolean�� �ҹ��� true/false ���� �����ϱ⿡ ����
		 */
		
		//������
		char c = 'A'; //���� 'A'�� char Ÿ�� ���� c�� ����
		char c2 = 65;
		System.out.println(c2); //������ �ʱ�ȭ �ص� ���ڷ� ��� (�����ڵ� ��)
		System.out.println(c+3); //�����ڵ� ������ ������ ���ϸ� �������� ����
		//������ �����ڵ� �ƴ� ��
		int code = (int)c;
		System.out.println(code);
		
		//Ư������ �ٷ��
		System.out.println('\''); //��������ǥ ���
		System.out.println('\n'); //����
		System.out.println("\"Hello\""); //ū����ǥ ���
		System.out.println("c:\\"); //�������� ���
		
		/*------------------------------------------------------------*/
		//�����÷ο�
		short sMin = -32768; //short �������� �ּҰ�
		short sMax = 32767; //short �������� �ִ밪
		char cMin = 0; //char �������� �ּҰ�
		char cMax = 65535; //char �������� �ִ밪
		
		/*
		 * �ּҰ�-1 = �ִ밪
		 * �ִ밪+1 = �ּҰ�
		 */
		System.out.println("sMin = "+sMin);
		System.out.println("sMin-1 = "+(short)(sMin-1)); //�ּҰ�-1 = �ִ밪 (short�ִ밪)
		System.out.println("sMax = "+sMax);
		System.out.println("sMax+1 = "+(short)(sMax+1)); //�ִ밪+1 = �ּҰ� (short�ּҰ�)
		System.out.println("cMin = "+(int)cMin);
		System.out.println("cMin-1 = "+(int)--cMin); //�ּҰ�-1 = �ִ밪 (char�ִ밪)
		System.out.println("cMax = "+(int)cMax);
		System.out.println("cMax+1 = "+(int)++cMax); //�ִ밪+1 = �ּҰ� (short�ּҰ�)
		
		//�Ǽ���
		/*
		 * float ���е� 7�ڸ�
		 * double ���е� 15�ڸ�
		 */
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.printf("       123456789012345678901234%n");
		System.out.printf("f  : %f%n", f); //�Ҽ��� ���� 6° �ڸ����� ����ϰ� 7�ڸ����� �ݿø���
		System.out.printf("f  : %24.20f%n", f); //%24.20f = 24�ڸ� �� 20�ڸ��� �Ҽ��� ���� ���� ����϶�
		//���� ������ ���� ������ ���ܼ� ��µȴ�
		System.out.printf("f2 : %24.20f%n", f2); //���� ������ ���� ������ ���ܼ� ��µȴ�
		System.out.printf("d  : %24.20f%n", d); //�Ҽ��� ���� 14° �ڸ����� ����ϰ� 15�ڸ����� �ݿø���
	}
}
