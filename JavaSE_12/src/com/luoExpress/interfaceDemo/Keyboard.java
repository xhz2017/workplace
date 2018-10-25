package com.luoExpress.interfaceDemo;

public class Keyboard implements USB{
	public void open() {
		System.out.println("Keyboard open");
	}

	public void close() {
		System.out.println("Keyboard close");
	}
}
