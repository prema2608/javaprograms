package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

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
		        
		//calling display method
		u.display(a,b,c,m,n);

		
	}

}
