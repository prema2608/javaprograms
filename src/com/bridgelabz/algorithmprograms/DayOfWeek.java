package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;
/*********************************************************************************************
*Created by: prema.s                                                                         *
*Date: 22/12/2018.                                                                           *
*Purpose: To print the day of the week that date falls on by taking a date as input.         *
**********************************************************************************************/
public class DayOfWeek 
{
	public static void main(String[] args) 
	{
		boolean flag;
		AlgorithmUtility u = new AlgorithmUtility();
		//calling the method
		
		
		System.out.println("Enter the month");
		int m=AlgorithmUtility.intValue();
		
		System.out.println("Enter the day");
		int d =AlgorithmUtility.intValue();
		
		System.out.println("Enter the year");
		int y =AlgorithmUtility.intValue();
		flag=u.dayOfWeek(m, d, y);
		
	}
	

}
