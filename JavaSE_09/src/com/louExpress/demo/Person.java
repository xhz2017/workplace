package com.louExpress.demo;

public class Person {
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public boolean equal(Person person){
		if(this.name.equals(person.getName())&&this.age==person.getAge()){
			return true;
		}
		return false;
	}
	
	
}
