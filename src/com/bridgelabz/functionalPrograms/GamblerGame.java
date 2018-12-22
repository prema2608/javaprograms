package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;
/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose:Print Number of Wins and Percentage of Win and Loss.
 */

public class GamblerGame
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the player stack");  
	    int stack=sc.nextInt();
	    System.out.println("Enter the Goal");
	    int goal=sc.nextInt();
	    System.out.println("Enter the totalTimes");
	    int totalTimes=sc.nextInt();
	    FunctionalUtility utility = new FunctionalUtility();
	  //calling the method
		utility.gamblerWinLoss(stack,goal,totalTimes);
		
	}


	
	
	
	
}
