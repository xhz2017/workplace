package com.luoExpress.Eclipse;

import java.util.HashMap;

import com.luoExpress.bean.Student;

public class Demo5_HashMap {
	public static void main(String[] args) {
		HashMap<Student, String> hashmap = new HashMap<Student, String>();
		hashmap.put(new Student("zhangshan",23), "jiangxi");
		hashmap.put(new Student("zhangshan",23), "shanghai");
		hashmap.put(new Student("lisi",24), "fujian");
		System.out.println(hashmap);
	}
}
