package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;
/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose: to find the monthly payment using monthly payments you
* would have to make over Y years to pay off a P principal 
*loan amount at R per cent interest compounded monthly.*/
public class MonthlyPayment 
{
	
	public static void main(String[] args) 
	{
		AlgorithmUtility u = new AlgorithmUtility();
		double Paymnt;
		System.out.println("Enter the no. of years to pay off(y):");
		    double y = AlgorithmUtility.doubValue();
		    
		    System.out.println("Enter the principal loan amount(p):");
			double p =AlgorithmUtility.doubValue();
			
			System.out.println("Enter the compound intrest(R):");
			double R = AlgorithmUtility.doubValue();
			
			Paymnt=u.monthlyPayment(y, p, R);
	}

}
