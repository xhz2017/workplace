package com.louExpress.exercise;

import java.util.ArrayList;
@SuppressWarnings({ "rawtypes", "unused" })
public class Se07_Exercise08 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		Employee emp1 = new Employee();
		emp1.name = "��ɽ";
		emp1.salary = 1800;
		emp1.cardNo = "123";
		emp1.sex = "male";
		arraylist.add(emp1);//ֱ���򼯺�����Ԫ��
		Employee emp2 = new Employee();
		emp2.name = "����";
		emp2.salary = 2800;
		emp2.cardNo = "456";
		emp2.sex = "female";
		arraylist.add(emp2);//ֱ���򼯺�����Ԫ��
		Employee emp3 = new Employee();
		emp3.name = "����";
		emp3.salary = 3800;
		emp3.cardNo = "789";
		emp3.sex = "male";
		arraylist.add(emp3);//ֱ���򼯺�����Ԫ��
		System.out.println(arraylist);
		Student stu1 = new Student();
		stu1.name = "zhangsha1";
		stu1.age = 18;
		stu1.sex = "male";
		arraylist.add(1,stu1);//ָ��λ�ò���
		System.out.println(arraylist);
		arraylist.remove(0);//ɾ��ָ������λ�õ�Ԫ��
		System.out.println(arraylist);
		
		Student stu2 = new Student();
		stu2.name = "zhangsha2";
		stu2.age = 18;
		stu2.sex = "male";
		arraylist.set(2,stu2);//�޸�ָ��������λ�õ�Ԫ��
		System.out.println(arraylist);
		System.out.println(arraylist.size());
		//����ָ��������ȡ����Ԫ��
		stu1 = (Student)arraylist.get(2);
		System.out.println(stu1.name+" "+stu1.age+" "+stu1.sex);
		
	}
}