package com.luoExpress.Exercise;

public class Day4Excise13A {
	public static void main(String[] args) {
		// 二维数组遍历获取到每一个值
		int[][] arr = new int[3][]; // 定义一个长度为3的二维数组
		arr[0] = new int[] { 11, 12 }; // 为数组的元素赋值
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
