package com.luo.demo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Demo_Exercise5 {
	public static void main(String[] args) {
		/*
		 * 5.分析以下需求，并用代码实现： (1)从键盘循环录入录入一个字符串,输入"end"表示结束 (2)定义一个方法 public
		 * Object[] deleteSubString(String str1,String str2) {
		 * 
		 * } (3)方法功能描述:从str1中删除所有的str2,并返回删除后的结果,返回结果为Object[]数组
		 * 该数组的第一个元素为删除所有的str2后的最终的字符串 该数组的第二个元素为删除的str2的个数
		 */
		StringBuffer sb = getScaner();
		ArrayList list = deleteSubString(sb.toString(), "ja");
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

	}

	public static ArrayList deleteSubString(String str1, String str2) {
		ArrayList list = new ArrayList();
		StringBuffer sb = new StringBuffer(str1);
		int num = 0;
		while (sb.indexOf(str2) > 0) {
			num++;
			sb.delete(sb.indexOf(str2), sb.indexOf(str2) + str2.length());
		}
		list.add(sb);
		list.add(num);
		return list;
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
