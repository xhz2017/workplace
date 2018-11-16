package com.luo.demo;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class Demo_Date {
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//����������2020��1��1�ջ��ж�����
		Calendar my = Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		//���������� 2020-01-01
		my.set(Calendar.YEAR, 2020);
		my.set(Calendar.MONTH, 0);
		my.set(Calendar.DATE, 1);
		//��ȡʱ���е�����
		int day = c.get(Calendar.DATE);
		int myDay = my.get(Calendar.DATE);
		System.out.println(myDay - day);

	}

	private static void demo2() {
		//����Լ��Ѿ�����������
		/*1.��ȡ��ǰʱ���Ӧ������
		2.��ȡ�Լ��������ڶ�Ӧ������
		3.����ʱ���������ǰʱ������ �C ��������������*/
		Calendar c = Calendar.getInstance();
		long times = c.getTimeInMillis();
		long day = times/1000/60/60/24;
		System.out.println(day);
		c.set(Calendar.YEAR, 1976);
		c.set(Calendar.MONTH, 7);
		c.set(Calendar.DATE, 27);
		long times2 = c.getTimeInMillis();
		long day2 = times2/1000/60/60/24;
		System.out.println(day2);
		System.out.println(day-day2);
	}

	private static void demo1() {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
		System.out.println(format.format(date));
	}
}