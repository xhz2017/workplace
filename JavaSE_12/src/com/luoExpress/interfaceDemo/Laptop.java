package com.luoExpress.interfaceDemo;

public class Laptop {

	public void run() {
		System.out.println("Laptop runing");
	}

	public void shutdown() {
		System.out.println("Laptop shutdown");
	}

	public void usbUse(USB usb) {
		usb.open();
		usb.close();
	}
}
