package com.luoExpress.exercise;

public class NewAudi extends Car implements Autoparking,Autodriving {

	public void autodriving() {
		System.out.println("auto driving");
	}

	public void autoparking() {
	System.out.println("auto parking");
	}

}
