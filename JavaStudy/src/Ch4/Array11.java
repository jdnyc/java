package Ch4;

import java.util.*;
public class Array11 {
	//�迭
	public static void main(String[] args) {
		//������ ������ �迭 ä���
		int[] code = {-4, -1, -3, 6, 11}; //�ҿ����� ��
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp=(int)(Math.random()*code.length);
			arr[i] = code[tmp];
		}
		System.out.println(Arrays.toString(arr));
	}
}
