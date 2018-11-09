package com.luoExpress.Demo;

public class AndroidDevelop extends Development {
	public AndroidDevelop(String workNo, String name, String partment) {
		super(workNo, name, partment);
	}

	public void work() {
		System.out.println("员工工号为" + this.getWorkNo() + "的" + this.getName()
				+ "员工，正在研发淘宝手机客户端软件");
	}
}
