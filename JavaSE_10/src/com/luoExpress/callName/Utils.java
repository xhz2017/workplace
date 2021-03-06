package com.luoExpress.callName;

import java.util.*;

public class Utils {
	// 存储学生名单
	public ArrayList<Student> init() {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("xie", 40, "male"));
		list.add(new Student("DJ", 40, "male"));
		list.add(new Student("斗牛的", 20, "male"));
		list.add(new Student("Free Fi", 20, "female"));
		list.add(new Student("paige", 20, "female"));
		list.add(new Student("斑马斑", 20, "female"));
		return list;
	}

	// 遍历学生
	public void show(ArrayList<Student> arrList) {
		// 使用迭代器
		for (Iterator<Student> iterator = arrList.iterator(); iterator
				.hasNext();) {
			System.out.println(iterator.next());
		}
	}

	// 随机点名功能(Random)
	public Student randomStudent(ArrayList<Student> arrList) {
		Random random = new Random();
		int num = random.nextInt(arrList.size());
		return arrList.get(num);
	}
}
