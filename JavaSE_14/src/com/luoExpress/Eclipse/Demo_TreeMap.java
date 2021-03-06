package com.luoExpress.Eclipse;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.luoExpress.bean.Student;

public class Demo_TreeMap {
	public static void main(String[] args) {
		//demo1();
		//demo2();
		String str ="aaadddggg";
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
/*		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}*/
		for(char c:arr){
			map.put(c, map.containsKey(c)?map.get(c)+1:1);
		}
		for (Character c : map.keySet()) {
			System.out.print(c+"--"+map.get(c));
		}
		System.out.println();
		System.out.println(map);
	}

	private static void demo2() {
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>() {

			public int compare(Student s1, Student s2) {
				int num = s1.getName().compareTo(s2.getName());
				return num==0?s1.getAge()-s2.getAge():num;
			}
		});
		tm.put(new Student("zhagnsan",23), "beijing");
		tm.put(new Student("lisi",24), "shanghai");
		tm.put(new Student("wangwu",25), "shenzhen");
		System.out.println(tm);
	}

	private static void demo1() {
		TreeMap<Student, String> tm = new TreeMap<Student, String>();
		tm.put(new Student("zhagnsan",23), "beijing");
		tm.put(new Student("lisi",24), "shanghai");
		tm.put(new Student("wangwu",25), "shenzhen");
		System.out.println(tm);
	}
}
