package com.louExpress.demo;

import java.util.Arrays;
import java.util.Random;

public class SearchArray {

	public static void main(String[] args) {
		int[] arr = new int[100];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		Arrays.sort(arr);
		printArray(arr);
		System.out.println("-----------------------------");
		System.out.println("find " + binarySearch(arr, 13));
	}

	public static int binarySearch(int[] arr, int data) {
		int start = 0;
		int end = arr.length;
		while (start <= end) {
			if (arr[(start + end) / 2] == data) {
				return (start + end) / 2;
			} else if (arr[(start + end) / 2] > data) {
				end = (start + end) / 2 - 1;
			} else {
				start = (start + end) / 2 + 1;
			}
			System.out.println(start + "  " + end);
		}
		return -1;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
			if ((i + 1) % 10 == 0)
				System.out.println();
		}
	}
}
