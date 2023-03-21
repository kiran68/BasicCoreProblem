package com.bridgelabz.basiccoreProblem;


public class BasicCoreProgram {
	public static void main(String[] args) {
      System.out.println("Welcome To java Were We Learn Something Diffrent");
		int num, mul = 1;

		num = Integer.parseInt(args[0]);

		if (num > 31) {
			System.out.println("Value of be less than 31");

		}

		else {
			System.out.println(mul);
			for (int j = 1; j <= num; j++) {
				mul = mul * 2;
				System.out.println(mul);
			}
		}
	}
}