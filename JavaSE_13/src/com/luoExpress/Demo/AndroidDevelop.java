package com.luoExpress.Demo;

public class AndroidDevelop extends Development {
	public AndroidDevelop(String workNo, String name, String partment) {
		super(workNo, name, partment);
	}

	public void work() {
		System.out.println("Ա������Ϊ" + this.getWorkNo() + "��" + this.getName()
				+ "Ա���������з��Ա��ֻ��ͻ������");
	}
}
