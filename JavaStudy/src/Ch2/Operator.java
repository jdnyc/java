package Ch2;

public class Operator {
	//�������� ����, ����
	public static void main(String[] args) {
		//����������
		int i = 5;
		i++; // i=i+1�� �����ǹ�
		System.out.println(i);
		
		i=5;
		++i;
		System.out.println(i);
		
		i=5;
		int j=0;
		j = i++;
		System.out.println("j=i++; ������, i=" + i +", j="+ j);
		
		i=5;
		j=0;
		j = ++i;
		System.out.println("j=++i; ������, i=" + i +", j="+ j);
		
		int x=5;
		
		x = x++ - ++x;
		System.out.println(x);
	}

}
