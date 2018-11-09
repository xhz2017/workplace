package com.luoExpress.Demo;

public class Manager extends Employee {
	double bonus;

	public Manager() {
		super();
	}

	public Manager(String name, String workNo, double bonus) {
		super(name, workNo);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("Chef "+super.getName()+" 指挥厨师和服务员");
	}

}
