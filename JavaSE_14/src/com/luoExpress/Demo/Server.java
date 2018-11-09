package com.luoExpress.Demo;

public class Server extends Employee implements Ivip {

	public Server() {
		super();
	}
	public Server(String name, String workNo) {
		super(name,workNo);
	}
	public void iVip() {
		System.out.println("Servers "+super.getName()+" for vin VIP");
	}

	public void work() {
		System.out.println("Servers "+super.getName()+" serving");
	}

}
