package com.louExpress.demo;

public class PersonDemo {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("allan");
		person.setAge(21);
		
		Person person2 = new Person();
		person2.setName("allan");
		person2.setAge(21);
		System.out.println(person2.equal(person));
		System.out.println(person.getName()+"  "+person.getAge());
	}
}