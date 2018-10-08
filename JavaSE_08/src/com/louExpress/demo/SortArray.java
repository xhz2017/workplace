package com.louExpress.demo;

import java.util.Arrays;
import java.util.Random;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = new int[100];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1000);
		}
		//printArray(arr);
		long time1 =System.currentTimeMillis();
		//System.out.println();
		bubbleSort(arr);
		//Arrays.sort(arr);
		System.out.println(System.currentTimeMillis()-time1);
		System.out.println("-----------------------------");
		printArray(arr);
	}

	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
			if ((i + 1) % 10 == 0)
				System.out.println();
		}
	}
}
