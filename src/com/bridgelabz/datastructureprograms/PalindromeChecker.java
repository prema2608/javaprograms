/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose:To use a deque to store the characters of the string.
* We will process the string from left to right and add each character to the rear of the deque. 
.*/

package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.DequeUtil;

public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		DequeUtil<Character> dq=new DequeUtil<Character>();
		System.out.println("Enter a String: ");
		String s=DataStructureUtility.stringValue();

		//adding each character to the rear of the dequeue
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			dq.addRear(c);
		}
		int flag=0;

		while(dq.size()>1)
		{
			if(dq.removeFront()!=dq.removeRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Given String is not palindrome");
		}
	}
}

 