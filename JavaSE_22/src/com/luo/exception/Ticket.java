package com.luo.exception;

import java.util.ArrayList;

public class Ticket implements Runnable {
	//��100Ʊ
	int ticket = 100;
	int[] arr = {10,5,20,50,100,200,500,800,2,80,300}; 
	ArrayList list = new ArrayList();
/*	for(int i=0;i<list.length;i++){
		
	}*/

	
	//����������
	Object lock = new Object();
	public void run() {
		//ģ����Ʊ
		while(true){
			//ͬ�������
			synchronized (lock){
				if (ticket > 0) {
					//ģ���Ӱѡ���Ĳ���
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "������Ʊ:" + ticket--);
				}
			}
		}
	}
}