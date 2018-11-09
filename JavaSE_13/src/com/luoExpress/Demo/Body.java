package com.luoExpress.Demo;

public class Body {
	private boolean life=true;
	public class Heart{
		public void jump(){
			System.out.println("heart jump.");
			System.out.println("life:"+life);
		}
	}
}
