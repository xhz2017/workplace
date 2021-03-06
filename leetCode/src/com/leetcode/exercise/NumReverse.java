package com.leetcode.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class NumReverse {
	public static void main(String[] args) {

		/*
		 * String s2 = String.valueOf(-23400); StringBuilder sb = new
		 * StringBuilder(s2); String s3= sb.reverse().toString();
		 * System.out.println(Integer.parseInt(s3));
		 */
		// demo1();
		/*
		 * int[] arr = { 1, 5, 6, 7, 9 }; System.out.println(demo2(arr, 16));
		 */
		reverse2(-2300);
/*		int[] arr = { 0, 1, 2, 2, 4, 3, 6 };
		System.out.println(demo4(arr));*/
	}

	public static int reverse2(int num) {
		String s = num < 0 ? new StringBuffer(-num).append('-').reverse()
				.toString() : new StringBuffer(num).reverse().toString();
		return Integer.parseInt(s);
	}

	private static int demo3(int[] arr) {
		Arrays.sort(arr);
		HashSet<Integer> hs = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			hs.add(new Integer(arr[i]));
		}
		int[] arr2 = new int[arr.length];
		int i = 0;
		for (Integer integer : hs) {
			arr2[i++] = integer.intValue();
		}
		System.out.println("");
		for (int j = 0; j < arr2.length; j++) {
			if (arr2[j] != j) {
				return j;
			}
		}
		return -1;

	}

	private static int demo4(int[] arr) {
		Arrays.sort(arr);
		Set<Integer> hs = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		Integer[] integer = new Integer[arr.length];
		hs.toArray(integer);
		for (int i = 0; i < integer.length; i++) {
			if (integer[i] != i) {
				return i;
			}
		}
		return 0;
	}

	private static int demo5(int[] arr) {
		Set<Integer> hs = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (!hs.contains(i)) {
				return i;
			}
		}
		return 0;
	}

	private static String demo2(int[] arr, int result) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == result) {
					System.out.println(arr[i] + "+" + arr[j] + "=" + result);
					return new String("[" + i + "," + j + "]");
				}
			}
		}
		return "no found";
	}

	private static void demo1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input int num:");
		String s = sc.next();

		try {
			int data = Integer.valueOf(s).intValue();
			System.out.println(reverse(data));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static int reverse(int num) {
		int result = 0;
		int sign = 1;
		// Խ�緵��0
		if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) {
			return 0;
		}
		if (num < 0) {
			sign = -1;
			num = num * sign;
		}
		while (num % 10 == 0)
			num = num / 10;
		String s = Integer.toString(num);
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			char tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
		String s2 = new String(arr);
		return Integer.valueOf(s2).intValue() * sign;
	}
}
