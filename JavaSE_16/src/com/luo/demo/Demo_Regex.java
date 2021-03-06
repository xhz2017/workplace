package com.luo.demo;

public class Demo_Regex {
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		String mail="87032585@qq.com";
		String regex = "[0-9a-z_A-Z]+@[0-9a-z_A-Z]+(\\.[a-zA-Z]+)+";
		System.out.println(mail.matches(regex));
	}

	private static void demo5() {
		String s = "hello123423world43543";
		String regex = "[0-9]";
		String result=s.replaceAll(regex, "*");
		System.out.println(result);
	}

	private static void demo4() {
		String s = "18 22 40 65";
		String regex = " ";
		String[] str=s.split(regex);
		for (String string : str) {
			System.out.println(string);
		}
	}

	private static void demo3() {
		String s = "18-22-40-65";
		String regex = "-";
		String[] str=s.split(regex);
		for (String string : str) {
			System.out.println(string);
		}
	}

	private static void demo2() {
		//ƥ��qq����
		String qq="87032585";
		String regex = "[1-9][0-9]{4,14}";
		System.out.println(qq.matches(regex));
	}

	private static void demo1() {
		//ƥ��绰����
		String phone ="18123710086";
		String regex = "1[34578][0-9]{9}";
		System.out.println(phone.matches(regex));
	}
}
