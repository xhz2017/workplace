package com.luo.exception;

public class Demo1 {
	public static void main(String[] args) {
		int[]arr={12,12,34};
		System.out.println(getElement(arr,4));
	}
	public static int getElement(int[] arr,int index){
		if(arr==null){
			throw new NullPointerException("空指针异常");
		}
		if(index<0||index>arr.length){
			throw new OutOfMemoryError("内存溢出,序号为"+index);
		}
		return arr[index];
	}
}
