package com.leetcode.exercise;

public class LeetCode_CountSegments {
	public static void main(String[] args) {
		String s="heloo";
		System.out.println(countSegments(s));
	}
    public static int countSegments(String s) {
    	s.trim();
    	char[]c = s.toCharArray();
    	int count =0;
    	boolean b=true;
    	for (int i = 0; i < c.length; i++) {
			if(c[i]!=' '){
				if(b){
					b = false;
					count++;
				}
			}else{
				b=true;
			}
		}
        return count;
    }
}
