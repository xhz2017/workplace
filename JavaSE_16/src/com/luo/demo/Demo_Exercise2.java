package com.luo.demo;

public class Demo_Exercise2 {
	public static void main(String[] args) {
		/*
		 * 2.�����������󣬲��ô���ʵ�֣� (1)�������·���public static String
		 * getPropertyGetMethodName(String property);
		 * (2)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ� ����ֵΪ��Ա������Ӧ��get����������
		 * (3)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"getName"
		 */

		String s = "name";
		System.out.println(getPropertyGetMethodName(s));
	}

	public static String getPropertyGetMethodName(String property) {

		return "get" + property.substring(0, 1).toUpperCase()
				+ property.substring(1).toLowerCase();
	}
}