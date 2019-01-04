package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class DataStructureUtility 
{

	// creating our own scanner class
		static Scanner sc = new Scanner(System.in);

		// scanner class for integer
		public static int intValue() {
			try {

				return sc.nextInt();

			} catch (Exception e) {
				e.printStackTrace();

			}
			return 0;
		}

		// scanner class for double
		public static double doubValue() {
			try {

				return sc.nextDouble();

			} catch (Exception e) {
				e.printStackTrace();

			}
			return 0.0;
		}

		// scanner class for boolean
		public static boolean boolValue() {
			try {

				return sc.nextBoolean();
			} catch (Exception e) {
				e.printStackTrace();

			}
			return false;
		}

		// scanner class for float
		public static float floatValue() {
			try {

				return sc.nextFloat();

			} catch (Exception e) {
				e.printStackTrace();

			}
			return 0;

		}

		// scanner class for string
		public static String stringValue() {
			try {

				return sc.next();

			} catch (Exception e) {
				e.printStackTrace();

			}
			return null;
		}
	
		

		public static List<Integer> primeNumbers(int x,int y) {
			List<Integer> primeList = new ArrayList<>();
			int i = 0;
			int num = 0;

			String primeNumbers = "";

			for (i = x; i < y; i++) {
				int counter = 0;
				for (num = i; num >= 1; num--) {
					if (i % num == 0) {
						counter++;
					}
				}
				if (counter == 2) {
					primeList.add(i);
					//primeNumbers = primeNumbers + i + " ";
				}
			}
			return primeList;

		//	System.out.println("Prime numbers from 0 to 1000 are :");
			//System.out.println(primeNumbers);
			//return primeList;

		}

		 public static int day(int month, int day, int year) {
		        int y = year - (14 - month) / 12;
		        int x = y + y/4 - y/100 + y/400;
		        int m = month + 12 * ((14 - month) / 12) - 2;
		        int d = (day + x + (31*m)/12) % 7;
		        return d;
		    }

		    // return true if the given year is a leap year
		    public static boolean isLeapYear(int year) {
		        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
		        if  (year % 400 == 0) return true;
		        return false;
		    }

		
	}