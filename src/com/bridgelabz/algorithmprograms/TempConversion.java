/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose:given the temperature in fahrenheit as input
* outputs the temperature in Celsius or viceversa using the formula*/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;
public class TempConversion 
{
//	main method
	public static void main(String[] args)
	{
		System.out.println("Enter the temperature");
		float n =AlgorithmUtility.floatValue();
		
		System.out.println("press 1 for temperature in fahrenheit & press 2 for temp in celisus");
		System.out.println("Enter your option");
	int	option=AlgorithmUtility.intValue();
		
		float result;
		AlgorithmUtility u = new AlgorithmUtility();
		 System.out.print("Enter the temperature in Fahrenheit: "); 
	    float fahrn=AlgorithmUtility.floatValue();
	    
	    System.out.print("Enter the temperature in Celsius: "); 
	    float cel=AlgorithmUtility.floatValue();
		System.out.println("press 1 for celsius  and press 2 for Fahrenheit");
		int choice=AlgorithmUtility.intValue();
		//method call
	   result=u.tempConversn(fahrn,cel,choice);
	   System.out.println(result);
	}
	
}
