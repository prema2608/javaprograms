package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class FlipCoins
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of tossing:");
		int n = s.nextInt();
			FunctionalUtility utility = new FunctionalUtility();
		     utility.flipcoin(n);
		
	}

}
	

