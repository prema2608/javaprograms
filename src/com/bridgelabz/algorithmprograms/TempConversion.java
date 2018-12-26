package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;
/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose:given the temperature in fahrenheit as input
* outputs the temperature in Celsius or viceversa using the formula*/

public class TempConversion 
{
	public static void main(String[] args)
	{
		
		float result;
		AlgorithmUtility u = new AlgorithmUtility();
		 System.out.print("Enter the temperature in Fahrenheit: "); 
	    float fahrn=AlgorithmUtility.floatValue();
	    
	    System.out.print("Enter the temperature in Celsius: "); 
	    float cel=AlgorithmUtility.floatValue();
		System.out.println("press 1 for celsius  and press 2 for Fahrenheit");
		int choice=AlgorithmUtility.intValue();
	   result=u.tempConversn(fahrn,cel,choice);
	   System.out.println(result);
	}
	
}
