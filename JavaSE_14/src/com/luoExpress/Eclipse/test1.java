package com.luoExpress.Eclipse;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��������");
		while(true){
			String str = scanner.nextLine();
			try {
				int num = Integer.parseInt(str);
				System.out.println(Integer.toBinaryString(num));
				break;
			} catch (NumberFormatException e) {
				try {
					new BigInteger(str);
					System.out.println("����¼�����һ��������������������������");
				} catch (Exception e1) {
					try {
						new BigDecimal(str);
						System.out.println("����¼�����С������������������");
					} catch (Exception e2) {
						System.out.println("����¼����ǷǷ��ַ�����������������");
					}
				}
			}
		}

	}
}
