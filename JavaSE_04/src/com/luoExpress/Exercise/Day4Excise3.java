package com.luoExpress.Exercise;
import java.util.Scanner;
public class Day4Excise3 {
	public static void main(String[]args){
/*	3.�����������󣬲��ô���ʵ�֣�
	(1)����¼���������������մ�С�����˳�����
	(2)����û��������3 2 1���������к��ӡ��ʽ"���մ�С����������˳��Ϊ��1 2 3"

*/
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("��������������");
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
			System.out.println("���մ�С����������˳��Ϊ��" + num[0] + " " + num[1] + " "
					+ num[2] + " ");
		} finally {
			scanner.close();
		}
	}
}
