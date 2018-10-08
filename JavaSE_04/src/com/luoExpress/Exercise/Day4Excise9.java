package com.luoExpress.Exercise;
public class Day4Excise9 {
	public static void main(String[] args) {
		// 9.数组获取最值(获取数组中的最大值最小值)（代码实现）
		int[] arr = { 4, 1, 6, 3, 9, 8 }; // 定义一个数组
		int max = arr[0]; // 定义变量max用于记住最大数，首先假设第一个元素为最大值
		// 下面通过一个for循环遍历数组中的元素
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) { // 比较 arr[x]的值是否大于max
				max = arr[x]; // 条件成立，将arr[x]的值赋给max
			}
		}
		System.out.println("max=" + max); // 打印最大值
	}
}
