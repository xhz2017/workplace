package com.luo.demo;

import java.util.Scanner;

public class Demo_Exercise4 {
	public static void main(String[] args) {
		/*
		 * (1)�Ӽ���ѭ��¼��¼��һ���ַ���,����"end"��ʾ����
		 * (2)���ַ����д�д��ĸ���Сд��ĸ��Сд��ĸ��ɴ�д��ĸ�������ַ���"*"����,��ͳ����ĸ�ĸ��� ����:
		 * ����¼�룺Hello12345World ��������hELLO*****wORLD �ܹ�10����ĸ
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
		System.out.println("�ܹ�" + count + "����ĸ");

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