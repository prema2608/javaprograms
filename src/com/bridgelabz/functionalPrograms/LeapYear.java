package com.bridgelabz.functionalPrograms;
import com.bridgelabz.util.FunctionalUtility;
import java.util.Scanner;

/*
*Created by: prema.s
*Date: 19/12/2018.
*Purpose: to check wether the given year is leap year or not*/
public class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year:");
		int n = s.nextInt();
		FunctionalUtility utility = new FunctionalUtility();
		//calling the method
		utility.Leapyear(n);
	}

}
