package com.luoExpress.Demo;

public class HardwareworkDev extends MaintainDevelop {

	public HardwareworkDev(String workNo, String name, String partment) {
		super(workNo, name, partment);
	}

	public  void work(){
		System.out.println("员工工号为"+this.getWorkNo()+"的"+this.getName()+"的员工，正在修复打印机");
	}
}
