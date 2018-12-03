package com.luo.exception;

import java.util.Arrays;

public class SmallSum {
	public static int smallSum(int[] arr) {
		if (arr == null || arr.length < 2) {
			return 0;
		}
		//return method2(arr);
		int res=0;
		int[] arr2 = copyArray(arr);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr[i]>arr2[j]){
					res += arr[i]*(arr2.length-j);
					break;
				}
			}
		}
		return res;
		//return mergeSort(arr, 0, arr.length - 1);
	}

	private static int method2(int[] arr) {
		int res=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] < arr[j] ){
					res +=  arr[i];
				}
			}
		}
		return res;
	}

	public static int mergeSort(int[] arr, int left, int right) {
		if (left == right) {
			return 0;
		}
		int mid = left + ((right - left) >> 1);
		return mergeSort(arr, left, mid) + mergeSort(arr, mid + 1, right) + merge(arr, left, mid, right);
	}

	public static int merge(int[] arr, int left, int m, int right) {
		int res = 0;
		for(int i=left;i<=m;i++){
			for(int j=m+1;j<=right;j++){
				if(arr[i] < arr[j] ){
					res +=  arr[i];
				}
			}
		}
		return res;
	}

	// for test
	public static int comparator(int[] arr) {
		if (arr == null || arr.length < 2) {
			return 0;
		}
		int res = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				res += arr[j] < arr[i] ? arr[j] : 0;
			}
		}
		return res;
	}

	// for test
	public static int[] generateRandomArray(int maxSize, int maxValue) {
		int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
		}
		return arr;
	}

	// for test
	public static int[] copyArray(int[] arr) {
		if (arr == null) {
			return null;
		}
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
		return res;
	}

	// for test
	public static boolean isEqual(int[] arr1, int[] arr2) {
		if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
			return false;
		}
		if (arr1 == null && arr2 == null) {
			return true;
		}
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	// for test
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// for test
	public static void main(String[] args) {
		int testTime = 500;
		int maxSize = 4;
		int maxValue = 10;
		boolean succeed = true;
		for (int i = 0; i < testTime; i++) {
			int[] arr1 = generateRandomArray(maxSize, maxValue);
			int[] arr2 = copyArray(arr1);

			int result1 = smallSum(arr1);
			int result2 = comparator(arr2);
			printArray(arr1);
			printArray(arr2);
			System.out.println("result1:"+result1+"result2:"+result2);
			if (result1 != result2) {
				succeed = false;
				printArray(arr1);
				printArray(arr2);
				break;
			}
		}

		System.out.println(succeed ? "Nice!" : "Fucking fucked!");
	}

}
