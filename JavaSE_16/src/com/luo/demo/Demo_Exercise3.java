package com.luo.demo;

public class Demo_Exercise3 {
	public static void main(String[] args) {
		/*
		 * 3.分析以下需求，并用代码实现： (1)定义数字字符串数组{"010","3223","666","7890987","123123"}
		 * (2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，
		 * 第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出 (3)如：010 是对称的，3223 是对称的，123123 不是对称的
		 * (4)最终打印该数组中对称字符串的个数
		 * 
		 * 提示：循环获取字符串的每一个字符，依次比较第一个和最后一个，第二个和倒数第二个。。。
		 */
		String[] s = { "010", "3223", "666", "7890987", "123123" };
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (isbalance(s[i]))
				count++;
		}
		System.out.println(count);
	}

	public static boolean isbalance(String s) {
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length / 2; i++) {
			if (charArray[i] != charArray[charArray.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}
