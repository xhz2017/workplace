package com.luoExpress.demo0;

import java.util.*;

public class SwitchDemo01 {
	public static void main(String[] args) {
		// Ҫ���������֣���ʾ��Ӧ������
/*		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("������һ������");
			int iweek = scanner.nextInt();
			switch (iweek) {
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("�������");
				break;
			}
		} finally {
			scanner.close();
		}*/
		
		// Ҫ�������ַ�����ʾ��Ӧ������
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("������һ������");
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
				System.out.println("������");
				break;
			case "sun":
				System.out.println("������");
				break;
			default:
				System.out.println("�������");
				break;
			}
		} finally {
			scanner.close();
		}
	}
}
