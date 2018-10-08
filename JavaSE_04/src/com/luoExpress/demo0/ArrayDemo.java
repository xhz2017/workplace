package com.luoExpress.demo0;

public class ArrayDemo {
	public static void main(String[] args) {
		/*double[] doublearr = new double[5];
		for (int i = 0; i < doublearr.length; i++) {
			System.out.println(doublearr[i]);
		}*/
		//定义和初始化
		/*int[] iarr = { 100, 101, 102, 103 };
		//for的遍历
		for (int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i]);
		}
		//while的遍历
		int j = 0;
		while (j < iarr.length) {
			System.out.println(iarr[j]);
			j++;
		}*/
		int[] iarr2 = new int[10];
		for (int i = 100; i < 100 + iarr2.length; i++) {
			iarr2[i - 100] = i;
		}
		int j = 0;
		while (j < iarr2.length) {
			System.out.println(iarr2[j]);
			j++;
		}
	}
}
