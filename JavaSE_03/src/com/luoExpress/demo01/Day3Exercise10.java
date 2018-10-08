package com.luoExpress.demo01;

public class Day3Exercise10 {
	public static void main(String[] args) {
		/*我国最高山峰是珠穆朗玛峰，8848米。
		现在我有一张足够大的纸，它的厚度是0.01米。
		请问，我折叠多少次，可以折成珠穆朗玛峰的高度。*/
		double high = 0.01;
		int times = 0;
		while (high < 9948) {
			times++;
			high *= 2;//折叠一次，厚度加倍
		}
		System.out.println("total times is " + times);
	}
}
