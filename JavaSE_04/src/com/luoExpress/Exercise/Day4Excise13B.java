package com.luoExpress.Exercise;

public class Day4Excise13B {
	public static void main(String[] args) {
		/*
		 * B:��˾�����۶���� ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ) ��һ���ȣ�22,66,44 �ڶ����ȣ�77,33,88
		 * �������ȣ�25,45,65 ���ļ��ȣ�11,66,99
		 */
		int[][] arr = { { 22, 66, 44 }, { 77, 33, 88 }, { 25, 45, 65 },
				{ 11, 66, 99 } }; // Ϊ�����Ԫ�ظ�ֵ
		int sum = 0; // ���������¼�����۶�
		for (int i = 0; i < arr.length; i++) { // ��������Ԫ��
			for (int j = 0; j < arr[i].length; j++)
				sum = sum + arr[i][j];
		}
		System.out.println("�����۶�Ϊ: " + sum + " ��Ԫ");
	}

}
