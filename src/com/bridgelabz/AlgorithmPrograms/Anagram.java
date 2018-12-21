package com.bridgelabz.AlgorithmPrograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

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
		
		u.anagramOfString(s1, s2);
		
		
		
		
	}

}
