package com.luo.exception;

public class MyRunnable implements Runnable {
	public void run() {
		System.out.println("��Ҫһ������");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("�������ˣ� " +Thread.currentThread().getName());
		System.out.println("������Ӿ,����󣬽����ص�����Ӿ��");
	}

}