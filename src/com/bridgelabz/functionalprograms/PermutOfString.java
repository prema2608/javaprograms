/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose:To  generate all permutations of a String using recurssion and iterative method*/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PermutOfString 
{
	public static void main(String[] args)
	{
		// generate all permutations of a String 
FunctionalUtility u = new FunctionalUtility();
Scanner sc = new Scanner(System.in);
System.out.println("enter the String");
			String s =sc.next();
			//method call
			u.permutations(s.toCharArray(), 0);
		
		
	}

}
