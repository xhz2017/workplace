package com.louExpress.exercise;

import java.util.ArrayList;

public class Se07_Exercise06 {
	public static void main(String[] args) {
		ArrayList<Phone> stuArry = new ArrayList<Phone>();
		init(stuArry);
		visite(stuArry);
	}

	public static void visite(ArrayList<Phone> stuarray) {
		for (Phone e : stuarray) {
			System.out.println(e.brand + " " + e.price + "  " + e.color);
		}
	}

	public static void init(ArrayList<Phone> stuArry) {
		Phone stu1 = new Phone();
		stu1.brand = "小米";
		stu1.price = 1800;
		stu1.color = "red";
		stuArry.add(stu1);
		Phone stu2 = new Phone();
		stu2.brand = "华为";
		stu2.price = 2800;
		stu2.color = "balck";
		stuArry.add(stu1);
		Phone stu3 = new Phone();
		stu3.brand = "乐视";
		stu3.price = 3800;
		stu3.color = "green";
		stuArry.add(stu3);
	}
}
