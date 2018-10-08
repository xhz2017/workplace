package com.luoExpress.Exercise;
import java.util.Scanner;
public class Day4Excise2 {
	public static void main(String[]args){
/*	2.分析以下需求，并用代码实现：
	(1)根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
	(2)涨工资的条件如下：
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	(3)如果用户输入的工龄为10，基本工资为3000，
	程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 
	应涨工资 5000元,涨后工资 8000元"
*/
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("请输入工龄");
			int workyears = scanner.nextInt();
			System.out.println("你输入的工龄为:" + workyears);
			System.out.println("请输入基本工资");
			int basesalary = scanner.nextInt();
			System.out.println("你输入的基本工资为:" + basesalary);
			int totalsalary = 0;
			int addsalary = 0;
			switch (workyears / 5) {
			case 2:
				addsalary = 5000;
				break;
			case 1:
				addsalary = 2500;
				break;
			case 0:
				if (workyears == 0) {
					addsalary = 200;
				} else if (workyears >= 1 && workyears < 3) {
					addsalary = 500;
				} else {
					addsalary = 1000;
				}
				break;
			default:
				System.out.println("输入错误");
				break;
			}
			totalsalary = basesalary + addsalary;
			System.out.println("您目前工作了" + workyears + "年，基本工资为" + basesalary
					+ "元,应涨工资" + addsalary + "元,涨后工资" + totalsalary + "元");
		} finally {
			scanner.close();
		}
	}
}
