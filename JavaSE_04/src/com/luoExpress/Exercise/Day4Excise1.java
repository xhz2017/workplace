package com.luoExpress.Exercise;
import java.util.Scanner;
public class Day4Excise1 {
	public static void main(String[]args){
/*		1.��д����ʵ���������ݣ�if���ʵ�ֿ��Գɼ��ֵȼ�(ʹ��switch���)��
		[90-100]	A�ȡ�
		[80-90) 	B�ȡ�
		[70-80) 	C�ȡ�
		[60-70) 	D�ȡ�
		[0-60)  	E�ȡ�
		����ݸ����ɼ��������Ӧ�ĵȼ���
		˵����"["��ʾ������")"��ʾ������*/
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("������һ���ɼ�");
			int number = scanner.nextInt();
			System.out.println("�����������Ϊ:" + number);
			switch (number / 10) {
			case 10:
			case 9:
				System.out.println("A��");
				break;
			case 8:
				System.out.println("B��");
				break;
			case 7:
				System.out.println("C��");
				break;
			case 6:
				System.out.println("D��");
				break;
			default:
				System.out.println("E��");
				break;
			}
		} finally {
			scanner.close();
		}
	}
}
