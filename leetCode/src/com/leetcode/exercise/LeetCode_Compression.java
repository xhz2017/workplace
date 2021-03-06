package com.leetcode.exercise;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCode_Compression {
	public static void main(String[] args) {
		char[] chars = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b',
				'a', 'a' };
		System.out.println(compress(chars));
		System.out.println(chars);
	}

	public static int compress(char[] chars) {
		StringBuffer sb = new StringBuffer();
		sb.append(chars[0]);
		int count = 1;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] != chars[i - 1]) {
				if (count > 1) {
					sb.append(Integer.toString(count).toCharArray());
				}
				sb.append(chars[i]);
				count = 1;
			} else {
				count++;
				if (i == chars.length - 1) {
					if (count > 1)
						sb.append(Integer.toString(count).toCharArray());
				}
			}
		}
		for (int i = 0; i < sb.length(); i++) {
			chars[i] = sb.charAt(i);
		}
		return sb.length();
	}

	public static int compress3(char[] chars) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < chars.length; i++) {
			if (map.containsKey(chars[i])) {
				Integer value = map.get(chars[i]);
				if (value == null) {
					map.put(chars[i], 2);
				} else {
					map.put(chars[i], ++value);
				}
			} else {
				map.put(chars[i], null);
			}
		}
		Iterator<Character> it = map.keySet().iterator();
		StringBuffer sb = new StringBuffer();
		while (it.hasNext()) {
			Character key = it.next();
			Integer value = map.get(key);
			sb.append(key);
			if (value != null)
				sb.append(value);
		}
		char[] ar = sb.toString().toCharArray();

		for (int i = 0; i < ar.length; i++) {
			chars[i] = ar[i];
		}
		return ar.length;

	}

	public static int compress2(char[] chars) {
		int anchor = 0, write = 0;
		for (int read = 0; read < chars.length; read++) {
			if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
				chars[write++] = chars[anchor];
				if (read > anchor) {
					for (char c : ("" + (read - anchor + 1)).toCharArray()) {
						chars[write++] = c;
					}
				}
				anchor = read + 1;
			}
		}
		return write;
	}
}
