package com.luoExpress.Demo;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		//demo1();
		//demo2();
		String s1="abc";
		String s2="abc";
		String s3=new String("abc");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
	}

	private static void demo2() {
		Employee em2 = new Chef("lisi", "124");
		Employee em3 = new Chef("lisi", "124");
		em3.equals(em2);
	}

	private static void demo1() {
		ArrayList al = Utils.init();
		System.out.println("luckey employ is :" + Utils.getLucy(al));
		Utils.visit(al);
	}
}
