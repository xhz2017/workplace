package com.luoExpress.demo0;

public class DoubleArray {
	public static void main(String[]args){
		double[][] arr= new double[3][4];
		arr[0][1]=10.5;
		arr[2][3]=100.5;
		//long[][] larr = {{0},{0,0,0},{0,0}};
		//�������1000���ڵ�100�����������Ƿŵ���ά����10*10�У�������
		long[][] larr = new long[3][];
		larr[0] = new long[1];//��һ��һ��Ԫ��
		larr[1] = new long[3];//�ڶ���������Ԫ��
		larr[2] = new long[2];//������������Ԫ��
				
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}
