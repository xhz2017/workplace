package com.louExpress.demo;

public class Flower {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			int bai = i/100%10;
			int shi = i/10%10;
			int ge = i%10;
			
			if(i == bai*bai*bai+shi*shi*shi+ge*ge*ge){
				System.out.println(i);
			}
		}
	}
}
