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

		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt(); 
		System.out.println("Enter values for rows and col: ");       
		//calling methods
		Integer [][] a = FunctionalUtility.arrayInt(m,n);
		Double [][] b = FunctionalUtility.arrayDouble(m,n);
		String [][] c = FunctionalUtility.arrayBoolean(m,n);
		        
		//calling method
		FunctionalUtility.diply(a, m, n);
		FunctionalUtility.diply(b, m, n);
		FunctionalUtility.diply(c, m, n);

		

		
	}

}
