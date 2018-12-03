package com.luo.exception;

import java.util.LinkedList;

public class TranslatorNum {
	public static void main(String[] args) {
		int n=23421432;
		int m=16;
		LinkedList list = translator(n,m);
		for (Object object : list) {
			System.out.print(object);
		}
	}

	private static LinkedList translator(int n, int m) {
		LinkedList<String> list = new LinkedList();
		list.addFirst(changeData(n,m));
		while(n/m>0){
			n = n/m;
			list.addFirst(changeData(n,m));
			
		}
		return list;
	}

	private static String changeData(int n, int m) {
		String s;
		if(n%m<10){
			s=String.valueOf(n%m);
		}else{
			char a = (char) ('A'+(n%m-10));
			s=String.valueOf(a);
		}	
		return s;
	}
}
