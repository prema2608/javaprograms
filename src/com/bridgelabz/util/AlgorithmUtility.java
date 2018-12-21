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
		
	}
	

