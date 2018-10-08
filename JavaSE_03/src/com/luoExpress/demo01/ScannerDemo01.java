package com.luoExpress.demo01;
import java.util.*;
public class ScannerDemo01 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int number = scanner.nextInt();
		System.out.println("你输入的数据为:"+number);
		System.out.println("请输入一个字符串");
		String str = scanner.next();
		System.out.println("你输入的数据为:"+str);
		
	}
	

}
