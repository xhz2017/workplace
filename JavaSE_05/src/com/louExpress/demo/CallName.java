package com.louExpress.demo;

import java.util.Random;

public class CallName {

	public static void main(String[] args) {
		 String[] stuName = initArr();
		showArr(stuName);
		System.out.println("Luck name: " + stuName[callName(stuName.length)]);
	}
	
	/**
	 * the function of init array
	 * @param stuName
	 */
	public static String[] initArr() {
		// 1 初始化數組
		String []stuName = new String[10];
		for (int i = 1; i < stuName.length + 1; i++) {
			stuName[i - 1] = "zhang" + i;
		}
		return stuName;
	}

	public static void showArr(String[] stuName) {
		// 2 打印
		for (int i = 0; i < stuName.length; i++)
			System.out.println(stuName[i]);
	}

	public static int callName(int length) {
		// 3 點名
		Random random = new Random();
		int num = random.nextInt(length);
		return num;
	}

}
