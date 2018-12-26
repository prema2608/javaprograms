package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class SquareRoot 
{ 
	public static void main(String[] args) 
	{
		
	System.out.println("Enter the number");
    double c=AlgorithmUtility.doubValue();
    c=Math.abs(c);
    double t=c;
    double epsilon = 1e-15;
    System.out.println("Exact Sqrt of "+c+" is = "+AlgorithmUtility.getSqrt(epsilon,c));
    
	}



}
