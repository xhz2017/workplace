package com.luoExpress.Exercise;
public class Day4Excise9 {
	public static void main(String[] args) {
		// 9.�����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)������ʵ�֣�
		int[] arr = { 4, 1, 6, 3, 9, 8 }; // ����һ������
		int max = arr[0]; // �������max���ڼ�ס����������ȼ����һ��Ԫ��Ϊ���ֵ
		// ����ͨ��һ��forѭ�����������е�Ԫ��
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) { // �Ƚ� arr[x]��ֵ�Ƿ����max
				max = arr[x]; // ������������arr[x]��ֵ����max
			}
		}
		System.out.println("max=" + max); // ��ӡ���ֵ
	}
}
