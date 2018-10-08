package com.luoExpress.demo01;
import java.util.*;
public class statementDemo {
	public static void main(String[] args) {
		int grade = 40;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个成绩");
		grade = scanner.nextInt();
		if (grade >= 80) {
			System.out.println("excellent");
		} else if (grade >= 70) {
			System.out.println("good");
		} else if (grade >= 60) {
			System.out.println("general");
		} else {
			System.out.println("bad");
		}
	}
}
