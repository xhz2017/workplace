package com.luoExpress.interfaceDemo;

public class Test_Laptop {
	public static void main(String[] args) {
		Laptop la = new Laptop();
		Mouse mouse = new Mouse();
		Keyboard keyboard = new Keyboard();
		la.run();
		la.usbUse(mouse);
		la.usbUse(keyboard);
		la.shutdown();
	}
}
