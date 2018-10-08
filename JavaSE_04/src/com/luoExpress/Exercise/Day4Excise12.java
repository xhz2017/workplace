package com.luoExpress.Exercise;

import java.util.Scanner;

public class Day4Excise12 {
	public static void main(String[] args) {
		// 12.数组元素查找(查找指定元素第一次在数组中出现的索引)（代码实现）
		int[] arr = { 4, 1, 6, 3, 9, 8 }; // 定义一个数组
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("请输入一个指定元素");
			int data = scanner.nextInt();
			int index = -1;
			for (int i = 0; i < arr.length; i++) {
				if (data == arr[i]) {
					index = i;
					break;
				}
			}
			if (index >= 0) {
				System.out.println("第一次在数组中出现的索引为 " + index);
			} else {
				System.out.println("没有找到 ");
			}

		} finally {
			scanner.close();
		}

	}
}
