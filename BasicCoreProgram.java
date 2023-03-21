package com.bridgelabz.basiccoreProblem;
import java.util.Scanner;
import java.util.Scanner;

public class BasicCoreProgram {
public static void main(String[] args) {
	System.out.println("Welcome To Java Were We Learn Something Diffrent");

	int head = 0;
	int tails = 0;
	double random = 0.0;
	int count = 1;
	
System.out.println("Please enter the number : ");
Scanner num = new Scanner(System.in);
int flips = num.nextInt();

while (count <= flips) {
	
	random =Math.random();
	System.out.println(count+" "+random);
	
	if (random < 0.5) {
		head++;
		System.out.println("Heads");
	}
		else {
			tails++;
			System.out.println("Tails");
	}
	count++;
	}
}


}

