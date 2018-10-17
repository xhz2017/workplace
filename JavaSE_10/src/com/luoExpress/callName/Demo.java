package com.luoExpress.callName;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Utils utils = new Utils();
		//存储学生
		ArrayList<Student> list = utils.init();
		//遍历学生名单
		utils.show(list);
		//随机点名功能是实现(Random)
		Student stu = utils.randomStudent(list);
		System.out.println("-------------------------------");
		System.out.println("被点名学生是：" + stu.getName());

	}
}
