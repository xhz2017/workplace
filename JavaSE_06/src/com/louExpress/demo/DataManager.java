package com.louExpress.demo;

import java.util.*;

public class DataManager {
	public static void main(String[] args) {
		int num[] = { 5, 10, 18 };
		boolean isexit = false;
		int key;
		while (true) {
			showMenu();
			key = new Scanner(System.in).nextInt();
			switch (key) {
			case 1:
				show(num);
				break;
			case 2:
				updateNumber(num);
				show(num);
				break;
			case 3:
				isexit = true;
				break;
			default:
				break;
			}
			if (isexit)
				break;
		}
	}
	public static void showMenu() {
		System.out.println("-----------庫存清單----------------");
		System.out.println("1---显示库存");
		System.out.println("2---修改库存");
		System.out.println("3---退出运行");
		System.out.println("请选择");

	}

	public static void show(int[] num) {
		double size[] = { 13.3, 14.0, 15.6 };
		double price[] = { 6988.88, 5999.99, 4999.50 };
		String[] strArray = { "MacBookAir    ", "Thinkpad450   ",
				"asus-fl5800   " };

		System.out.println("-----------庫存清單----------------");
		System.out
				.println("品名                      规格                             价格                                   数量");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i] + size[i] + "    " + price[i]
					+ "    " + num[i]);
		}
		System.out.println("---------------------------------------");
		System.out.print("数量");
		System.out.println(num[0] + num[1] + num[2]);
		System.out.print("总价");
		System.out.println(price[0] * num[0] + price[1] * num[1] + price[2]
				* num[2]);
	}

	public static void updateNumber(int[] num) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入MacBookAir数量");
		int key = scanner.nextInt();
		num[0] = key;
		System.out.println("请输入Thinkpad450数量");
		key = scanner.nextInt();
		num[1] = key;
		System.out.println("asus-fl5800");
		key = scanner.nextInt();
		num[2] = key;
	}
}
