package com.luo.exception;

import java.util.concurrent.Callable;

public class MyCallablexie implements Callable<Integer>  {
	// 成员变量
	int x = 5;
	int y = 3;

	// 构造方法
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
