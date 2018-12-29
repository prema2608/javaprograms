/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose: Takes a command-line argument N, asks you to think of 
*a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.

*/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;


public class FindYourNum

{
	//main method
	public static void main(String[] args)
    {
		
			AlgorithmUtility u = new AlgorithmUtility();
          
			String i=args[0];
			int n=Integer.parseInt(i);
			int range=(int)(Math.pow(2,n-1));              
			System.out.println("Take number between 1 to "+range);
		int	count=0, low=0;
		String value=null;
		int up=range;
		int mid=(low+up/2);	
		
		//method call
	      u.findNumber(value,low,  up,  mid, count, n);
		}
		
    }

	

		
	

	



