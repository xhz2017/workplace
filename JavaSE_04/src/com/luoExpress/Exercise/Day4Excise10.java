package com.luoExpress.Exercise;

public class Day4Excise10 {
	public static void main(String[] args) {
		// 10.����Ԫ�����򣨴���ʵ�֣�
		int[] arr = { 4, 1, 6, 3, 9, 8 }; // ����һ������

		// ��ӡ����
		System.out.println("����ǰ������");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		// ��������
		for (int i = 0; i < arr.length / 2; i++) {
			int data = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = data;
		}
		System.out.println();
		// ��ӡ����
		System.out.println("����������");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
