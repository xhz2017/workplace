package com.luoExpress.demo01;
import java.util.*;
public class Day3Exercise6 {
	public static void main(String[] args) {
		// ��д��������5��1��10֮����������������ӡ���������̨
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int num = random.nextInt(10) + 1;
			System.out.println(num);
		}
	}
}
