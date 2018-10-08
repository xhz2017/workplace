package com.luoExpress.demo01;
import java.util.*;
public class Day3Exercise12 {
	/* 键盘录入x的值，计算出y的并输出。		
	* x>=3	y = 2 * x + 1;
	* -1<x<3	y = 2 * x;
	* x<=-1	y = 2 * x - 1;*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("please input a number");
			int x = scanner.nextInt();
			if (x >= 3) {
				System.out.println(2 * x + 1);
			} else if (x > -1 && x < 3) {
				System.out.println(2 * x);
			} else if (x <= -1) {
				System.out.println(2 * x - 1);
			}
		} finally {
			scanner.close();
		}
	}
}
