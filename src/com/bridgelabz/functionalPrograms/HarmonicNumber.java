package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Range:");
		int n = s.nextInt();
		FunctionalUtility utility = new FunctionalUtility();
		double m=utility.harmonicNumber(n);
		System.out.println("calculated Harmonic value is"+m);
	}
}
