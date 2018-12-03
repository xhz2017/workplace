package com.luo.exception;

public class Test {

	public static void main(String[] args) {
		MyRunable myRunable = new MyRunable();
		Thread thread1 = new Thread(myRunable);
		Thread thread2=new Thread(myRunable);
		thread1.start();
		thread2.start();
	}
}
