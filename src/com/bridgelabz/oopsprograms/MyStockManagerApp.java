package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.StockAccount;

public class MyStockManagerApp 
{

	public static void main(String[] args) throws IOException 
	{

		int op = 0;
		do 
		{
			System.out.println("PRESS 1. to Create Account  2.open Account 3. To EXIT ");
			System.out.println("Enter your choice");
			int choice = OopsUtility.intValue();
			switch(choice)
			{
			case 1:
			{
				StockAccount.createcustom();
				break;
			}
			case 2:
			{
				StockAccount.openAccount();
				break;
			}
			case 3:
			{
				System.exit(0);
				break;
			}
			default : break;
			}


		}while(op<3);
	}
}


