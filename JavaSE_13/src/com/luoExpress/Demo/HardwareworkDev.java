package com.luoExpress.Demo;

public class HardwareworkDev extends MaintainDevelop {

	public HardwareworkDev(String workNo, String name, String partment) {
		super(workNo, name, partment);
	}

	public  void work(){
		System.out.println("Ա������Ϊ"+this.getWorkNo()+"��"+this.getName()+"��Ա���������޸���ӡ��");
	}
}
