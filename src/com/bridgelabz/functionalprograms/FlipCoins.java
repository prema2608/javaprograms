/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose: to find Percentage of Head vs Tails
*/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;


public class FlipCoins
{
	//main method
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of tossing:");
		int n = s.nextInt();
		boolean flag;
			FunctionalUtility utility = new FunctionalUtility();
			//calling the method
		     utility.flipCoin(n);
		
	}

}
	

