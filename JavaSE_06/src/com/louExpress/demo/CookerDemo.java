package com.louExpress.demo;

public class CookerDemo {
	String brand;
	int size;
	String color;
	
	public CookerDemo(){
		
	}
	public CookerDemo(String brand,int size,String color){
		this.brand = brand;
		this.size = size;
		this.color = color;
	}
	public void heat(){
		System.out.println("heating....");
	}

}
