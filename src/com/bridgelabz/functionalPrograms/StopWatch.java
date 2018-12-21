package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

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

		long l=u.ElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed is:"+(l/1000)+" sec");
		
		
		
	}
	

	
}
