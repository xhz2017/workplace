package com.luoExpress.exercise;

public class Test_Car {
	public static void main(String[] args) {
		NewAudi newaudi=new NewAudi();
		Audi audi=new Audi();
		newaudi.run();
		newaudi.autodriving();
		newaudi.autoparking();
		audi.run();
	}
}
