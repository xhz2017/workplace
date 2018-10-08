package com.louExpress.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class StuRondomDemo {
	ArrayList<String> arrListStr = new ArrayList();

	public static void main(String[] args) {

		StuRondomDemo student = new StuRondomDemo();
		// 1 初始化数据
		student.init();
		// 2 打印
		student.show();

		// 3 點名
		Random random = new Random();
		int num = random.nextInt(student.size());
		System.out.println("Luck name: " + student.get(num));
	}

	public void init() {
		arrListStr.add("stu1");
		arrListStr.add("stu2");
		arrListStr.add("stu3");
		arrListStr.add("stu4");
		arrListStr.add("stu5");
		arrListStr.add("stu6");
		arrListStr.add("stu7");
		arrListStr.add("stu8");
		arrListStr.add("stu9");
		arrListStr.add("stu10");
	}

	public void show() {
		/*
		 for(int i=0;i<arrListStr.size();i++){
		 	System.out.print(arrListStr.get(i)+" "); 
		 } 
		 System.out.println();
		 
		 //for each,必须每个都遍历 
		 for(String e:arrListStr){ 
		 	System.out.print(e+" ");
		 } 
		 System.out.println();
		 */
		// 使用迭代器
		for (Iterator<String> iterator = arrListStr.iterator(); iterator
				.hasNext();) {
			String str = (String) iterator.next();
			System.out.print(str + " ");
		}
		System.out.println();
	}

	public void setdata(int i, String str) {
		arrListStr.set(i, str);
	}

	public void adddata(int i, String str) {
		arrListStr.add(i, str);
	}

	public int size() {
		return arrListStr.size();
	}

	public String get(int i) {
		return arrListStr.get(i);
	}
}
