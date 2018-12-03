package com.luo.exception;

import java.util.LinkedList;

public class TranslatorNum {
	public static void main(String[] args) {
		int n=5;
		int m=2;
		LinkedList<String> list = new LinkedList();
		translator(list,n,m);
		for (Object object : list) {
			System.out.print(object);
		}
	}
	
	private static void translator(LinkedList list,int n, int m) {
		if(n==0)
			return;
		list.addFirst(changeData(n,m));
		translator(list,n/m,m);
	}

	/*private static void translator(LinkedList list,int n, int m) {
		list.addFirst(changeData(n,m));
		while(n/m>0){
			n = n/m;
			list.addFirst(changeData(n,m));
			
		}
		return;
	}*/

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
