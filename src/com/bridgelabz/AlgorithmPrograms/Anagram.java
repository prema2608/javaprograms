package com.bridgelabz.AlgorithmPrograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;
/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose: to check  the given Two Strings are Anagram or not...*/
public class Anagram
{
	public static void main(String[] args)
	{
		AlgorithmUtility u = new AlgorithmUtility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fiest String");
		String s1 = sc.next();
		
		System.out.println("Enter the Second String");
		String s2 = sc.next();
		//calling the method
		u.anagramOfString(s1, s2);
		
		
		
		
	}

}
