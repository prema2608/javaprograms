package com.bridgelabz.functionalPrograms;
import com.bridgelabz.util.FunctionalUtility;
import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year:");
		int n = s.nextInt();
		FunctionalUtility utility = new FunctionalUtility();
		utility.Leapyear(n);
	}

}
