package com.luoExpress.Demo;

public class Demo_Stringbuffer {
	
/*	下面的需求所对应的方法，要求大家自己动手在API中查找，并进行方法使用。
	从指定位置开始，到末尾结束，截取该字符串缓冲区，返回新字符串
	在原有字符串缓冲区内容基础上，删除指定位置上的字符
*/
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("sdfjava,sdfsjava");
		
		while (sb.indexOf("java") > 0)
			sb.delete(sb.indexOf("java"), sb.indexOf("java") + 4);
		System.out.println(sb);
	}
}
