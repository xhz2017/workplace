package com.louExpress.demo;

public class CarDemo {
	String brand;
	int size;
	String type;
	
	public CarDemo(){
		
	}
	public CarDemo(String brand,int size,String type){
		this.brand = brand;
		this.size = size;
		this.type = type;
	}
	public void run(){
		System.out.println("runing....");
	}

}
