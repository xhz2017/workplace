package com.luoExpress.Exercise;
import java.util.Scanner;
public class Day4Excise1 {
	public static void main(String[]args){
/*		1.编写代码实现如下内容：if语句实现考试成绩分等级(使用switch语句)。
		[90-100]	A等。
		[80-90) 	B等。
		[70-80) 	C等。
		[60-70) 	D等。
		[0-60)  	E等。
		请根据给定成绩，输出对应的等级。
		说明："["表示包含，")"表示不包含*/
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("请输入一个成绩");
			int number = scanner.nextInt();
			System.out.println("你输入的数据为:" + number);
			switch (number / 10) {
			case 10:
			case 9:
				System.out.println("A等");
				break;
			case 8:
				System.out.println("B等");
				break;
			case 7:
				System.out.println("C等");
				break;
			case 6:
				System.out.println("D等");
				break;
			default:
				System.out.println("E等");
				break;
			}
		} finally {
			scanner.close();
		}
	}
}
