package com.luoExpress.Demo;

public abstract class Employee {
	private String name;
	private String workNo;

	public Employee() {
		super();
	}

	public Employee(String name, String workNo) {
		super();
		this.name = name;
		this.workNo = workNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkNo() {
		return workNo;
	}

	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

	public abstract void work();

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object instanceof Employee) {
			Employee employee = (Employee) object;
			return name.equals(employee.getName())
					&& workNo.equals(employee.getWorkNo());
		} else {
			return false;
		}
	}

	public String toString() {
		return new String("Employee [name:" + this.name + "workNo:"
				+ this.workNo + "]");
	}
}
