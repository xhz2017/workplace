package com.luo.exception;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		// �����̳߳ض���
		ExecutorService threadPool = Executors.newFixedThreadPool(2);

		// ����һ��Callable�ӿ��������
		// MyCallable c = new MyCallable();
		MyCallablexie c = new MyCallablexie(100, 200);
		MyCallablexie c2 = new MyCallablexie(10, 20);

		// ��ȡ�̳߳��е��̣߳�����Callable�ӿ���������е�call()����, �����Ͳ���
		// <Integer> Future<Integer> submit(Callable<Integer> task)
		// Future �������
		Future<Integer> result = threadPool.submit(c);
		// �� Future �� get ���������صĽ������
		Integer sum = result.get();
		System.out.println("sum=" + sum);

		// ����ʾ
		result = threadPool.submit(c2);
		sum = result.get();
		System.out.println("sum=" + sum);
		// �ر��̳߳�(���Բ��ر�)
		threadPool.shutdown();
	}

}
