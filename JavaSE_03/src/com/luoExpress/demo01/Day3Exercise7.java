package com.luoExpress.demo01;

public class Day3Exercise7 {
	//����1-100֮��������ж��ٸ����������Լ�����������ӡ�ڿ���̨��
	//����:ֻ�ܱ�1�ͱ�����������.
	public static void main(String[] args) {
		int num = 0;
		Day3Exercise7 day4 = new Day3Exercise7();
		for (int i = 1; i < 100; i++) {
			if (day4.isPrime(i)) {
				num++;
				System.out.println(i);
			}
		}
		System.out.println("total prime is " + num);
	}

	boolean isPrime(int num) {
		boolean isprime = true;
		int len = num / 2 + 1;// û��Ҫ�Ƚϵ������
		for (int i = 2; i < len; i++) {
			if (num % i == 0) {
				isprime = false;
				break;
			}
		}
		return isprime;
	}
}
