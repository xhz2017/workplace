package com.luoExpress.demo01;

public class Day3Exercise8 {
	public static void main(String[] args) {
		// 编写程序，打印1到100之内的整数，但数字中包含7的要跳过
		for (int i = 1; i <= 100; i++) {
			String s = String.valueOf(i);// 转换成字符串来查找
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
