package com.leetcode.exercise;

public class SumArray {
	public static void main(String[] args) {
		int []arr={1,2,3,4,6,5,7};
		SumArray2 obj = new SumArray2(arr);
		System.out.println(obj.sumArray(0, 3));
	}
/*	public static int sumArray(int[]arr,int i,int j){
		int sum=0;
		if(j>arr.length-1||i<0) return -1;
		for(int k=i;k<j;k++){
			sum+=arr[k];
		}
		return sum;
	}*/
}
class SumArray2{
	int []arr;

	public SumArray2(int[] num) {
		arr = num;
	}
	public int sumArray(int i,int j){
		int sum=0;
		if(j>arr.length-1||i<0) return -1;
		for(int k=i;k<=j;k++){
			sum+=arr[k];
		}
		return sum;
	}
}
