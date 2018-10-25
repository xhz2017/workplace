package com.luoExpress.interfaceDemo;

public class Person {
	private String name;
	private int age;
	public Person() {
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public boolean Equals(Person p){
		return this.name.equals(p.getName())&&this.age == p.getAge();
	}
	
}
