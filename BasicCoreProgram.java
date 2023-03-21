package com.bridgelabz.basiccoreProblem;
import java.util.Scanner;
public class BasicCoreProgram {
	public static void main(String[] args) {
		System.out.println("Welcome To java Were We Learn Something Diffrent");
		
		double n,i;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextDouble();
		for( i=1;i<=n;i++)
		{
			sum=sum+(1/i);
		}
		System.out.println("Harmonic value = "+sum);
	}
}