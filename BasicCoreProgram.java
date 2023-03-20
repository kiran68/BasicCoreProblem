package com.bridgelabz.basiccoreProblem;

import java.util.Scanner;

public class BasicCoreProgram {
public static void main(String[] args) {
	System.out.println("Welcome To Java Were We Learn Something Diffrent");
	
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int num = reader.nextInt();
			
			if (num % 2 == 0)
				
			System.out.println(num + "is even: ");
			else
			System.out.println(num + "is odd: ");
		
}
}

