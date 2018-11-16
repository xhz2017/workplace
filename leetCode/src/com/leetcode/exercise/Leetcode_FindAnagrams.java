package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_FindAnagrams {
	public static void main(String[] args) {
		//demo1();
		String s = "aaaaaaaaaa";
		String p = "aaaaaaaaaaaaa";
		System.out.println(findAnagrams(s,p));

	}
	public static List<Integer> findAnagrams(String s, String p) {
		if(s.length()<p.length()){
			String s1=s;
			s=p;
			p=s1;
		}
		char[] ch2 = p.toCharArray();
		Arrays.sort(ch2);
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(s.equals("")||p.equals("")){
			return list;
		}
		for (int i = 0; i <= s.length() - ch2.length; i++) {
			char[] dstch = new char[ch2.length];
			s.getChars(i, i + ch2.length, dstch, 0);
			Arrays.sort(dstch);
			if ((dstch != null) && (Arrays.equals(dstch, ch2))) {
				list.add(i);
			}
		}
		return list;
	}
/*	public static List<Integer> findAnagrams2(String s, String p) {
		char[] ch2 = p.toCharArray();
		Arrays.sort(ch2);
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuffer sb = new StringBuffer(s);
		for (int i = 0; i <= sb.length() - ch2.length; i++) {
			char[] dstch = sb.substring(i, i+ch2.length).toCharArray();
			Arrays.sort(dstch);
			if ((dstch != null) && (Arrays.equals(dstch, ch2))) {
				list.add(i);
			}
		}
		return list;
	}*/

}
