package com.leetcode.exercise;

public class LeetCode_Isomorphic {
	public static void main(String[] args) {
		String s="ab";
		String t="aa";	
		System.out.println(isIsomorphic(s,t));
	}
    public static boolean isIsomorphic(String s, String t) {
    	char[] cs = s.toCharArray();
    	char[] ts = t.toCharArray();
    	for (int i = 0; i < cs.length; i++) {
    		for (int j = 0; j < i; j++) {
				if(cs[i]==cs[j]){
					if(ts[i]!=ts[j]){
						return false;
					}
				}else{
					if(ts[i]==ts[j]){
						return false;
					}
				}
			}
		}
        return true;
    }
}
