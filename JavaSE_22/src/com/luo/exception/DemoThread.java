package com.luo.exception;

public class DemoThread {
	public static void main(String[] args) {
		//����Ʊ����
		Ticket ticket = new Ticket();
		
		//����3������
		Thread t1  = new Thread(ticket, "�齱��1");
		Thread t2  = new Thread(ticket, "�齱��2");
		
		t1.start();
		t2.start();
	}
}
