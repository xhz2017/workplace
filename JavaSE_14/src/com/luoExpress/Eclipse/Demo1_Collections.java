package com.luoExpress.Eclipse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo1_Collections {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("bbc");
		list.add("bcd");
		list.add("gbc");
		list.add("bbc");
		list.sort(null);
		//Collections.reverse(list);
		//Collections.shuffle(list);
		System.out.println(Collections.max(list));
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "bcd"));
	}
}
