package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose: to find Percentage of Head vs Tails
*/
public class FlipCoins
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of tossing:");
		int n = s.nextInt();
			FunctionalUtility utility = new FunctionalUtility();
			//calling the method
		     utility.flipcoin(n);
		
	}

}
	

