package com.bridgelabz.basiccoreProblem;

public class BasicCoreProgram {
public static void main(String[] args) {
	System.out.println("Welcome To Java Were We Learn Something Diffrent");
	
	
	 int num = 5678;
	 int num1 = 1234;
	 
	 System.out.println("swap number");
	 System.out.println("First Number" + num);
	 System.out.println("Second Number" + num1);
	 
	 int num2 = num;
	 num = num1;
	 num1 = num;
	 
	 System.out.println("Swap Number1");
	 System.out.println("First Number :" + num);
	 System.out.println("Second Number" + num2);
}
}

