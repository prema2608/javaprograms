/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose: to check  the given Two Strings are Anagram or not...*/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class Anagram
{
	//main method
	public static void main(String[] args)
	{
		AlgorithmUtility u = new AlgorithmUtility();
		boolean status;
		System.out.println("Enter the first String");
		String s1 =AlgorithmUtility.stringValue();
		
		
		
		System.out.println("Enter the Second String");
		String s2 = AlgorithmUtility.stringValue();
		//calling the method
		status=u.anagramOfString(s1, s2);
		
		if(status)
		{
		    System.out.println(s1+" and "+s2+" are Anagrams");
		}
		else
		{
			System.out.println(s1+" and "+s2+" are not Anagrams");
        }
		
		
		
	}

}
