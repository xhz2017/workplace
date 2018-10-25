package com.luoExpress.exercise;

public class Test_Phone {
	public static void main(String[] args) {
		OldPhone o = new OldPhone();
		NewPhone n = new NewPhone();
		o.call();
		o.sendMessage();
		n.call();
		n.sendMessage();
		n.playGame();
	}
}
