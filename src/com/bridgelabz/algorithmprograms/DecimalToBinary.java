/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose:Write a static function toBinary that outputs 
*the binary (base 2) representation of the decimal number typed as the input.*/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class DecimalToBinary 
{
	//main method
	    public static void main(String a[])
	    {
	    	AlgorithmUtility u= new AlgorithmUtility();
	    	//method call
	    	System.out.println("enter the number");
			int n = AlgorithmUtility.intValue();
	    	u.deciToBin(n);
	    }
	}


//1101010