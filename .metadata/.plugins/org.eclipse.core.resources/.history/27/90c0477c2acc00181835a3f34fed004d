package com.louExpress.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDemo {
	public static void main(String[] args) {
		ArrayList<Student> stuArry = new ArrayList<Student>();
		init(stuArry);
		visite(stuArry);
		int index=getMaxage(stuArry);
		Student stu = stuArry.get(index);
		stu.name = "king";
		visite(stuArry);

	}

	public static void visite(ArrayList<Student> stuarray) {
		for (Student e : stuarray) {
			System.out.println(e.name + " " + e.age + "  " + e.sex);
		}
	}

	public static void init(ArrayList<Student> stuArry) {
		Student stu1 = new Student();
		stu1.name = "zhangsha1";
		stu1.age = 18;
		stu1.sex = "male";
		stuArry.add(stu1);
		Student stu2 = new Student();
		stu2.name = "zhangsha2";
		stu2.age = 28;
		stu2.sex = "female";
		stuArry.add(stu2);
		Student stu3 = new Student();
		stu3.name = "zhangsha3";
		stu3.age = 38;
		stu3.sex = "male";
		stuArry.add(stu3);
	}
	
	public static int getMaxage(ArrayList<Student> stuarray) {
		int max = 0;
		int index = 0;
		for (int i = 0; i < stuarray.size(); i++) {
			Student e = stuarray.get(i);
			if (max < e.age) {
				max = e.age;
				index = i;
			}
		}
		return index;
	}
}
