/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose:To store only the numbers in that range that are Anagrams. 
*For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range. 
*Further store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
*/

package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.DataStructureUtility;

public class PrimeAnagram2D 
{
	public static void main(String[] args)
	{

		List<List<String>> list1=new ArrayList<List<String>>();

		Set<String> primeAnagram=new HashSet<String>();
		List<String> prime=new ArrayList<String>();
		List<String> primeAnagram1=new ArrayList<String>();

		prime=DataStructureUtility.rangePrime1(0, 1000);       

		primeAnagram=DataStructureUtility.primeAnagram(prime);

		primeAnagram1.addAll(primeAnagram);

		list1.add(primeAnagram1);

		for(int i=0;i<primeAnagram1.size();i++)
		{
			if(prime.contains(primeAnagram1.get(i)))
			{
				prime.remove(primeAnagram1.get(i));
			}

		}
		list1.add(prime);
		DataStructureUtility.printPrimeAndAnagram(list1);


	}
}




