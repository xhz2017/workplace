package com.luoExpress.callName;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Utils utils = new Utils();
		ArrayList<Student> list = new ArrayList<Student>();
		//�洢ѧ��
		utils.init(list);
		//����ѧ������
		utils.show(list);
		//�������������ʵ��(Random)
		Student stu = utils.randomStudent(list);
		System.out.println("-------------------------------");
		System.out.println("������ѧ���ǣ�" + stu.getName());

	}
}