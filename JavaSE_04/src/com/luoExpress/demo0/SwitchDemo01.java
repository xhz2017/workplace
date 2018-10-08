package com.luoExpress.demo0;

import java.util.*;

public class SwitchDemo01 {
	public static void main(String[] args) {
		// 要求输入数字，显示相应的星期
/*		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("请输入一个数字");
			int iweek = scanner.nextInt();
			switch (iweek) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("输入错误");
				break;
			}
		} finally {
			scanner.close();
		}*/
		
		// 要求输入字符，显示相应的星期
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("请输入一个数字");
			String strweek = scanner.nextLine();
			switch (strweek) {
			case "M":
			case "T":
			case "w":
			case "th":
			case "Fri":
				System.out.println("work day");
				break;

			case "Sat":
				System.out.println("星期六");
				break;
			case "sun":
				System.out.println("星期日");
				break;
			default:
				System.out.println("输入错误");
				break;
			}
		} finally {
			scanner.close();
		}
	}
}
