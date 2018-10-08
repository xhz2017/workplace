package com.louExpress.demo;

public class MethodOverloadDemo01 {
	public static void main(String[] args) {
		int sum = add(2,3);
		System.out.println(sum);
		sum = add(4,3.9);
		System.out.println(sum);
		sum = add(4,3,5);
		System.out.println(sum);
	}
	public static int add(int a, int b){
		return a+b;
	}
	public static int add(double a, double b){
		return (int)(a+b);
	}
	public static int add(int a, int b,int c){
		return a+b+c;
	}
	
}
