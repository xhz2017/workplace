package com.louExpress.exercise;

/*
 * 	A:求两个数的和。
 B:判断两个数是否相等。
 C:输出九九乘法表。
 */
public class Demo {
	
	public int add(int a, int b) {
		return a + b;
	}

	public boolean equal(int a, int b) {
		return a == b;
	}
	public void showMulti() {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}
