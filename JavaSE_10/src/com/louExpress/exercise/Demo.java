package com.louExpress.exercise;

/*
 * 	A:���������ĺ͡�
 B:�ж��������Ƿ���ȡ�
 C:����žų˷�����
 */
public class Demo {
	
	public int add(int a, int b) {
		return a + b;
	}

	public boolean equal(int a, int b) {
		return a == b;
	}
	public void showMulti() {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}