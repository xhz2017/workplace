package com.luoExpress.Demo;

public class JavaDevelop extends Development {
	public JavaDevelop(String workNo, String name, String partment) {
		super(workNo, name, partment);
	}

	public void work() {
		System.out.println("Ա������Ϊ" + this.getWorkNo() + "��" + this.getName()
				+ "��Ա���������з��Ա���վ");
	}
}
