package com.luoExpress.demo01;

public class Day3Exercise10 {
	public static void main(String[] args) {
		/*�ҹ����ɽ������������壬8848�ס�
		��������һ���㹻���ֽ�����ĺ����0.01�ס�
		���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�*/
		double high = 0.01;
		int times = 0;
		while (high < 9948) {
			times++;
			high *= 2;//�۵�һ�Σ���ȼӱ�
		}
		System.out.println("total times is " + times);
	}
}
