package com.luoExpress.Demo;

public class NetworkDev extends MaintainDevelop {

	public NetworkDev(String workNo, String name, String partment) {
		super(workNo, name, partment);
	}

	public void work() {
		System.out.println("Ա������Ϊ" + this.getWorkNo() + "��" + this.getName()
				+ "��Ա�������ڼ�������Ƿ�ͨ");
	}
}
