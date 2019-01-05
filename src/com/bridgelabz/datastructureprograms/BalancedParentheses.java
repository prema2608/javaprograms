package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.StackLogic;


public class BalancedParentheses

{
	public static void main(String[] args) 
	{
	
		System.out.println("Enter max size: ");
		int n=DataStructureUtility.intValue();
	

		/* Creating Stack */
		StackLogic stack = new StackLogic(n);
		System.out.println();
		System.out.println("Parenthesis Matching");
		System.out.println();
		 

		/* Accepting expression */
		System.out.println("Enter expression: ");
		String exp = DataStructureUtility.stringValue();        
		
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < exp.length(); i++)
		{    
		char ch = exp.charAt(i);

			if (ch == '(')
			{
			stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					long p = (stack.pop() + 1);
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					}
				}            
			}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		}                          
    }
 }
