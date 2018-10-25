package com.luoExpress.interfaceDemo;

public class TextDome {

	public static void main(String[] args) {
		Father f=new Son();
		System.out.println(f.num);
		Son s = (Son)f;
		System.out.println(s.num);
//		System.out.println(son.num2);
	}

}
