package com.luo.exception;

import java.util.Random;

public class MyRunable implements Runnable {
	Random random = new Random();
	

	public void run() {
		
		while (true) {
			int num = random.nextInt(2);
			if (num % 2 == 0) {
				synchronized (MyLock.getLockA()) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("num:"+num+Thread.currentThread().getName()+ " wait lockB");
					synchronized (MyLock.getLockB()) {
						System.out.println(Thread.currentThread().getName() + "running");
					}
				}
			} else {
				synchronized (MyLock.getLockB()) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("num:"+num+Thread.currentThread().getName() + " wait lockA");
					synchronized (MyLock.getLockA()) {
						System.out.println(Thread.currentThread().getName() + "running");
					}
				}

			}
		}

	}
}
