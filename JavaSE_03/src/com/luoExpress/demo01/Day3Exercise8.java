package com.luoExpress.demo01;

public class Day3Exercise8 {
	public static void main(String[] args) {
		// ��д���򣬴�ӡ1��100֮�ڵ��������������а���7��Ҫ����
		for (int i = 1; i <= 100; i++) {
			String s = String.valueOf(i);// ת�����ַ���������
			if (s.contains("7")) {
				if (i == 71) {
					System.out.println();
				}
				System.out.print("   ");
				continue;
			}
			System.out.print(" " + i);
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}
