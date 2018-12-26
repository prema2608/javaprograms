package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalUtility;
import java.util.Scanner;
/*
*Created by: prema.s
*Date: 18/12/2018.
//*Purpose:  Take User Name as Input & Print the String with User Name 
*/
public class ReplaceString 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	System.out.println("enter the usernme:");
	String str1="hello ##username##,how r you?";
		FunctionalUtility utility = new FunctionalUtility();
	     utility.replaceString(str1);
		
	}
}
