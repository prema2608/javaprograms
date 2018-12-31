package com.bridgelabz.util;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.functionalprograms.*;

public class FunctionalUtility {

//replacestring
	// method to replace string with String as input
	public void replaceString(String str1) {

		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();

		if (s1.length() >= 3) {
			String s2 = str1.replace("<<username>>", s1);
			System.out.println(s2);
		} else {
			System.out.println("Invalid name");
		}

	}
	// flipcoin

	// method to find the perc of heads and tails
	public void flipCoin(int n)
	{

		double head = 0, tail = 0;
		double c = n;
		Random r = new Random();
		while (n != 0) {
			double rn = r.nextDouble();
			if (rn > .50) {
				++head;
			} else {
				++tail;
			}
			n--;
		}
		double h = head * 100 / c;
		double t= tail * 100 / c;
		System.out.println("perc of Head=" +h);
		System.out.println("perc of Tail=" + t);

	}

//leapyear

	// method to find the leap year
	public boolean leapYear(int n) {
		boolean flag = false;

		if (n % 400 == 0) {
			flag = true;
		} else if (n % 100 == 0) {
			flag = false;
		} else if (n % 4 == 0) {
			flag = true;
		} else if (n % 400 == 0) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;
	}

	// power of 2
	// method to find power of two
	public void powerOf2(double n) 
	{
		double t=0.0;
		int count = 0;
		System.out.println("The series is: ");
		System.out.println();
		if (n >= 0 && n < 31) 
		{
			for (int i = 0; i <= n; i++)
			{
				t = Math.pow(2, count);
				
				System.out.println(t);
				count++;			
				}
			System.out.println("The sum is "+t);
		}

	}

	// prime factors

	// method to find the prime factors of n
	public void primeFactors(int n)

	{

		for (int i = 2; i < n; i++)
		{
			while (n % i == 0)
			{
				System.out.println(i + "");
				n = n / i;

			}
		}
		
		if (n > 2) 
		{
			System.out.println(n);
		}
	}

//Harmonic number
	// method for finding harmonic value
	public double harmonicNumber(int n) {
		double sum = 0.0;
		if (n == 1)
			return 1;
		else {
			for (double i = 1; i <= n; i++) {
				sum = sum + (1 / i);

			}
			return sum;
		}

	}

	// (
//gambler ( not sure)

	public void gamblerWinLoss(int s, int g, int t) {
		int win = 0, loss = 0, j = t;
		Random r = new Random();

		while (j == 0 && t == 0) {
			int n = r.nextInt(2);
			if (n == 0) {
				s--;
				loss++;
			} else {
				win++;
				s++;
			}
		}
		System.out.println("No. of win=" + win);
		System.out.println("No. of loss=" + loss);
		System.out.println("win %=" + win * 100 / j);
		System.out.println("loss %=" + loss * 100 / j);
		System.out.println("remaining stack=" + s);
		System.out.println("remaining choices= " + t);
		System.out.println("remaining goals=" + g);

	}

//coupon numbers
//method to find the coupon number
	public int couponNumber(int n) {
		boolean[] collect = new boolean[n];
		int count = 0;
		int dist = 0;
		while (dist < n) {
			Random r = new Random();
			int value = r.nextInt(n);
			count++;
			if (collect[value] == false) {
				dist++;
				System.out.println(dist);
			} else {
				collect[value] = true;
			}
		}

		return count;
	}

	// 2D Array
//method to print the 2D array for int .
	
	public static Integer[][] arrayInt(int m, int n) 
	{
		Integer a[][] = new Integer[m][n];

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Integer Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}

//method to print the 2D array for double .
	public static Double[][] arrayDouble(int m, int n) {
		Double b[][] = new Double[m][n];
	
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Double Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = sc.nextDouble();
			}
		}
		return b;
	}

//method to print the 2D array for boolean .
	public static String[][] arrayBoolean(int m, int n) {
		String c[][] = new String[m][n];

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Boolean Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = sc.next();
			}
		}
		return c;
	}

//	public static void display(int[][] a, double[][] b, String[][] c, int m, int n) {
//		PrintWriter pw = new PrintWriter(System.out, true);
//
//// integers
//		System.out.println();
//		pw.println("2D ARRAY INTEGER");
//
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				pw.print("\t" + a[i][j] + " ");
//			}
//			pw.println("\t");
//		}
//
////double
//		System.out.println();
//		pw.println("2D ARRAY DOUBLE");
//
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				pw.print("\t" + b[i][j] + " ");
//			}
//			pw.println("\t");
//		}
//
//// boolean
//		System.out.println();
//		pw.println("2D ARRAY BOOLEAN");
//
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				pw.print("\t" + c[i][j] + " ");
//			}
//			pw.println("\t");
//		}
//	}

	public static <E> void diply(E[][] genericArray, int row, int column) {
		PrintWriter pw = new PrintWriter(System.out, true);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				pw.print("\t" + genericArray[i][j] + " ");
			}
			pw.println("\t");
		}
	}

//sumof3AddsTo-0 
//method to find the triplets
	public int findDiffTriplet(int b[], int length) {
		System.out.println();
		// initializing the variables
		int i, j, k, count = 0;

		for (i = 0; i < length-2; i++) {
			for (j = i + 1; j < length-1; j++) {
				for (k = j + 1; k < length; k++) {

					if (b[i] + b[j] + b[k] == 0) {
						System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
					}
				}
			}
		}
		// returning statement
		return count;
	}

//StopWatch

	// method to find the start time
	public static long startTime() {
		long startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
		return startTimer;
	}

//method to find the stop time
	public static long stopTime() {
		long stopTimer = System.currentTimeMillis();

		return stopTimer;
	}

//method to find the elapsed time
	public static long elapsedTime(long stopTimer, long startTimer) {
		long elapsed = stopTimer - startTimer;
		return elapsed;
	}

//Distance of tw0 points

//method to find the distance btw the 2 points
	public void distanceOfPoints() {
		// initializing the variables
		int x1, x2, y1, y2;

		double dis;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1 point");

		x1 = sc.nextInt();

		System.out.println("enter y1 point");

		y1 = sc.nextInt();

		System.out.println("enter x2 point");

		x2 = sc.nextInt();

		System.out.println("enter y2 point");

		y2 = sc.nextInt();
		// formula to calculate the distance
		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("distance btw the" + "[" + x1 + "," + y1 + "]&" + "[" + x2 + "," + y2 + "]=" + dis);
	}

//Quadratic Equation

//method to find the quadratic equation
	public void quadraticEqu() {
		// initializing the variables
		int a, b, c;

		double rt1, rt2, Q;

		Scanner s = new Scanner(System.in);

		System.out.println("Given quadratic equation:ax^2 + bx + c");

		System.out.print("Enter value of a:");

		a = s.nextInt();

		System.out.print("Enter value of b:");

		b = s.nextInt();

		System.out.print("Enter value of c:");

		c = s.nextInt();

		System.out.println("The quadratic equation:" + a + "x^2 + " + b + "x + " + c);

		Q = b * b - 4 * a * c;

		if (Q > 0) {
			System.out.println("Roots are real & unequal");

			rt1 = (-b + Math.sqrt(Q)) / (2 * a);

			rt2 = (-b - Math.sqrt(Q)) / (2 * a);

			System.out.println("First root is:" + rt1);

			System.out.println("Second root is:" + rt2);

		}

		else if (Q == 0) {
			System.out.println("Roots are real & equal");

			rt1 = (-b + Math.sqrt(Q)) / (2 * a);

			System.out.println("Root:" + rt1);

		} else if (Q < 0) {
			System.out.println("Roots are imaginary");
		}
	}

// WindChill
//method the find the cold temp 
	public void windChill() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the temp in Fahrenheit");
		double temp = sc.nextDouble();
		System.out.print("Enter the wind speed(v)>=2: ");

		double v = sc.nextDouble();

		// formula
		double wc = 35.74 + 0.6215 * temp - 35.75 * Math.pow(v, 0.16) + 0.4275 * temp * Math.pow(v, 0.16);

		System.out.println("The wind chill index is  " + wc);
	}

//permutation of string using recursive func
/// copied

	public static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	// Recursive function to generate all permutations of a String
	public void permutations(char[] ch, int currentIndex) {
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++) {
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

//permutation using iterative method

}
