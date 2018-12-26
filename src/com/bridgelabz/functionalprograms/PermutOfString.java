package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PermutOfString 
{
	public static void main(String[] args)
	{
		// generate all permutations of a String in Java
FunctionalUtility u = new FunctionalUtility();
Scanner sc = new Scanner(System.in);
System.out.println("enter the String");
			String s =sc.next();
			u.permutations(s.toCharArray(), 0);
		
		
	}

}
