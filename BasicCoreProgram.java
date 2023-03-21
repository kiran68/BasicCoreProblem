package com.bridgelabz.basiccoreProblem;
import java.util.Scanner;

public class BasicCoreProgram {
public static void main(String[] args) {
	int year;
	System.out.println("Welcome To Java Were We Learn Something Diffrent");
int Year;
	System.out.println(" Enter year:");
	Scanner sc = new Scanner(System.in);
	year = sc.nextInt();
	//if (year > 999 && year < 9999);
	if ((year % 4 == 0 && year / 100 != 0) || year % 100 == 0 && year % 400 == 0) {
		System.out.println("Leap Year");
	}
	else {
		System.out.println("not leap Year");
	}
	
}


}

