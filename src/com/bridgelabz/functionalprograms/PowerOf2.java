/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose: To print a table of the powers of 2 that are less than or equal to 2^N.
*/

package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PowerOf2
{
   //main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the power value");
		double n=sc.nextInt();
		 FunctionalUtility u = new FunctionalUtility();
		 u.powerOf2(n);
	}


}
