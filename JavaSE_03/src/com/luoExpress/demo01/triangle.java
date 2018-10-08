package com.luoExpress.demo01;

public class triangle {
	public static void main(String[] args) {
		/*
		 * 打印1到100的和 int sum = 0; for(int i = 1; i <= 100; i++){ sum += i; }
		 * System.out.println(sum);
		 */

		// 打印直角三角形
		/*
		 * for(int j = 1;j <= 9; j++){ for(int i = 0; i < j; i++){
		 * System.out.print("*"); } System.out.println(); }
		 */

		// 打印等腰三角形
		for (int a = 0; a < 8; a++) {
			for (int b = 8; b > a; b--) {
				System.out.print(" ");
			}
			for (int b = 1; b < a * 2; b++) {
				System.out.print("*");// 1,3,5,7
			}
			System.out.println();
		}
	}
}
