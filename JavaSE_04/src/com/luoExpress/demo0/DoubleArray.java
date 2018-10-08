package com.luoExpress.demo0;

public class DoubleArray {
	public static void main(String[]args){
		double[][] arr= new double[3][4];
		arr[0][1]=10.5;
		arr[2][3]=100.5;
		//long[][] larr = {{0},{0,0,0},{0,0}};
		//随机产生1000以内的100个数，把他们放到二维数组10*10中，并遍历
		long[][] larr = new long[3][];
		larr[0] = new long[1];//第一行一个元素
		larr[1] = new long[3];//第二行有三个元素
		larr[2] = new long[2];//第三行有两个元素
				
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}
