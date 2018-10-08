package com.luoExpress.demo01;

public class Day3Exercise7 {
	//计算1-100之间的质数有多少个？将质数以及质数总数打印在控制台。
	//质数:只能被1和本身整除的数.
	public static void main(String[] args) {
		int num = 0;
		Day3Exercise7 day4 = new Day3Exercise7();
		for (int i = 1; i < 100; i++) {
			if (day4.isPrime(i)) {
				num++;
				System.out.println(i);
			}
		}
		System.out.println("total prime is " + num);
	}

	boolean isPrime(int num) {
		boolean isprime = true;
		int len = num / 2 + 1;// 没必要比较到ｎｕｍ
		for (int i = 2; i < len; i++) {
			if (num % i == 0) {
				isprime = false;
				break;
			}
		}
		return isprime;
	}
}
