package Ch3;

import java.util.Scanner;

public class Flow14 {
	//for �ݺ���, ���� for��
	public static void main(String[] args) {
		
		int [] arr = {10, 20, 30, 40, 50};
		
		int sum = 0;
		
		//�迭�� ��� ��� ���
		for(int i : arr) {
			System.out.println(i);
		}
		
		//�迭�� ��� ��� ��
		for(int i : arr) {
			sum = sum+i;
		}
		System.out.println("sum = "+sum);
	}
}
