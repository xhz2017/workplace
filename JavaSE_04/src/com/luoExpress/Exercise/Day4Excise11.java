package com.luoExpress.Exercise;

import java.util.Scanner;

public class Day4Excise11 {
	public static void main(String[] args) {
		// 11.数组查表法(根据键盘录入索引,查找对应星期)（代码实现）
		String[] arr = { "Mon", "Tue", "Wed", "thu", "Fri", "Sat", "Sun" }; // 定义一个数组
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("请输入星期1-7的整数");
			int weeks = scanner.nextInt();
			while (true) {
				if (weeks > 0 && weeks < 8)
					break;
				System.out.println("请输入星期1-7的整数");
				weeks = scanner.nextInt();
			}
			System.out.println("你输入的星期为" + arr[weeks - 1]);
		} finally {
			scanner.close();
		}

	}
}
