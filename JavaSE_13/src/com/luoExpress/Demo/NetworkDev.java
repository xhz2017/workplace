package com.luoExpress.Demo;

public class NetworkDev extends MaintainDevelop {

	public NetworkDev(String workNo, String name, String partment) {
		super(workNo, name, partment);
	}

	public void work() {
		System.out.println("员工工号为" + this.getWorkNo() + "的" + this.getName()
				+ "的员工，正在检查网络是否畅通");
	}
}
