package com.louExpress.demo;

import java.util.*;

public class MethodDemo01 {
	public static void main(String[] args) {
		printRec();
		PrintRendef(3,4);
		int aver = GetAver(1,2,3);
		System.out.println(aver);
		int num=scannerNum();
		System.out.println(num);

	}

	public static void printRec() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static int scannerNum() {
		return new Scanner(System.in).nextInt();
	}

	public static void PrintRendef(int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print("*");
			System.out.println();

		}
	}
	
	public static int GetAver(int a, int b,int c) {
		return (a+b+c)/3;
	}
	
}
