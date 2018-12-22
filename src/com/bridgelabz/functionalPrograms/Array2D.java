package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

/*
*Created by: prema.s
*Date: 21/12/2018.
*Purpose: Print function to print 2 Dimensional Array. 
*In Java use PrintWriter with OutputStreamWriter to print the output to the screen.**/

public class Array2D 
{
	public static void main(String[] args)
	{
		FunctionalUtility u=new FunctionalUtility(); 
		 Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt(); 
		        
		//calling methods
		int [][] a = u.arrayInt(m,n);
		double [][] b = u.arrayDouble(m,n);
		String [][] c = u.arrayBoolean(m,n);
		        
		//calling method
		u.display(a,b,c,m,n);

		
	}

}
