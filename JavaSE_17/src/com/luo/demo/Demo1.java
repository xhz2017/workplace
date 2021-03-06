package com.luo.demo;

public class Demo1 {

	public static void main(String[] args) {
		//demo1();//字符串和基本類型的相互轉換
		//demo2();//包裝類和基本類的轉換
		//demo3();
		demo4();//自動裝箱
	}

	private static void demo4() {
		//自動裝箱
		Integer a= new Integer(3);
		Integer b= new Integer(3);
		System.out.println(a==b);
		System.out.println(a.equals(b));
		Integer x= 127;//超過127，自動裝箱會變化
		Integer y= 127;//超過127，自動裝箱會變化
		System.out.println(x==y);
		System.out.println(x.equals(y));
		Integer x2= 128;//超過127，自動裝箱會變化
		Integer y2= 128;//超過127，自動裝箱會變化
		System.out.println(x2==y2);
		System.out.println(x2.equals(y2));
	}

	private static void demo3() {
		Integer i1= 10;
		Integer i2 = 20;
		int num = i1+i2;
		System.out.println(num);
	}

	private static void demo2() {
		//包裝類和基本類的轉換
		Integer integer1 = new Integer(10);
		Integer integer2 = new Integer("20");
		Integer integer3 = Integer.valueOf(10);
		int i = integer1.intValue();
	}

	private static void demo1() {
		//字符串和基本類型的相互轉換
		int i=10;
		String s1 = i+"";
		String s2 = Integer.toString(i);
		String s3 = String.valueOf(i);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		double d=12.3;
		String s4= Double.toString(d);
		System.out.println(s4);
	}

}
