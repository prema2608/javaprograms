/*
 *Created by: prema.s
 *Date: 22/12/2018.
 *Purpose:  Write a Stack Class to push open parenthesis “(“ and pop closed parenthesis “)”.
 * At the End of the Expression if the Stack is Empty then 
 * the Arithmetic Expression is Balanced. .*/

package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;

public class BalancedParentheses

{
	public static void main(String[] args) {


		int n=0;
		DataStructureUtility d=new DataStructureUtility();
		{
			do
			{
				System.out.println("1.Enter the expression\n2.To exit program");
				int choice=DataStructureUtility.intValue();
				switch(choice)
				{
				case 1:System.out.println("Enter expression: ");
				String str = DataStructureUtility.stringValue();
				char[] ch = str.toCharArray();
				//Method 1- using static function of Utility class of com.bridgelabz.util package
				if (d.isBalanced(ch)) {
					System.out.println(str+" is a balanced expression");
				}
				else
				{
					System.out.println(str +" is not a balanced expression");
				}
				break;
				case 2:System.out.println("Thankyou");
				System.exit(0);
				break;
				default:System.out.println("Please select correct choice");
				}
				n++;
			}while(n<30);
		}
	}

}

