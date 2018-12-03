package com.leetcode.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_FindAnagrams {
	public static void main(String[] args) {
		// demo1();
		String s = "saaaaffaasdfsaafaagfhgf";
		String p = "aa";
		System.out.println(findAnagrams(s, p));

	}

	public static List<Integer> findAnagrams(String s, String p) {
		if (s.length() < p.length()) {
			String s1 = s;
			s = p;
			p = s1;
		}
		char[] ch2 = p.toCharArray();
		Arrays.sort(ch2);
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (s.equals("") || p.equals("")) {
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

	public static List<Integer> findAnagrams2(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();
		if (s == null || s.length() == 0 || p == null || p.length() == 0)
			return list;
		int[] hash = new int[256]; // character hash
		for (char c : p.toCharArray()) {
			hash[c]++;
		}
		int left = 0, right = 0, count = p.length();
		while (right < s.length()) {
			if (hash[s.charAt(right++)]-- >= 1)
				count--;
			if (count == 0)
				list.add(left);
			if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0)
				count++;
		}
		return list;
	}
    public static List<Integer> findAnagrams3(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        if (p == null || s == null || s.length() < p.length()) return res;
        int m = s.length(), n = p.length();
        for (int i = 0; i < m-n+1; i++) {
            String cur = s.substring(i, i+n);
            if (helper(cur, p)) res.add(i);
        }
        return res;
    }
    public static boolean helper(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) return false;
        int[] dict = new int[26];
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            dict[ch-'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            dict[ch-'a']--;
            if (dict[ch-'a'] < 0) return false;
        }
        return true;
    }
}
