package com.luoExpress.Exercise;

public class Day4Excise13A {
	public static void main(String[] args) {
		// ��ά���������ȡ��ÿһ��ֵ
		int[][] arr = new int[3][]; // ����һ������Ϊ3�Ķ�ά����
		arr[0] = new int[] { 11, 12 }; // Ϊ�����Ԫ�ظ�ֵ
		arr[1] = new int[] { 21, 22, 23 };
		arr[2] = new int[] { 31, 32, 33, 34 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
