package com.luoExpress.Exercise;

import java.util.Scanner;

public class Day4Excise11 {
	public static void main(String[] args) {
		// 11.������(���ݼ���¼������,���Ҷ�Ӧ����)������ʵ�֣�
		String[] arr = { "Mon", "Tue", "Wed", "thu", "Fri", "Sat", "Sun" }; // ����һ������
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("����������1-7������");
			int weeks = scanner.nextInt();
			while (true) {
				if (weeks > 0 && weeks < 8)
					break;
				System.out.println("����������1-7������");
				weeks = scanner.nextInt();
			}
			System.out.println("�����������Ϊ" + arr[weeks - 1]);
		} finally {
			scanner.close();
		}

	}
}
