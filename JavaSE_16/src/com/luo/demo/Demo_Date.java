package com.luo.demo;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class Demo_Date {
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//求出今天距离2020年1月1日还有多少天
		Calendar my = Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		//设置年月日 2020-01-01
		my.set(Calendar.YEAR, 2020);
		my.set(Calendar.MONTH, 0);
		my.set(Calendar.DATE, 1);
		//获取时间中的天数
		int day = c.get(Calendar.DATE);
		int myDay = my.get(Calendar.DATE);
		System.out.println(myDay - day);

	}

	private static void demo2() {
		//求出自己已经出生多少天
		/*1.获取当前时间对应的天数
		2.获取自己出生日期对应的天数
		3.两个时间相减（当前时间天数 – 出生日期天数）*/
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
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
		System.out.println(format.format(date));
	}
}
