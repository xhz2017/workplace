package com.louExpress.demo;

public class SalescountDemo {
	public static void main(String[] args) {
		int[][] salescount = { { 11, 12 }, { 21, 22, 23 }, { 31, 32, 33, 34 } };
		int[][] arr = new int[3][];
		arr[0] = new int[]{11,12};
		arr[1] = new int[]{21,22,23};
		arr[2] = new int[]{31,32,33,34};
		int total = 0;
		int[] group = { 0, 0, 0 };
		for (int i = 0; i < salescount.length; i++) { //total get
			for (int j = 0; j < salescount[i].length; j++) {  //only one group add
				group[i] += salescount[i][j];
			}
			total += group[i];
			System.out.println("group " + (i + 1) +'\t' + "sales is " + group[i]);
		}
		System.out.println("total sales is " + total);
	}
}
