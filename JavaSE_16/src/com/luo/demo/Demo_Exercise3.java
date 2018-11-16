package com.luo.demo;

public class Demo_Exercise3 {
	public static void main(String[] args) {
		/*
		 * 3.�����������󣬲��ô���ʵ�֣� (1)���������ַ�������{"010","3223","666","7890987","123123"}
		 * (2)�жϸ������ַ��������е������ַ����Ƿ��ǶԳ�(��һ�����ֺ����һ��������ȣ�
		 * �ڶ������ֺ͵����ڶ�����������ȵģ���������)�ģ��������� (3)�磺010 �ǶԳƵģ�3223 �ǶԳƵģ�123123 ���ǶԳƵ�
		 * (4)���մ�ӡ�������жԳ��ַ����ĸ���
		 * 
		 * ��ʾ��ѭ����ȡ�ַ�����ÿһ���ַ������αȽϵ�һ�������һ�����ڶ����͵����ڶ���������
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