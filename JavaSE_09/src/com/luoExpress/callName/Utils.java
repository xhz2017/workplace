package com.luoExpress.callName;

import java.util.*;

public class Utils {
	// �洢ѧ������
	public void init(ArrayList<Student> arrList) {
		arrList.add(new Student("xie", 40, "male"));
		arrList.add(new Student("DJ", 40, "male"));
		arrList.add(new Student("��ţ��", 20, "male"));
		arrList.add(new Student("Free Fi", 20, "female"));
		arrList.add(new Student("paige", 20, "female"));
		arrList.add(new Student("������", 20, "female"));
	}

	// ����ѧ��
	public void show(ArrayList<Student> arrList) {
		// ʹ�õ�����
		for (Iterator<Student> iterator = arrList.iterator(); iterator
				.hasNext();) {
			System.out.println(iterator.next());
		}
	}

	// �����������(Random)
	public Student randomStudent(ArrayList<Student> arrList) {
		Random random = new Random();
		int num = random.nextInt(arrList.size());
		return arrList.get(num);
	}
}