package com.louExpress.exercise;

import java.util.ArrayList;


/*String name;
String cardNo;
double salary;
String sex;*/

public class EmployeeDemo {
	public static void main(String[] args) {
		ArrayList<Employee> stuArry = new ArrayList<Employee>();
		init(stuArry);
		visite(stuArry);
	}

	public static void visite(ArrayList<Employee> stuarray) {
		for (Employee e : stuarray) {
			System.out.println(e.name + " " + e.cardNo + "  " + e.salary);
		}
	}

	public static void init(ArrayList<Employee> stuArry) {
		Employee stu1 = new Employee();
		stu1.name = "��ɽ";
		stu1.salary = 1800;
		stu1.cardNo = "123456";
		stuArry.add(stu1);
		Employee stu2 = new Employee();
		stu2.name = "��ɽ2";
		stu2.salary = 2800;
		stu2.cardNo = "123456";
		stuArry.add(stu2);
		Employee stu3 = new Employee();
		stu3.name = "��ɽ3";
		stu3.salary = 3800;
		stu3.cardNo = "123456";
		stuArry.add(stu3);
	}
}