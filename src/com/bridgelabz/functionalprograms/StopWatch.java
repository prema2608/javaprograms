/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose:To print the time that elapses between the start and end clicks
 */
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class StopWatch 
{
	//main method
	public static void main(String[] args) 
	{
		FunctionalUtility u=new FunctionalUtility();
		Scanner sc = new Scanner(System.in);

		System.out.println("Press '1' to Start Time: ");
	    sc.nextInt();
	    
		long startTimer=FunctionalUtility.startTime();
		

		
		System.out.println("Press '0' to Stop Time: ");
		sc.nextInt();
		
	   long stopTimer=	FunctionalUtility.stopTime();
	   System.out.println("Stop Time is: "+stopTimer);

		//calling the method
		long l=FunctionalUtility.elapsedTime(stopTimer,startTimer);
	
		System.out.println("Total Time Elapsed is:"+(l/1000)+" sec");
		
		
		
	}
	

	
}
