package com.luoExpress.Eclipse;

import java.awt.Stroke;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.luoExpress.Demo.Utils;
import com.luoExpress.bean.Student;

public class Demo {

	public static void main(String[] args) {
		// demo1();
		// demo2();
		int[] arr = { 24, 69, 80, 57, 13 };
		int[] arr2 = { 11, 22, 33, 44, 55, 66, 77 };
		int data = 22;
		// int index = binarySearch(arr2, data);
		Scanner scanner = new Scanner(System.in);
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				int num = (int)(o2.getAge()-o1.getAge());
				return num==0?1:num;
			}
		});
		while(true){
			System.out.println("请输入学生姓名，语文成绩，数学成绩，英语成绩：quit表示退出");
			String strname =scanner.nextLine();
			if("quit".equals(strname)) break;
			String str1 =scanner.nextLine();
			Student stu= new Student(strname,Integer.parseInt(str1));
			ts.add(stu);
		}
		for (Student student : ts) {
			System.out.println(student);
		}
	}

	private static void demo12() {
		Scanner scanner = new Scanner(System.in);
		 String str = scanner.nextLine();
		 char[] ch = str.toCharArray();
		 sort(ch);
		 for (int j = 0; j < ch.length; j++) {
			System.out.println(ch[j]);
		}
	}

	private static void dem011() {
		int i = 100;
		String string = int2String(i);
		System.out.println(string);
		
		int x=100;
		Integer in= new Integer(x); //装箱
		 int y = in.intValue();//拆箱
	}

	public static void sort(char[] ch) {
		TreeSet<Character> tr = new TreeSet<Character>(new Comparator<Character>() {
			public int compare(Character o1, Character o2) {
				int num = o1.compareTo(o2);
				return num==0?1:num;
			}
		}); 
		for (int i = 0; i < ch.length; i++) {
			tr.add(ch[i]);
		}
		int i=0;
		for (Iterator iterator = tr.iterator(); iterator.hasNext();) {
			Character character = (Character) iterator.next();
			ch[i++]= character.charValue();
	
}

	}

	private static void demo9() {
		String s="91 27 46 38 50";
		 String[]sr = s.split(" ");
		 int []iar =new int[sr.length];
		 for (int j = 0; j < sr.length; j++) {
			 iar[j] = Integer.parseInt(sr[j]);
		}
		 Arrays.sort(iar);
		 StringBuilder sb= new StringBuilder();
		 for (int j = 0; j < iar.length; j++) {
			 if(j==iar.length-1){
				 sb.append(iar[j]); 
			 }else{
				 sb.append(iar[j]+" "); 
			 }
			 
		}
		 System.out.println(sb);
	}

	private static void demo8() {
		String regex="\\S";
		 System.out.println(" ".matches(regex));
		 System.out.println("1".matches(regex));
	}

	private static void demo7() {
		String regex="\\d";
		 System.out.println("q".matches(regex));
		 System.out.println("11".matches(regex));
	}

	private static void demo6() {
		String regex="[a-z&&[^bc]]";
		 System.out.println("b".matches(regex));
		 System.out.println("a".matches(regex));
	}

	private static String int2String(int i) {
		// int --->string
		String s1 = i + "";
		String s2 = String.valueOf(i);

		Integer integer = new Integer(i);
		String s3 = integer.toString();
		String s4 = Integer.toString(i);

		// string --->int
		String string2 = "200";
		Integer integer3 = new Integer(string2);
		int i4 = integer3.intValue();

		int i6 = Integer.parseInt(string2);

		return s2;
	}

	private static void demo5(int[] arr2, int data) {
		// Arrays.sort(arr);
		int index = Arrays.binarySearch(arr2, data);
		System.out.println(index);
	}

	public static int binarySearch(int[] arr2, int data) {
		int min = 0;
		int max = arr2.length - 1;
		int mid = (min + max) / 2;
		while (arr2[mid] != data) {
			if (arr2[mid] < data) {
				min = mid + 1;
			} else if (arr2[mid] > data) {
				max = mid - 1;
			}
			mid = (min + max) / 2;
			if (min > max) {
				return -1;
			}
		}
		return mid;
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void demo2() {
		String string = "heima";
		System.out.println(string);
		changes(string);
		System.out.println(string);
		StringBuffer sb = new StringBuffer("heima");
		changes(sb);
		System.out.println(sb);
	}

	public static void changes(StringBuffer sb) {
		sb.append("itcast2");
	}

	public static void changes(String string) {
		string += "itcast";
		System.out.println(string);
	}

	private static void demo1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input string:");
		String str = scanner.nextLine();
		System.out.println(Utils.revString(str));
	}

}
