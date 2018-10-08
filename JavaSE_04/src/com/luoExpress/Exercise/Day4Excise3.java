package com.luoExpress.Exercise;
import java.util.Scanner;
public class Day4Excise3 {
	public static void main(String[]args){
/*	3.分析以下需求，并用代码实现：
	(1)键盘录入三个整数，按照从小到大的顺序输出
	(2)如果用户输入的是3 2 1，程序运行后打印格式"按照从小到大排序后的顺序为：1 2 3"

*/
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("请输入三个整数");
			int[] num = new int[3];
			num[0] = scanner.nextInt();
			num[1] = scanner.nextInt();
			num[2] = scanner.nextInt();
			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < num.length; j++) {
					if (num[j] < num[i]) {
						int data = num[i];
						num[i] = num[j];
						num[j] = data;
					}
				}
			}
			System.out.println("按照从小到大排序后的顺序为：" + num[0] + " " + num[1] + " "
					+ num[2] + " ");
		} finally {
			scanner.close();
		}
	}
}
