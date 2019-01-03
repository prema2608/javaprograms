package com.bridgelabz.util;

import java.util.Scanner;

public class DataStructureUtility 
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
	
	
		public class Deque<E> 
		{
			public E data;
			public Deque<E>next;
			public Deque<E>pre;
			
			public Deque()
			{
				this.next=null;
				this.pre=null;
			}
			
			public Deque(E val)
			{
				this.data=val;
				this.next=null;
				this.pre=null;
	       }
}}