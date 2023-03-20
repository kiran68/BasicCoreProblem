package com.bridgelabz.basiccoreProblem;

import java.util.Scanner;

public class BasicCoreProgram {
public static void main(String[] args) {
	System.out.println("Welcome To Java Were We Learn Something Diffrent");
	
	   int num1 = 6, num2 = 8, num3 = 5;

       if( num1 >= num2 && num1 >= num3)
           System.out.println(num1 + " is the largest number.");

       else if (num2 >= num1 && num2 >= num3)
           System.out.println(num2 + " is the largest number.");

       else
           System.out.println(num3 + " is the largest number.");
}
}
