package com.luoExpress.Demo;

public class Chef extends Employee implements Ivip {
	public Chef() {
		super();
	}
	public Chef(String name, String workNo) {
		super(name,workNo);
	}
	public void iVip() {
		System.out.println("Chef "+super.getName()+" vip add more menu");
	}

	public void work() {
		System.out.println("Chef "+super.getName()+" is cooking");
	}
}
