package com.luo.demo;

public class Demo_Exercise6 {
	//����String�����ϰ�⣬�������н����
	//demo1 ���Ϊ��true true
	//demo3 ���Ϊ��false true
	//demo4 ���Ϊ��true true
	//demo5 ���Ϊ��false true
	public static void main(String[] args) {
		demo1();//true true
		//demo2();
		//demo3();//false true
		//demo4();//true true
		//demo5();//false true
	}
	private static void demo5() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2)); 	
	}
	private static void demo4() {
		//byte b = 3 + 4;						
		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1 == s2); 				
		System.out.println(s1.equals(s2));	
	}
	private static void demo3() {//==�Ƚϵ��ǵ�ֵַ
		String s1 = new String("abc");					
		String s2 = "abc";						
		System.out.println(s1 == s2); 			
		System.out.println(s1.equals(s2));
	}
	private static void demo2() {
		//������������
		//������������,һ���ڳ�������,һ���ڶ��ڴ���
		String s1 = new String("abc");		
		System.out.println(s1);
	}
	private static void demo1() {				
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); 				
		System.out.println(s1.equals(s2)); 		
	}
}

