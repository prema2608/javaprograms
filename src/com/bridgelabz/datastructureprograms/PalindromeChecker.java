package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.DequeUtility;

public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		DequeUtility<Character> dq=new DequeUtility<Character>();
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
			System.out.println("Given SString is not palindrome");
		}
	}
}

 