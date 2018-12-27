package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class BinOfString 
{
public static void main(String[] args)
{
	AlgorithmUtility u=new AlgorithmUtility();
    System.out.println("Enter number of elements");
  int  n = AlgorithmUtility.intValue();
  String[]  array = new String[n];
 
    System.out.println("Enter " + n + " words");
 
 
    for (int c = 0; c < n; c++)
      array[c] = AlgorithmUtility.stringValue();
 
    System.out.println("Enter word to find");
  String search = AlgorithmUtility.stringValue();
	
  u.binaryOfString(array, search);
}
}
