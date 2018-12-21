package com.bridgelabz.functionalPrograms;
import com.bridgelabz.util.FunctionalUtility;
import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SumOf3AddsToZero 
{
    public static void main(String[] args) 
    {
	FunctionalUtility u1=new  FunctionalUtility();
     Scanner sc = new Scanner(System.in);
	System.out.print("Enter Size of Array :");
	int size=sc.nextInt();
	int arr[]=new int [size];

	for(int i=0;i<arr.length;i++)
	{
		System.out.print("Enter "+(i+1)+" Value :");
		arr[i]=sc.nextInt();
	}

	 
	int sum=u1.findDiffTriplet(arr,size);//pass the arguments to method 1
	System.out.println("No.of Tripltes :"+sum);
System.out.println();
}
}
  