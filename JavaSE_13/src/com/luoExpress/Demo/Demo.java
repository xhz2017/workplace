package com.luoExpress.Demo;

public class Demo {

	public static void main(String[] args) {
		// demo1();
		// demo2();
		// Demo3();
		//Demo4();// ����С�����ֵĴ���
		int[] arr= {1,2,3,4};
		StringBuffer sb = array2string(arr);
		System.out.println(sb);
	}

	private static StringBuffer array2string(int [] arr) {

		StringBuffer sb= new StringBuffer("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!= arr.length-1){
				sb.append(i+",");
			}
			else{
				sb.append(i+"]");
			}
		}
		return sb;
	}

	private static void Demo4() {
		// ����С�����ֵĴ���
		int count = 0;
		String sbig = "woaihaizhou,haizhouhaizhouaiwo,shenmeshihoudoushixianzhaodaogohaizhoungzuoxian";
		String small = "haizhou";
		int index = 0;
		while (index == -1) {
			index = sbig.indexOf(small, index);
			if (index != -1) {
				count++;
				index += small.length();
			}
		}
		System.out.println(count);
	}

	private static void Demo3() {
		Party p = new Party();
		p.buffBall();
	}

	private static void demo2() {
		Body.Heart bh = new Body().new Heart();
		bh.jump();
	}

	private static void demo1() {
		Person p1 = new Person("zhangsan", 12);
		Person p2 = new Person("zhangsan2", 24);
		p1 = p2;
		System.out.println(p1);
	}
}