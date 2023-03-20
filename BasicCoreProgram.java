package com.bridgelabz.basiccoreProblem;

import java.util.Scanner;

public class BasicCoreProgram {
public static void main(String[] args) {
	System.out.println("Welcome To Java Were We Learn Something Diffrent");
	
	 System.out.println("Enter a character :");
     Scanner check = new Scanner(System.in);
     char ch = check.next().charAt(0);
     if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
        System.out.println(" character is an vowel");
     }else{
        System.out.println("character is a consonant");
}
}
}
