package com.luo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		//demo();
		//demo2();
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc2");
		list.add("abc4");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("---------------------------");
		HashSet<String> hs = new HashSet<String>();
		hs.add("abc");
		hs.add("abc");
		hs.add("abc1");
		hs.add("abc2");
		it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

	private static void demo2() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("abc1");
		hashSet.add("abc2");
		hashSet.add("abc2");
		hashSet.add("abc4");
		
		for (Iterator iterator = hashSet.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

	private static void demo() {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}
}
