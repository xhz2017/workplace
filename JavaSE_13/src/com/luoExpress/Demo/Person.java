package com.luoExpress.Demo;

public class Person {
	String name;
	int age;

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, int age) {
		this(name);
		this.age = age;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
