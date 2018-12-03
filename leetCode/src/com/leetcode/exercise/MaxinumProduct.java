package com.leetcode.exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxinumProduct {
	public static void main(String[] args) {
		int []arr = {-4,-3,-2,-1,0,6};
		System.out.println(maixproduct(arr));
	}
	public static int maixproduct(int[]nums){
		Arrays.sort(nums);
		int data=1;
		int data2=1;
		
		data = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
		data2 = nums[0]*nums[1]*nums[nums.length-1];
		return data >data2?data:data2;
	}
}
