package com.luo.exception;

public class InversionCount {
	// for test
	public static void main(String[] args) {
		int[] arr1 = { 1, 9, 3, 2, 5, 8, 6 };
		inversionCount(arr1);
		return;
	}
	public static int inversionCount(int[] arr) {
		if (arr == null || arr.length < 2) {
			return 0;
		}
		return mergeSort(arr, 0, arr.length - 1);
	}

	public static int mergeSort(int[] arr, int l, int r) {
		int mid = l + ((r - l) >> 1);
		int res = 0;
		if (l == r) {
			return 0;
		}
		if (l + 1 != r) {
			res = mergeSort(arr, l, mid);
			res += mergeSort(arr, mid + 1, r);
		}
		res += merge(arr, l, mid, r);
		return res;
	}

	public static int merge(int[] arr, int l, int m, int r) {
		int[] help = new int[r - l + 1];
		int i = 0;
		int p1 = l;
		int p2 = m + 1;
		int res = 0;
		while (p1 <= m && p2 <= r) {
			if (arr[p1] > arr[p2])
				System.out.println("{" + arr[p1] + "," + arr[p2] + "},");
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		while (p1 <= m) {
			help[i++] = arr[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (i = 0; i < help.length; i++) {
			arr[l + i] = help[i];
		}
		return res;
	}
}
