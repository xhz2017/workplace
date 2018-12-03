package com.luo.exception;

public class Person {
	private String name;
	private int age;
	public Person() {
	}
	public Person(String name, int age) throws NoAgeException {
		if(age <0 || age >200)
		{
			throw new NoAgeException("年龄不合法");
		}
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
	public void setAge(int age) throws NoAgeException {
		if(age <0 || age >200)
		{
			throw new NoAgeException("年龄不合法");
		}
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
}
