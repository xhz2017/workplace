package com.luoExpress.interfaceDemo;

public class ImplementDemo2 implements InterfaceDemo{
	public void show() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	public int getSum() {
		int sum=0;
		for (int i = 0; i < 5; i++) {
			sum +=i;
		}
		return sum;
	}
}
