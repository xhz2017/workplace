package com.luoExpress.demo;

public class Demo {

	public static void main(String[] args) {
		int num[]={5,10,18};
		double size[] = {13.3,14.0,15.6};
		double price[] = {6988.88,5999.99,4999.50};
		String[] strArray={"MacBookAir    ","Thinkpad450   ","asus-fl5800   "};
		//���java����
		System.out.println("-----------�̳ǿ���嵥----------------");
		System.out.println("Ʒ��                            �ߴ�         �۸�                  �����");
		for(int i=0;i<strArray.length;i++){
		    System.out.println(strArray[i]+size[i]+"    "+price[i]+"    "+num[i]);//������ 1 2 3
		}
		System.out.println("---------------------------------------");
		System.out.print("�ܿ������");
		System.out.println(num[0]+num[1]+num[2]);
		System.out.print("�����Ʒ�ܽ�");
		System.out.println(price[0]+price[1]+price[2]);
	}

}
