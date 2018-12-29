/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose: A program with cubic running time. Read in N integers 
*and counts the   number of triples that sum to exactly 0.
*/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.FunctionalUtility;
import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SumOf3AddsToZero 
{
	//main method
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

	//calling the method
	int sum=u1.findDiffTriplet(arr,size);
	System.out.println("No.of Tripltes :"+sum);

}
}
  