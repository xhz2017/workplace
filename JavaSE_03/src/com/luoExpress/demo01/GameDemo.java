package com.luoExpress.demo01;
import java.util.*;
public class GameDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		  try {
				int number;
				int irandom;
				irandom = random.nextInt(100)+1;
				System.out.println(irandom);
				while(true){
					System.out.println("请猜数字");
					number = scanner.nextInt();
					if(number == irandom){
						break;
					}
					else if(number > irandom){
						System.out.println("sorry，您猜大了！");
					}
					else{
						System.out.println("sorry，您猜小了！");
					}
				}
				System.out.println("恭喜你答对了，本次游戏结束！！！");
		    } finally {
		    	scanner.close();
		    }

	}
}
