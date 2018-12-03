package com.luo.exception;

public class Test {

	public static void main(String[] args) {
		try {
			Person p = new Person("xie",220);
		} catch (NoAgeException e) {
			e.printStackTrace();
		}
	}

}
