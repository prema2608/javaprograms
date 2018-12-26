package com.bridgelabz.functionalprograms;
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
		boolean flag;
		
		int n = s.nextInt();
		FunctionalUtility utility = new FunctionalUtility();
		//calling the method
		flag = utility.leapYear(n);
		
		if(flag)
		{
			System.out.println("year "+n+" is a leap year");	
		}
		
		else
		{
			System.out.println("year "+n+" is not a leap year");	
		}
	}

}
