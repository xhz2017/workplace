package com.leetcode.exercise;

import java.util.Random;
import java.util.Scanner;

public class GuessSolution extends GueseGame {
	public static void main(String[] args) {
		GuessSolution s = new GuessSolution();
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input a number range.");
		int seed = scanner.nextInt();
		s.setFiled(seed);
		while (true) {
			System.out.println("please intput guess£¡£¡£¡");
			int result = s.guessNumber(scanner.nextInt());
			if (result == 0) {
				System.out.println("congrators!!");
				break;
			} else if (result > 1) {
				System.out.println("higher");
			} else {
				System.out.println("lower");
			}
		}

	}

}

class GueseGame {
	int picked = 9;

	public void setFiled(int n) {
		Random randon = new Random();
		picked = randon.nextInt(n);
	}

	public int guessNumber(int num) {
		System.out.println("picked:"+picked+"num"+num);
		if (num == picked) {
			return 0;
		} else if (num > picked) {
			return 1;
		} else {
			return -1;
		}
	}
}