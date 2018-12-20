package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SumOf3AddsToZero 
{
  public static void main(String[] args) 
  {
	  System.out.println("Enter the Array size");
		Scanner sc=new Scanner(System.in);
		FunctionalUtility utility=new FunctionalUtility();
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
     int n=a.length;
		utility.SumOf3AddsToZero(a,n);
		//if(count==0)
		//	System.out.println("entered array has triplet numbers");
		//else
		//	System.out.println("entered array not has any triplet numbers");
	}

	  
}
	

