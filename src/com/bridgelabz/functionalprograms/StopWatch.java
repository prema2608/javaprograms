package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;
/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose:To print the time that elapses between the start and end clicks
 */
public class StopWatch 
{
	public static void main(String[] args) 
	{
		FunctionalUtility u=new FunctionalUtility();
		Scanner sc = new Scanner(System.in);

		System.out.println("Press '1' to Start Time: ");
	    sc.nextInt();
		u.startTime();

		System.out.println();
		System.out.println("Press '0' to Stop Time: ");
		sc.nextInt();
		u.stopTime();

		//calling the method
		long l=u.elapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed is:"+(l/1000)+" sec");
		
		
		
	}
	

	
}
