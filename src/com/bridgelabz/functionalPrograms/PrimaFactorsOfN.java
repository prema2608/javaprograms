package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;
/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose: To Compute the prime factorization of N using brute force.
 */
public class PrimaFactorsOfN
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n = s.nextInt();
			FunctionalUtility utility = new FunctionalUtility();
			//calling the method
		     utility.PrimeFactors(n);
		
	}
	

}
