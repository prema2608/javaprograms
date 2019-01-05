package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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

	
	
	
	
	

	//calendar
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


	//primenumber 2D

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



	//primeanagram2D


	public static Set<String> primeAnagram(List<String> primeList)
	{   
		Set<String> primeAnagramSet=new HashSet<String>();
		for(int i=0;i<primeList.size();i++)
		{

			for(int j=i+1;j<primeList.size();j++)
			{
				if(AlgorithmUtility.anagramOfString(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j))))
				{

					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
				}
			}
		}
		return primeAnagramSet;

	}

	
	public static int checkPrime(int n){  
		  int i,m=0,flag=0;      
		  m=n/2;      
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     flag=1;      
		     break;      
		    }      
		   }      
		  return flag;  
		}  
	

	public static List<String> rangePrime1(int start,int end)
	{
		int flag=1;
		List<String> primeList=new ArrayList<>();//list declaration
		for(int i=start;i<=end;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{
				primeList.add(Integer.toString(i));//integer to String conversion


			}
		}
		//System.out.println(primeList);
		return primeList;
	}


	public static void printPrimeAndAnagram(List<List<String>> list1)
	{
		List<String> demo = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i++) 
		{
			demo = list1.get(i);
			if (i == 0) {
				System.out.println("Numbers which are prime and anagram are:");
				System.out.println();
				for (int j = 0; j < demo.size(); j++) {
					System.out.print(demo.get(j) + " ");
				}
			} else {
				System.out.println();
				System.out.println("Numbers which are prime but not anagram are:");
				System.out.println();
				for (int j = 0; j < demo.size(); j++) {
					System.out.print(demo.get(j) + " ");
				}
			}
			System.out.println();
		}
	}

	public static int primeNumbers1(int x) {
		int i = 0;
		int num = 0;
		for (num = i; num >= 1; num--) {
			if (i % num == 0) 
				break;
		}
			return num;

		

	}
	
	
	
	public static boolean anagramOfString(String s1, String s2) {

		boolean status = false;

		//if (s1.length() != s2.length()) {

			//System.out.println("Enter both the strings of same size");
//		} else {
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
		
		return status;

	}
	public static Set<Integer> primeAnagram1(List<Integer> primeList)
	{   
		Set<Integer> primeAnagramSet=new HashSet<Integer>();
		for(int i=0;i<primeList.size();i++)
		{

			for(int j=i+1;j<primeList.size();j++)
			{
				if(AlgorithmUtility.anagramOfString(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j))))
				{

					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
				}
			}
		}
		return primeAnagramSet;

	
	}
	
	
	
	
	
	
	
	
	
	
}





