/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose: To compute the square root of a nonnegative number c given in the input using Newton's method:
*/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class SquareRoot 
{ //main method
	public static void main(String[] args) 
	{
		
	System.out.println("Enter the number");
    double c=AlgorithmUtility.doubValue();
    c=Math.abs(c);
    double t=c;
    double epsilon = 1e-15;
    //printing the output
    System.out.println("Exact Sqrt of "+c+" is = "+AlgorithmUtility.getSqrt(epsilon,c));
    
	}



}
