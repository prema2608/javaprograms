/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose: To print a table of the powers of 2 that are less than or equal to 2^N.
*/

package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class PowerOf2
{
   //main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the power value");
		double n=sc.nextInt();
		double p= Math.pow(2.0,n);
		System.out.println("calculated value ="+p);

	}


}
