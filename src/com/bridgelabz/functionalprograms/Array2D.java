/*
*Created by: prema.s
*Date: 21/12/2018.
*Purpose: Print function to print 2 Dimensional Array. 
*In Java use PrintWriter with OutputStreamWriter to print the output to the screen.**/


package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;


public class Array2D 
{
	//main method
	public static void main(String[] args)
	{
		FunctionalUtility u=new FunctionalUtility(); 
		 Scanner sc = new Scanner(System.in);

		
		//calling methods
		System.out.println("Enter 1 for Integer array");
		System.out.println("enter 2 for double array");
		System.out.println("enter 3 for boolean array");
		System.out.println("Enter your choice");
		
		int choice = sc.nextInt();
		
		switch(choice)
			{
		
		case 1:
		{
			System.out.println("Enter number of rows: ");
			int m = sc.nextInt();
			System.out.println("Enter number of columns: ");
			int n = sc.nextInt(); 
			System.out.println("Enter values for rows and col: ");
		   Integer [][] a = FunctionalUtility.arrayInt(m,n);
		   FunctionalUtility.diply(a, m, n);
		}break;
		
		case 2:
		{
		
			System.out.println("Enter number of rows: ");
			int m = sc.nextInt();
			System.out.println("Enter number of columns: ");
			int n = sc.nextInt(); 
			System.out.println("Enter values for rows and col: ");
			Double [][] b = FunctionalUtility.arrayDouble(m,n);
			FunctionalUtility.diply(b, m, n);
		}break;
		
		case 3:
		{
			System.out.println("Enter number of rows: ");
			int m = sc.nextInt();
			System.out.println("Enter number of columns: ");
			int n = sc.nextInt(); 
			System.out.println("Enter values for rows and col: ");
		String [][] c = FunctionalUtility.arrayBoolean(m,n);
		FunctionalUtility.diply(c, m, n);

		}break;
		        
		case 4:
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		
		
			}
	}
		
		
	}


