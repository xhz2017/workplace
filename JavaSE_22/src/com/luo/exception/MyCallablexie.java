package com.luo.exception;

import java.util.concurrent.Callable;

public class MyCallablexie implements Callable<Integer>  {
	// ��Ա����
	int x = 5;
	int y = 3;

	// ���췽��
	public MyCallablexie() {
	}

	public MyCallablexie(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Integer call() throws Exception {
		return x+y;
	}

}
