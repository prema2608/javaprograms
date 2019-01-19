package com.bridgelabz.oopsprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.StockPortfolio;

public class StockManagmnt 
{

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{ 
		int val = 0;
	
		do
		{
		System.out.println("Enter 1. to Add Stock  2.to cal each stock  3. cal total stock");
		System.out.println("Enter your choice");
		int choice = OopsUtility.intValue();
		
		switch(choice)
		{
		case 1:
		{
			StockPortfolio.addStock();
			break;
		}
		
		case 2:
		{
			StockPortfolio.eachStockValue();
			break;
		}
		case 3:
		{
			StockPortfolio.totalStockValue();
			break;
		}
		default:break;
		}
		
		
	}while(val<3);
	
	}
}
