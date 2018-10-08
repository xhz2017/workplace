package com.luoExpress.demo0;

import java.util.*;

public class FindMax {
	public static void main(String[] args) {
		int[] arr = new int[100];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1000) + 1;
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		int max = arr[0];
		int data =0;
		for (int j = 0; j < arr.length; j++){
			for (int i = j; i < arr.length; i++) {
				if(arr[j] < arr[i]){
					data = arr[j];
					arr[j] = arr[i];
					arr[i] = data;
				}
			}
		}
		System.out.println();
		for (int i = 1; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("max is " + max);
	}
}
