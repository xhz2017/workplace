package com.luoExpress.demo01;
import java.util.*;
public class Day3Exercise13 {
	public static void main(String[] args) {
		// ����¼�������������������������е����ֵ��ӡ�ڿ���̨��
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("��������������");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int num3 = scanner.nextInt();
			int max1 = num1 > num2 ? num1 : num2;// first compare 1,2,get max
			max1 = num1 > num3 ? num1 : num3;    // then compare 1,3 get max
			System.out.println("max values is " + max1);
		} finally {
			scanner.close();
		}
	}
}
