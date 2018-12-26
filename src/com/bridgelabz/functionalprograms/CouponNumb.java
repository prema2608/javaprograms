package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

/*
*Created by: prema.s
*Date: 21/12/2018.
*Purpose: total random number needed to have all distinct numbers.*/

public class CouponNumb
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of coupens");
		int n=sc.nextInt();
		FunctionalUtility utility = new FunctionalUtility();		
		//printing the result
		System.out.println("total distinct number required are="+ utility.couponNumber(n));
	  
	  
  }
	
}
