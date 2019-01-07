/*
 *Created by: prema.s
 *Date: 22/12/2018.
 *Purpose: Create a Program which creates Banking Cash Counter 
 *where people come in to deposit Cash and withdraw Cash.
 * Have an input panel to add people to Queue to either
 * deposit or withdraw money and dequeue the people. Maintain the Cash Balance...*/

package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.Queue;
import com.bridgelabz.util.DataStructureUtility;

public class BankCounter 
{
	public static void main(String args[])
	{ 

		Queue q=new Queue();
		int ch = 0;
		int cash = 1000;
		System.out.println("Total Cash in the Counter: "+cash);
		do
		{ 
			System.out.println();
			System.out.println("Banking Cash Counter");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Number of people in the Queue ");
			System.out.println("4.Exit");
			System.out.println();
			System.out.println("Enter your choice: ");
			int choice=DataStructureUtility.intValue();
			switch (choice) 
			{
			case 1:
				System.out.println("Enter the amount you want to Deposit");
				int amt =DataStructureUtility.intValue();
				q.enqueue(amt);
				cash=cash+amt;
				q.display(cash);
				break;
			case 2:
				System.out.println("Enter the amount you want to Withdraw ");
				int amt1 =DataStructureUtility.intValue();
				q.enqueue(amt1);
				cash=cash-amt1;
				q.display(cash);
				break;
			case 3:
				int j=q.getSize();
				System.out.println("The Number of People in Queue is: "+j);		
				break;
			case 4:
				System.exit(0);
				System.out.println();
			default: 
				System.out.println("You entered wrong choice");
				break;
			}
		}
		while(ch<5);
	}
} 
