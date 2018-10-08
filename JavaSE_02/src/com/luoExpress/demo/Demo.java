package com.luoExpress.demo;

public class Demo {

	public static void main(String[] args) {
		int num[]={5,10,18};
		double size[] = {13.3,14.0,15.6};
		double price[] = {6988.88,5999.99,4999.50};
		String[] strArray={"MacBookAir    ","Thinkpad450   ","asus-fl5800   "};
		//输出java数组
		System.out.println("-----------商城库存清单----------------");
		System.out.println("品牌                            尺寸         价格                  库存数");
		for(int i=0;i<strArray.length;i++){
		    System.out.println(strArray[i]+size[i]+"    "+price[i]+"    "+num[i]);//输出结果 1 2 3
		}
		System.out.println("---------------------------------------");
		System.out.print("总库存数：");
		System.out.println(num[0]+num[1]+num[2]);
		System.out.print("库存商品总金额：");
		System.out.println(price[0]+price[1]+price[2]);
	}

}
