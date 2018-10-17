package com.louExpress.demo;

public class DevelopDemo {
	public static void main(String [] a){
		Emploee dev = new JavaDevelop();
		dev.workNo = "123";
		dev.work();		
		Emploee dev2 = new AndroidDevelop();
		dev2.workNo = "124";
		dev2.work();
		Emploee dev3 = new HardwareworkDev();
		dev3.workNo = "125";
		dev3.work();		
		Emploee dev4 = new NetworkDev();
		dev4.workNo = "126";
		dev4.work();
	}
}
