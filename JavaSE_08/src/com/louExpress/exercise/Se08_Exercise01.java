package com.louExpress.exercise;

public class Se08_Exercise01 {
	public static void main(String[] args) {
		int printcount=0;
		for (int i = 1000; i < 10000; i += 1) {
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			int qian = i/1000%10;
			if((ge+bai)==(shi+qian)){
				System.out.print(i+" ");
				printcount++;
				if(printcount>=5){
					System.out.println("");
					printcount =0;
				}
			}
		}
	}
}
