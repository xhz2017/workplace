package com.luoExpress.callName;

import java.util.*;

public class Utils {
	// �洢ѧ������
	public ArrayList<Student> init() {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("xie", 40, "male"));
		list.add(new Student("DJ", 40, "male"));
		list.add(new Student("��ţ��", 20, "male"));
		list.add(new Student("Free Fi", 20, "female"));
		list.add(new Student("paige", 20, "female"));
		list.add(new Student("������", 20, "female"));
		return list;
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