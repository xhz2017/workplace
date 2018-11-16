package com.luo.demo;

public class Demo2 {
	public static void main(String[] args) {
		int[] src = {12,12,34,43,55,67,876,234};
		int[] target = new int[3];
		System.arraycopy(src, 2, target, 0, 3);
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i]);
		}
	}
}
