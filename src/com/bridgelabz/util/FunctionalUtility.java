package com.bridgelabz.util;

import java.util.Scanner;

import com.bridgelabz.functionalPrograms.*;
public class FunctionalUtility
{

	public void Replacestring(String str1)
	{

		Scanner s = new Scanner(System.in);
		
	
	String	s1= s.nextLine();
		
		if(s1.length()>=3) 
		{
			String s2=str1.replace("##username##",s1);
		System.out.println(s2);
		}
		else
		{
		System.out.println("Invalid name");
		}
		
	}
	//flipcoin
	
	public void flipcoin(int n)
	{
		
		
	}
	

	public void Leapyear(int n)
	{
		 boolean flag = false;
		 	 
		 if(n%400 ==0)
		 {
			 flag= true;
		 }
		 else if(n%100 ==0)
		 {
			 flag=false;
		 }
		 else if(n%4 ==0)
		 {
			 flag= true;
		 }
		 else if(n%400 ==0)
		 {
			 flag= true;
		 }
		 else
		 {
			 flag=false;
		 }
		if(flag)
		{
			System.out.println("year "+n+" is a leap year");	
		}
		
		else
		{
			System.out.println("year "+n+" is not a leap year");	
		}
	}

	
	
	public void PrimeFactors(int n)

	{
	
		for(int i=2;i<n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i+"");
				n=n/i;
				
			}
		}
	  if(n>2)
	  {
		  System.out.println(n);
	  }
}
	}
	
	
	


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


