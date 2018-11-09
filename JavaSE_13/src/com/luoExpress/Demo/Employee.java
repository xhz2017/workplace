package com.luoExpress.Demo;

public abstract class Employee {
	private String workNo;
	private String name;
	private String partment;

	public abstract void work();

	public Employee() {
		super();
	}

	public Employee(String workNo, String name, String partment) {
		super();
		this.workNo = workNo;
		this.name = name;
		this.partment = partment;
	}

	public String getWorkNo() {
		return workNo;
	}

	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPartment() {
		return partment;
	}

	public void setPartment(String partment) {
		this.partment = partment;
	}

	public String toString() {
		return "Emploee [workNo=" + workNo + ", name=" + name + ", partment="
				+ partment + "]";
	}

}
