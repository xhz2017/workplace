package com.luoExpress.demo01;

public class breadDemo {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 4){
			System.out.println("x=" + x);
			if (x == 3){
				break;//��������ѭ��
				//continue;//��������ѭ��
			}
			x++;
		}
	}
}
