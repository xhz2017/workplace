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
					System.out.println("�������");
					number = scanner.nextInt();
					if(number == irandom){
						break;
					}
					else if(number > irandom){
						System.out.println("sorry�����´��ˣ�");
					}
					else{
						System.out.println("sorry������С�ˣ�");
					}
				}
				System.out.println("��ϲ�����ˣ�������Ϸ����������");
		    } finally {
		    	scanner.close();
		    }

	}
}
