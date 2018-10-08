package com.luoExpress.demo01;
import java.util.*;
public class Day3Exercise6 {
	public static void main(String[] args) {
		// 编写程序，生成5个1至10之间的随机整数，并打印结果到控制台
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int num = random.nextInt(10) + 1;
			System.out.println(num);
		}
	}
}
