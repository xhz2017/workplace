package com.luoExpress.Exercise;

public class Day4Excise10 {
	public static void main(String[] args) {
		// 10.数组元素逆序（代码实现）
		int[] arr = { 4, 1, 6, 3, 9, 8 }; // 定义一个数组

		// 打印数组
		System.out.println("排序前的数组");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		// 数组逆序
		for (int i = 0; i < arr.length / 2; i++) {
			int data = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = data;
		}
		System.out.println();
		// 打印数组
		System.out.println("排序后的数组");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
