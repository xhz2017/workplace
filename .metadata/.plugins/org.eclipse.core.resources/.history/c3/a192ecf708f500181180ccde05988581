package com.luo.exception;

public class DemoThread {
	public static void main(String[] args) {
		//创建票对象
		Ticket ticket = new Ticket();
		
		//创建3个窗口
		Thread t1  = new Thread(ticket, "抽奖箱1");
		Thread t2  = new Thread(ticket, "抽奖箱2");
		
		t1.start();
		t2.start();
	}
}
