package com.luo.exception;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolRunnable {
	public static void main(String[] args) {
		//�����̳߳ض���
		ExecutorService service = Executors.newFixedThreadPool(2);//����2���̶߳���
		//����Runnableʵ������
		MyRunnable r = new MyRunnable();
		
		//�Լ������̶߳���ķ�ʽ
		//Thread t = new Thread(r);
		//t.start(); ---> ����MyRunnable�е�run()
		
		//���̳߳��л�ȡ�̶߳���,Ȼ�����MyRunnable�е�run()
		service.submit(r);
		//�ٻ�ȡ���̶߳��󣬵���MyRunnable�е�run()
		service.submit(r);
		service.submit(r);
//ע�⣺submit�������ý����󣬳��򲢲���ֹ������Ϊ�̳߳ؿ������̵߳Ĺرա���ʹ������߳��ֹ黹�����̳߳���

//�ر��̳߳�
		service.shutdown();
	}

}
