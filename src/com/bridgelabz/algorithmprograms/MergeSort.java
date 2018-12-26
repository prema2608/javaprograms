package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class MergeSort
{
	public static void main(String[] args)
    {
		
	        System.out.println("Merge sort");
	        int i;
	        System.out.println("Enter the size of your array");
	        int n=AlgorithmUtility.intValue();
	        String arr[]=new String[n];
	        System.out.println("Enter the elements");

	        for( i=0;i<n;i++)
	        {   
	            arr[i]=AlgorithmUtility.stringValue();
	        }
	        AlgorithmUtility u=new AlgorithmUtility();
	        u.mergeSort(arr,0,n);//method call
	        System.out.println("Elements after sorting");
	        for(i=0;i<n;i++)
	        {
	            System.out.println(arr[i]+"");
	        }

	    
}
}
