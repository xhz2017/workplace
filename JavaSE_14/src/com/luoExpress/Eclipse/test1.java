package com.luoExpress.Eclipse;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		while(true){
			String str = scanner.nextLine();
			try {
				int num = Integer.parseInt(str);
				System.out.println(Integer.toBinaryString(num));
				break;
			} catch (NumberFormatException e) {
				try {
					new BigInteger(str);
					System.out.println("错误，录入的是一个过大整数，请重新输入数字");
				} catch (Exception e1) {
					try {
						new BigDecimal(str);
						System.out.println("错误，录入的是小数，请重新输入数字");
					} catch (Exception e2) {
						System.out.println("错误，录入的是非法字符，请重新输入数字");
					}
				}
			}
		}

	}
}
