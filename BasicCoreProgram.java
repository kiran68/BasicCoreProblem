package com.bridgelabz.basiccoreProblem;
import java.util.Scanner;

public class BasicCoreProgram {
	public static void main(String[]args) {
		System.out.println("Welcome To java Were We Learn Something Diffrent");

	Scanner input = new Scanner (System.in);
  System.out.println("Enter a number to find its prime Factors ");
  int number = input.nextInt();
  
  System.out.println("Prime Dactors of " + number + " are ");
  
  
 for (int i = 2; i*i<number;i++) {
	 while(number % i == 0) {
		 System.out.println(i + "");
		 number /=10;
		 
 }
	}
 if (number > 1)
 {
	 System.out.println(number);
 }
}
}