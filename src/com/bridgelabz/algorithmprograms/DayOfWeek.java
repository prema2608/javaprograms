/*********************************************************************************************
*Created by: prema.s                                                                         *
*Date: 22/12/2018.                                                                           *
*Purpose: To print the day of the week that date falls on by taking a date as input.         *
**********************************************************************************************/
package com.bridgelabz.algorithmprograms;



import com.bridgelabz.util.AlgorithmUtility;

public class DayOfWeek 
{
	//main method
	public static void main(String[] args) 
	{
		int result;
		AlgorithmUtility u = new AlgorithmUtility();
		
		System.out.println("Enter the month");
		int m=AlgorithmUtility.intValue();
		
		System.out.println("Enter the day");
		int d =AlgorithmUtility.intValue();
		
		System.out.println("Enter the year");
		int y =AlgorithmUtility.intValue();
		result=u.dayOfWeek(m, d, y);////calling the method
		
	}
	

}
