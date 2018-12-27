package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class BinOfInt 
{

	public static void main(String[] args)
	{
		boolean binInt;
		 AlgorithmUtility u=new AlgorithmUtility();
	    System.out.println("Enter number of elements");
	  int  n = AlgorithmUtility.intValue();
	  int[]  array = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	 
	    for (int c = 0; c < n; c++)
	      array[c] = AlgorithmUtility.intValue();
	 
	    System.out.println("Enter value to find");
	  int  search = AlgorithmUtility.intValue();
	binInt= u.binaryOfInt(array, search, n);
	
		
	}
}
