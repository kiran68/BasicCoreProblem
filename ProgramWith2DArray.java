package com.bridgelabz.functionprogram;

import java.io.PrintWriter;
import java.util.Scanner;

public class ProgramWith2DArray {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int m = u.nextInt();
		System.out.println("Enter number of columns: ");
		int n = u.nextInt();

		// calling methods
		int[][] a = arrayInt(m, n);
		double[][] b = arrayDouble(m, n);
		String[][] c = arrayBoolean(m, n);

		// calling display method
		display(a, b, c, m, n);

	}

	public static int[][] arrayInt(int m, int n) {
		int a[][] = new int[m][n];
		Scanner u = new Scanner(System.in);
		System.out.println();
		System.out.println("Integer Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = u.nextInt();
			}
		}
		return a;
	}

	public static double[][] arrayDouble(int m, int n) {
		double b[][] = new double[m][n];
		Scanner u = new Scanner(System.in);
		System.out.println();
		System.out.println("Double Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = u.nextDouble();
			}
		}
		return b;
	}

	public static String[][] arrayBoolean(int m, int n) {
		String c[][] = new String[m][n];
		Scanner u = new Scanner(System.in);
		System.out.println();
		System.out.println("Boolean Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = u.next();
			}
		}
		return c;
	}

	// display method
	public static void display(int[][] a, double[][] b, String[][] c, int m, int n) {
		PrintWriter pw = new PrintWriter(System.out, true);

		// display integers
		System.out.println();
		pw.println("2D ARRAY INTEGER");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + a[i][j] + " ");
			}
			pw.println("\t");
		}

		// display double
		System.out.println();
		pw.println("2D ARRAY DOUBLE");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + b[i][j] + " ");
			}
			pw.println("\t");
		}

		// display boolean
		System.out.println();
		pw.println("2D ARRAY BOOLEAN");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + c[i][j] + " ");
			}
			pw.println("\t");
		}
	}
}
