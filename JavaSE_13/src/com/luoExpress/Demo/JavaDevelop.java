package com.luoExpress.Demo;

public class JavaDevelop extends Development {
	public JavaDevelop(String workNo, String name, String partment) {
		super(workNo, name, partment);
	}

	public void work() {
		System.out.println("员工工号为" + this.getWorkNo() + "的" + this.getName()
				+ "的员工，正在研发淘宝网站");
	}
}
