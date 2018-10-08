package com.louExpress.demo;

public class StudentDemo {
	String name;
	int age;
	String sex;
	
	public StudentDemo(){
		
	}
	public StudentDemo(String name,int age,String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void study(){
		System.out.println("studying....");
	}

}
