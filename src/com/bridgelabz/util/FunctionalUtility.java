package com.bridgelabz.util;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.functionalPrograms.*;
public class FunctionalUtility
{
//replacestring
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
		
		  int head=0,tail=0;
		int c=n;
		Random r=new Random();	
		while(n!=0)
		{
			double rn=r.nextDouble();
			if(rn>.50){
				++head;
			}
			else 
			{
				++tail;
			}
			n--;
		}
		System.out.println("perc of Head="+ head*100/c);
		System.out.println("perc of Tail="+ tail*100/c);

		}
		
		
//leapyear
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

	//power of 2
	
	public void powerOf2(int n)
	{
		int count=0;
		if(n>=0 && n<31)
		{
			for(int i=0;i<=n;i++)
			{
				double t=Math.pow(2, count);
				count++;
				System.out.println("the computed series is:");
			}
		}
		
		
	}
	
	
	//prime factors
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
	
	
//Harmonic number
  public double harmonicNumber(int n)
	{
		double sum=0.0;
		if(n==1)
			return 1;
		else{
			for(double i=1;i<=n;i++)
			{
				sum=sum+(1/i);

			}
			return sum;
		}

	}
//gambler
  
public void gamblerWinLoss(int s,int g,int t)
{
	int win =0,loss=0,j=t;
	Random r=new Random();

	while(g-->0 && t-->0)
	{
		int n=r.nextInt(2);
		if(n==0)
		{
			s--;
			loss++;
		}
		else
		{
			win++;
			s++;
		}

	}
	System.out.println("No. of win="+win);
	System.out.println("No. of loss="+loss);
	System.out.println("win %="+win*100/j);
	System.out.println("loss %="+loss*100/j);
	System.out.println("remaining stack=" +s);
	System.out.println("remaining choices= " +t);
	System.out.println("remaining goals=" +g);

}


//coupon numbers

public int couponNumber(int n)
{
	boolean[] isCollected = new boolean[n];  
	int count = 0;                           
	int distinct = 0;                        
	while (distinct < n) 
	{
		Random r=new Random();
		int value =r.nextInt(n);// (int) (Math.random() * n);  
		count++;                                 
		if (isCollected[value]==false) 
		{
			distinct++;
			System.out.println(distinct);
			isCollected[value] = true;
		}
	}


	return  count;
}
  
  //2D Array

//sumof3AddsTo-0 



	public static int findDiffTriplet(int b[],int length)
	{
		System.out.println();
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				for(k=j+1;k<length;k++)
				{
					// printing distinct triples (i, j, k) where a[i] + a[j] + a[k] = 0
					if (b[i] + b[j] + b[k] == 0)
					{
						System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
					}
				}
			}
		}
		// return number of distinct triplets (i, j, k) such that a[i] + a[j] + a[k] = 0
		return count;
	}

}




  



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


