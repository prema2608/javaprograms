package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class CouponNumb
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of coupens");
		int n=sc.nextInt();
		FunctionalUtility utility = new FunctionalUtility();		
		System.out.println("total distinct number required are="+ utility.couponNumber(n));
	  
	  
  }
	
}
