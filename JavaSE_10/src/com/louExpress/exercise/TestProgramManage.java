package com.louExpress.exercise;

public class TestProgramManage {
	public static void main(String [] a){
		//demo1();
		//demo2();
		demo3();
	}
	public static void demo1(){
		Programmer programmer =new Programmer();
		programmer.name="��ɽ";
		programmer.id = "123456";
		programmer.saraly =20000;
		programmer.work();
		
		Manager manager = new Manager();
		manager.name="����";
		manager.id="243242354";
		manager.saraly=9873;
		manager.bonus = 10000;
		manager.work();
	}
	public static void demo2(){
		Student stu =new Student();
		stu.name="��ɽ";
		stu.age = 12;
		stu.eat();
		stu.study();
		
		Teacher teacher = new Teacher();
		teacher.name="����";
		teacher.age=35;
		teacher.eat();
		teacher.teach();
	}
	public static void demo3(){
		Cat cat =new Cat();
		cat.color="white";
		cat.legNum =4;
		cat.eat();
		cat.catchMouse();
		
		Dog dog = new Dog();
		dog.color="black";
		dog.legNum =4;
		dog.eat();
		dog.lookHome();

	}
}