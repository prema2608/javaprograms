/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose: to calculate the minimum number of Notes 
*as well as the Notes to be returned by the Vending Machine as a Change
*/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class VendingMachine 
{//main method
	public static void main(String[] args)
	{
        AlgorithmUtility u=new AlgorithmUtility();
      
        System.out.println("enter the money");
        int money=AlgorithmUtility.intValue();
        
        int notes[]= {2000,500,100,50,10,5,2,1};
         u.vendingMachine(money, notes);//method call
        
		
	}
}
	



