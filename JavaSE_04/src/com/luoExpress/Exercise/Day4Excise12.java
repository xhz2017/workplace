package com.luoExpress.Exercise;

import java.util.Scanner;

public class Day4Excise12 {
	public static void main(String[] args) {
		// 12.����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)������ʵ�֣�
		int[] arr = { 4, 1, 6, 3, 9, 8 }; // ����һ������
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("������һ��ָ��Ԫ��");
			int data = scanner.nextInt();
			int index = -1;
			for (int i = 0; i < arr.length; i++) {
				if (data == arr[i]) {
					index = i;
					break;
				}
			}
			if (index >= 0) {
				System.out.println("��һ���������г��ֵ�����Ϊ " + index);
			} else {
				System.out.println("û���ҵ� ");
			}

		} finally {
			scanner.close();
		}

	}
}
