package com.louExpress.demo;

public class Son extends Father{
	public String name;
	public String address;
	public int age=20;
	
	public void study(){
		System.out.println("I can study.");
	}
	
	public void work(){
		System.out.println("son can work."+super.age);
	}
}
