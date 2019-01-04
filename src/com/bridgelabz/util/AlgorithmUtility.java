package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.algorithmprograms.VendingMachine;

public class AlgorithmUtility {
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

	// Anagram of string

	/**
	 * @param s1
	 * @param s2
	 * @return
	 */
	// method to find anagrams of string
	public boolean anagramOfString(String s1, String s2) {

		boolean status = false;

		if (s1.length() != s2.length()) {

			System.out.println("Enter both the strings of same size");
		} else {
			char[] stng1 = s1.toLowerCase().toCharArray();
			char[] stng2 = s2.toLowerCase().toCharArray();
			// sorting the array
			// Arrays.sort(string1);
			for (int i = 0; i < (stng1.length - 1); i++) {
				for (int j = i + 1; j > 0; j--) {
					if (stng1[j] < stng1[j - 1]) {
						char temp = stng1[j - 1];
						stng1[j - 1] = stng1[j];
						stng1[j] = temp;
					}
				}
			}

			// Arrays.sort(string2);
			for (int i = 0; i < (stng2.length - 1); i++) {
				for (int j = i + 1; j > 0; j--) {
					if (stng2[j] < stng2[j - 1]) {
						char temp = stng2[j - 1];
						stng2[j - 1] = stng2[j];
						stng2[j] = temp;
					}
				}
			}
			status = Arrays.equals(stng1, stng2);
		}
		return status;

	}

	// prime Numbers

	public static List<Integer> primeNumbers() {
		List<Integer> primeList = new ArrayList<>();
		int i = 0;
		int num = 0;

		String primeNumbers = "";

		for (i = 0; i <= 1000; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				primeList.add(i);
				// primeNumbers = primeNumbers + i + " ";
			}
		}

		System.out.println("Prime numbers from 0 to 1000 are :");
		System.out.println(primeNumbers);
		return primeList;

	}

	// anagram palindrome

	public static void anagramPalin(List<Integer> primeList) {

	}

	// Bubble sort

	// method to sort array of integers using bubble sort
	public boolean bubbleSort(int a[]) {
		boolean bubb = false;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					// Swapping
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("The sorted order is:");

		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		return bubb;
	}

	// Insertion sort

	// method to sort array of strings using insertion sort
	public  boolean insertionSort(String[] ary)
	{
			boolean insert = false;

		System.out.println("Sorted order is: ");
		for (int i = 0; i < ary.length; i++) 
		{
			Arrays.sort(ary);
			System.out.println(ary[i]);
		}
		// return statmnt
		return insert;
		
		
	}

	// monthly payment

	// method to find the monthly payment
	public double monthlyPayment(double y, double p, double r2) {

		double n = 12 * y;
		double r = r2 / (12 * 100);
		// formula

		double Paymnt = p * r / (1 - Math.pow((1 + r), (-n)));

		System.out.println("The calculated monthly payment is:" + Paymnt);
		return Paymnt;
	}

	// temperature conversion

	// method to find temp conversion
	
	public boolean tempConversn() 
	{ //
		int choice,i=0;
		boolean result = false;
		System.out.println("Enter the temperature");
		float n =AlgorithmUtility.floatValue();
		 do
		   {
		System.out.println("press 1 for temperature in fahrenheit & "
				+ " press 2 for temp in celisus"
				+" press 3 to Exit");
		System.out.println("Enter your option");
		choice=AlgorithmUtility.intValue();
		
		
  
	   switch(choice)
	   {
	   case 1:
		{
			//Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
			n = (n * 9 / 5) + 32;
			System.out.println("temp in fahrenheit:"+n);
		} break;
		
	   case 2:
		{ 
			
			//Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C
	           n= (n - 32) * 5 / 9;
				System.out.println("temp in celsius:"+n);
		}break;
		
	   case 3:
		   System.exit(0);
		   break;
		default:System.out.println("enter the correct choice");
	   }i++;
   }while(i<30);
return result;

   }

	
	
	
	// Day of Week
	// method to find day of week
	public int dayOfWeek(int m, int d, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		int result = d0;
		System.out.println(result);
		String [] str= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		for(int i=0;i<str.length;i++)
		{
			if(i==result)
			{
				System.out.println(str[i]);
			}
		}

		return result;
	}

//merge sort

	// method to sort the array of strings using merge sort
	public void mergeSort(String array[], int low, int high) {
		int n = high - low;
		if (n <= 1)
			return;
		int mid = low + n / 2;
		mergeSort(array, low, mid);// recursive calling
		mergeSort(array, mid, high);// recursive calling
		String[] temparr = new String[n];
		int i = low, j = mid;
		for (int k = 0; k < n; k++) {
			if (i == mid)
				temparr[k] = array[j++];
			else if (j == high)
				temparr[k] = array[i++];
			else if (array[j].compareToIgnoreCase(array[i]) < 0)
				temparr[k] = array[j++];
			else
				temparr[k] = array[i++];
		}

		for (int k = 0; k < n; k++) {
			array[low + k] = temparr[k];
		}
	}

	// Vending machine
	// method to calculate the minimum number of Notes
	public void vendingMachine(int money, int[] notes) {
		// initializing the varaiables
		int rem;
		int i = 0;
		int total = 0;

		if (money == 0) {
			System.out.println("INVALID INPUT");
		} else {
			for (i = 0; i < notes.length; i++) {
				if (money >= notes[i]) {
					// calculating the notes
					int calNotes = money / notes[i];
					rem = money % notes[i];
					money = rem;
					total = total + calNotes;
					System.out.println(notes[i] + " Ruppee Notes:  " + calNotes);

				}

			}
			// printing the output
			System.out.println("Total numbet of notes are:" + total);

		}
	}

	// Square root of n

	// method to find square root of n
	public static double getSqrt(double e, double c) {
		double t = c;
		while (Math.abs(t - c / t) > e * t) {
			t = ((c / t) + t) / 2;
//			System.out.println("Apprx sqrt is= " + t);
		}
		return t;

	}

//decimalTobinary
// method to convert deci to binary
	public void deciToBin(int n) {

		int a;
		int x = 0;
		int[] arr = new int[8];
		while (n > 0)

		{
			a = n % 2;
			arr[x] = a;
			x++;
			n = n / 2;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

///BinarySearch methods
	// method to binary search of array of integers
	public boolean binaryOfInt(int[] array, int search, int n) {
		boolean binInt = false;

		int first = 0;
		int last = n - 1;
		int middle = (first + last) / 2;
		bubbleSort(array);
		while (first <= last) {
			if (array[middle] < search)
				first = middle + 1;
			else if (array[middle] == search) {
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(search + " isn't present in the list.\n");
		// returning statmnt
		return binInt;
	}

//binaryOfString

//method to binary search for array of string
	public void binaryOfString(String[] array, String search) {

		// boolean binInt = false;

		int first = 0;
		int last = array.length;
		int middle = (first + last) / 2;
		insertionSort(array);
		while (first <= last) 
		{
			if (array[middle].compareTo(search) < 0)
				first = middle + 1;
			else if (array[middle].compareTo(search) == 0) {
				System.out.println(search + " found at location " + (middle + 1) + ".");
				break;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(search + " isn't present in the list.\n");

	}

//bubble sort for string

//method for sorting the string array using bubble sort
	public static boolean bubbleSort(String a[]) {
		boolean bubb1 = false;
		String temp = null;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					// Swapping
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The sorted order is:");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		return bubb1;

	}

//find your number

//method to find the number which u taught for
	public void findNumber(String value, int low, int up, int mid, int count, int n) {

		System.out.println("Is this the number you taught?:" + mid);

//   	System.out.println("If the number you taught is greater than " +mid+ " then enter HIGH");
//   	System.out.println();
//   System.out.println("If the number you taught is greater than " +mid+ " then enter LOW");
//   System.out.println();
//   System.out.println("If the number you taught is same as " +mid+ " then enter YES");
//   	
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		value = AlgorithmUtility.stringValue();
		do {

			if (value.equals("high")) {
				low = mid;
				count++;
				mid = (low + up + 1) / 2;
				findNumber(value, low, up, mid, count, n);
			}

			else if (value.equals("low")) {
				up = mid;
				count++;
				mid = (low + up + 1) / 2;
				findNumber(value, low, up, mid, count, n);
			}

			else if (value.equals("yes")) {
				System.out.println("The number you thought was: " + mid);
				int no = count + 1;
				System.out.println("It takes " + no + " times to find the number which you taught");

				break;
			}

		} while (low <= up);
		if (count > n) {
			System.out.println("Number is not found");
		} else {
			System.exit(0);
		}
	}

// binary swapping nibbles

//method for finding the binary value and swapping the nibbles
	public void binNibbles() {
		System.out.println("enter the number");
		int n = AlgorithmUtility.intValue();

		deciToBin(n);
		System.out.println();
//		System.out.println("before Swapping the nibbles:" + Integer.toBinaryString(n));
		n = swapNibbles1(n);
		System.out.println("After Swapping the nibbles:" + Integer.toBinaryString(n));
		int flag = 0;
		for (int i = 0; i < n; i++) {

			if (Math.pow(2, i) == n) {
				flag = 1;
			}

		}
		if (flag == 1)

		{
			System.out.println(n + " is power of 2");
		} else {
			System.out.println(n + " is not power of 2");
		}

	}

	// method for swapping the nibbles
	public static int swapNibbles1(int n) {
		return ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
	}

	
	
	// binary search

		/**
		 * static function that sorts the given array using bubble sort algorithm
		 * 
		 * @param array the array of strings to be sorted
		 * @return sorted array
		 */
		public static String[] sort(String[] str) {
			int len = str.length;
			for (int i = 0; i < len; i++) {
				for (int j = i + 1; j < len; j++) {
					if (str[i].compareTo(str[j]) > 0) {
						String temp;
						temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				}
			}
			return str;
		}

		/**
		 * static function that search for the given key in a array using binary search
		 * algorithm
		 * 
		 * @param array the array of strings from which key is to be found
		 * @param key   the key to be searched in the array
		 * @return index the index of the key, found in the array
		 */
		public static int binarySearch(String[] str, String key) {
			// int n=str.length;
			int first = 0;
			int last = str.length - 1;
			int middle = (first + last) / 2;

			while (first <= last) {
				if (str[middle].compareTo(key) < 0)
					first = middle + 1;
				else if (str[middle].compareTo(key) == 0) {
					return middle;
				} else
					last = middle - 1;

				middle = (first + last) / 2;
			}
			return -1;
		}
}
