package com.luoExpress.Exercise;
import java.util.Scanner;
public class Day4Excise2 {
	public static void main(String[]args){
/*	2.�����������󣬲��ô���ʵ�֣�
	(1)���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼��
	(2)�ǹ��ʵ��������£�
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	(3)����û�����Ĺ���Ϊ10����������Ϊ3000��
	�������к��ӡ��ʽ"��Ŀǰ������10�꣬��������Ϊ 3000Ԫ, 
	Ӧ�ǹ��� 5000Ԫ,�Ǻ��� 8000Ԫ"
*/
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("�����빤��");
			int workyears = scanner.nextInt();
			System.out.println("������Ĺ���Ϊ:" + workyears);
			System.out.println("�������������");
			int basesalary = scanner.nextInt();
			System.out.println("������Ļ�������Ϊ:" + basesalary);
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
				System.out.println("�������");
				break;
			}
			totalsalary = basesalary + addsalary;
			System.out.println("��Ŀǰ������" + workyears + "�꣬��������Ϊ" + basesalary
					+ "Ԫ,Ӧ�ǹ���" + addsalary + "Ԫ,�Ǻ���" + totalsalary + "Ԫ");
		} finally {
			scanner.close();
		}
	}
}
