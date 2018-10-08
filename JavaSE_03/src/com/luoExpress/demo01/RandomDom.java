package com.luoExpress.demo01;
import java.util.*;
public class RandomDom {
	public static void main(String[] args){
		Random random = new Random();
		int i = random.nextInt(100);
		 double d= random.nextDouble()*1000;
		 System.out.println(i);
		 System.out.println(Math.round(d));
	}
}
