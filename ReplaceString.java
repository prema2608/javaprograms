package com.bridgelabz.functionalPrograms;

import com.bridgelabz.util.FunctionalUtility;
import java.util.Scanner;
public class ReplaceString 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	System.out.println("enter the usernme:");
	String str1="hello ##username##,how r you?";
		FunctionalUtility utility = new FunctionalUtility();
	     utility.Replacestring(str1);
		
	}
}
