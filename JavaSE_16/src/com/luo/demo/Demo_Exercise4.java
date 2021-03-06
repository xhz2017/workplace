package com.luo.demo;

import java.util.Scanner;

public class Demo_Exercise4 {
	public static void main(String[] args) {
		/*
		 * (1)从键盘循环录入录入一个字符串,输入"end"表示结束
		 * (2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数 举例:
		 * 键盘录入：Hello12345World 输出结果：hELLO*****wORLD 总共10个字母
		 */

		// System.out.println((int)'a');//97
		// System.out.println((int)'A');//65

		StringBuffer sb = getScaner();
		char[] chars = sb.toString().toCharArray();

		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'a' && chars[i] <= 'z') {
				count++;
				chars[i] = (char) (chars[i] - ('a' - 'A'));
			} else if (chars[i] >= 'A' && chars[i] <= 'Z') {
				count++;
				chars[i] = (char) (chars[i] + ('a' - 'A'));
			} else {
				chars[i] = '*';
			}
		}
		System.out.println(chars);
		System.out.println("总共" + count + "个字母");

	}

	public static StringBuffer getScaner() {
		System.out.println("请输入字符串,输入end表示结束");
		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (true) {
			String s = scanner.next();
			if ("end".equals(s)) {
				break;
			} else {
				sb.append(s);
			}
		}
		return sb;
	}
}
