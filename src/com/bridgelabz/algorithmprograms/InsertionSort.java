package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;
/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose: sort string elements using insertion sort*/
public class InsertionSort
{
	public static void main(String[] args)
	{
		AlgorithmUtility u = new AlgorithmUtility();
		//calling the method
		boolean insert;
		System.out.println("Enter no. of words to be printed: ");
		int n=AlgorithmUtility.intValue();
		 
		String ary[]=new String[n];
			
		System.out.println("Enter the words: ");

		for(int i=0;i<ary.length;i++)
		{
			ary[i]=AlgorithmUtility.stringValue();
		}
	insert=	u.insertionSort(ary);
	}
}
