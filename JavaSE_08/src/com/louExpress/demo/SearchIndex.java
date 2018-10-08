package com.louExpress.demo;

import java.util.Scanner;

public class SearchIndex {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("please inout number:");
		int data = scanner.nextInt();
		int index = searchIndex(arr, data);
		if (index != -1) {
			System.out.println("the index is :" + index);
		} else {
			System.out.println("sorry,you input number is not exist.");
		}
	}

	public static int searchIndex(int[] arr, int data) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (data == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
