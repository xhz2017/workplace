package com.louExpress.demo;

import java.util.*;

public class StuRondomDemo {
	public static void main(String[] args) {
		//1 ��ʼ�����M
		String[] stuName = { "zhang 1", "zhang 2", "zhang 3", "zhang 4",
				"zhang 5", "zhang 6", "zhang 7", "zhang 8", "zhang 9",
				"zhang 10" };
		//2 ��ӡ
		for (int i = 0; i < stuName.length; i++)
			System.out.println(stuName[i]);
		//3 �c��
		Random random = new Random();
		int num = random.nextInt(stuName.length);
		System.out.println("Luck name: "+stuName[num]);
	}
}
