package com.luo.demo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Demo_Exercise5 {
	public static void main(String[] args) {
		/*
		 * 5.�����������󣬲��ô���ʵ�֣� (1)�Ӽ���ѭ��¼��¼��һ���ַ���,����"end"��ʾ���� (2)����һ������ public
		 * Object[] deleteSubString(String str1,String str2) {
		 * 
		 * } (3)������������:��str1��ɾ�����е�str2,������ɾ����Ľ��,���ؽ��ΪObject[]����
		 * ������ĵ�һ��Ԫ��Ϊɾ�����е�str2������յ��ַ��� ������ĵڶ���Ԫ��Ϊɾ����str2�ĸ���
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
		System.out.println("�������ַ���,����end��ʾ����");
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