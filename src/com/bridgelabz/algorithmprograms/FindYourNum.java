package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;


public class FindYourNum

{
	public static void main(String[] args)
    {
		
			AlgorithmUtility u = new AlgorithmUtility();
			System.out.println("Enter any Number:");
			int n= AlgorithmUtility.intValue();
			int range=(int)(Math.pow(2,n-1));              
			System.out.println("Take number between 1 to "+range);
		int	count=0, low=0;
		String value=null;
		int up=range;
		int mid=(low+up/2);	
		
	      u.findNumber(value,low,  up,  mid, count, n);
		}
		
    }

	

		
	

	



