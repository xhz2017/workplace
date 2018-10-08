package com.louExpress.demo;

import java.util.*;

public class DataManager {
	ArrayList<Goods> arrListcout;
	Scanner scanner;
	public static void main(String[] args) {
		DataManager dm = new DataManager();
		//初始化
		dm.init();
		//循环运行
		dm.loop();
	}
	public void loop(){
		int key;
		while (true) {
			showMenu();
				key = scanner.nextInt();
				switch (key) {
				case 1:
					show();
					break;
				case 2:
					update();
					show();
					break;
				case 3:
					return;
				default:
					break;
				}
			}
	}
	public void showMenu() {
		System.out.println("-----------庫存清單----------------");
		System.out.println("1---显示库存");
		System.out.println("2---修改商品库存数量");
		System.out.println("3---退出");
		System.out.println("请输入要执行的操作序号:");
	}

	public void show() {
		double size[] = { 13.3, 14.0, 15.6 };
		double price[] = { 6988.88, 5999.99, 4999.50 };
		String[] strArray = { "MacBookAir    ", "Thinkpad450   ",
				"asus-fl5800   " };

		System.out.println("------------------庫存清单----------------");
		System.out
				.println("品名                      规格                             价格                                   数量");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(arrListcout.get(i).name+"      " + arrListcout.get(i).size + "    " + arrListcout.get(i).price
					+ "    " + arrListcout.get(i).count);
		}
		System.out.println("----------------------------------------------");
		System.out.print("数量");
		System.out.println(arrListcout.get(0).count + arrListcout.get(1).count
				+ arrListcout.get(2).count);
		System.out.print("总价");
		System.out.println(arrListcout.get(0).price * arrListcout.get(0).count + arrListcout.get(1).price
				* arrListcout.get(1).count + arrListcout.get(2).price * arrListcout.get(2).count);
	}

	public void init() {
		arrListcout= new ArrayList<Goods>();
		scanner  = new Scanner(System.in);
		Goods g1 = new Goods();
		g1.name = "MacBookAir";
		g1.size = 13.3;
		g1.count = 5;
		g1.price = 6988.88;
		arrListcout.add(g1);
		Goods g2 = new Goods();
		g2.name = "Thinkpad450";
		g2.size = 14.0;
		g2.count = 6;
		g2.price = 5999.99;
		arrListcout.add(g2);
		Goods g3 = new Goods();
		g3.name = "asus-fl5800";
		g3.size = 15.6;
		g3.count = 7;
		g3.price = 4999.50;
		arrListcout.add(g3);

	}

	public void update() {
		// 使用迭代器
		for (Iterator<Goods> iterator = arrListcout.iterator(); iterator
				.hasNext();) {
			Goods g = (Goods) iterator.next();
			System.out.println("请输入"+g.name+"数量");
			int key = scanner.nextInt();
			g.count = key;
		}
	}
}
