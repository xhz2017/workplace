package com.luoExpress.callName;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		Utils utils = new Utils();
		//�洢ѧ��
		ArrayList<Student> list = utils.init();
		//����ѧ������
		utils.show(list);
		//�������������ʵ��(Random)
		Student stu = utils.randomStudent(list);
		System.out.println("-------------------------------");
		System.out.println("������ѧ���ǣ�" + stu.getName());

	}
}