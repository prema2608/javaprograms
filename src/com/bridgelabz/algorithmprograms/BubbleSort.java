package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

/*
*Created by: prema.s
*Date: 21/12/2018.
*Purpose: sort int elements  using bubble sort*/
public class BubbleSort 
{
public static void main(String[] args)
{
	AlgorithmUtility u= new AlgorithmUtility();

	
	boolean bubb;

	System.out.println("Enter how many numbers to be sorted:");
	int n=AlgorithmUtility.intValue();
	int a[]=new int[n];
	
	System.out.println("Enter value for "+n+" numbers:");

	for(int i=0;i<a.length;i++)       
	{
	    a[i]=AlgorithmUtility.intValue();	
	}
	//calling the method
	bubb=u.bubbleSort(a);
}
	
}
