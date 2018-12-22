package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose: To Print the Nth Harmonic Value.
*/
public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Range:");
		int n = s.nextInt();
		FunctionalUtility utility = new FunctionalUtility();
		//calling the method
		double m=utility.harmonicNumber(n);
		System.out.println("calculated Harmonic value is"+m);
	}
}
