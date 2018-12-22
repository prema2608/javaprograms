package com.bridgelabz.util;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility 
{
	//Anagram of string
	
	public void anagramOfString(String s1, String s2)
	{
		
	        boolean status = true;
	 
			if(s1.length() != s2.length())
			{
			  status = false;
			  System.out.println("Enter the both the strings of same size");
			}
			else
			{
			    char[] string1= s1.toLowerCase().toCharArray();
			    char[] string2 = s2.toLowerCase().toCharArray();
			    
			  
			    Arrays.sort(string1);
			    Arrays.sort(string2);
			    
			   
			    status = Arrays.equals(string1, string2);
			}
			
	        
			if(status)
			{
			    System.out.println(s1+" and "+s2+" are Anagrams");
			}
			else
			{
				System.out.println(s1+" and "+s2+" are not Anagrams");
	        }
	}

	//prime Numbers
	
	public void primeNumbers()
	{
		int i =0;
	    int num =0;
	       
	       String  primeNumbers = "";

	       for (i = 0; i <= 1000; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 0 to 1000 are :");
	       System.out.println(primeNumbers);
	   }
		
	
	
	
	//Bubble sort
	
	
	public void bubbleSort()
	{
		int i,j,temp=0;
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter how many numbers to be sorted:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println();
		System.out.println("Enter value for "+n+" numbers:");

		for(i=0;i<a.length;i++)       
		{
		    a[i]=sc.nextInt();		
		}

		for(i=0;i<a.length;i++)         
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					//Swapping
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("The sorted order is:");

		for(i=0;i<a.length;i++)      
		{
		     System.out.println(a[i]);		
		}
}
	// Insertion sort
		
	
		public void insertionSort()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no. of words to be printed: ");
			int n=sc.nextInt();
			 
			String ary[]=new String[n];
				
			System.out.println("Enter the words: ");

			for(int i=0;i<ary.length;i++)
			{
				ary[i]=sc.next();
			}
			System.out.println();
		       
			System.out.println("Sorted order is: ");
			for(int i=0;i<ary.length;i++)
			{
				Arrays.sort(ary);
				System.out.println(ary[i]);
	       }
			
		}
		
		
	
	
	
	
	
	//monthly payment
	
	public void monthlyPayment()
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the no. of years to pay off(y):");
	    double y = sc. nextDouble();
	    
	    System.out.println("Enter the principal loan amount(p):");
		double p = sc.nextDouble();
		
		System.out.println("Enter the compound intrest(R):");
		double R = sc.nextDouble();
		
		double n = 12*y;
		double r = R/(12*100);
		//formula
		
		double Paymnt=  p*r/(1-Math.pow((1+r),(-n)));
		
		System.out.println("The calculated monthly payment is:"+Paymnt);
	}
	
	//temperature conversion
	
	public void tempConversn() 
	{
		System.out.print("Enter the temperature in Fahrenheit: ");
	    Scanner scanner=new Scanner(System.in);
	    float fahrn=scanner.nextFloat();
	    float cel=(fahrn-32)*5/9;
	    System.out.println("Temperature in Celsius: "+cel);
	    
	    System.out.println();

	    System.out.print("Enter the temperature in Celsius: "); 
	    float celsius1=scanner.nextFloat();
	    float fahrenheit1=(celsius1*9/5)+32;
	    System.out.println("Temperature in Fahrenheit: "+fahrenheit1);
	  }
	
	 // Day of Week
	
	public void dayOfWeek()
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month");
		int m = sc.nextInt();
		
		System.out.println("Enter the day");
		int d = sc.nextInt();
		
		System.out.println("Enter the year");
		int y = sc.nextInt();
		
		   int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 +y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + 31 * m0 / 12) % 7;  
	        int result = d0;
	        if(result==0)
	        {
	        	System.out.println("the Day of the week is Sunday");
	        }
	        else if(result==1)
	        {
	        	System.out.println("the Day of the week is monday");
	        } 
	        
	        else if(result==2)
	        {
	        	System.out.println("the Day of the week is Tuesday");
	        } 
	        else if(result==3)
	        {
	        	System.out.println("the Day of the week is wednesday");
	        } 
	        else if(result==4)
	        {
	        	System.out.println("the Day of the week is Thursday");
	        } 
	        else if(result==5)
	        {
	        	System.out.println("the Day of the week is Friday");
	        } 
	        else if(result==6)
	        {
	        	System.out.println("the Day of the week is Saturday");
	        } 
	        else
	        {
	        	System.out.println("invalid input");
	        	
	        }
	}
	
	//Vending machine
	public void vendingMachine()
	{
		
	}
	
	}

	
	
	
	
	

