package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.AlgorithmUtility;

public class PrimeAnagrams 
{
	

	public static void main(String[] args) 
	{
		List<String> primeList = new ArrayList<>();
		 Set<String> primeAnagramSet=new HashSet<String>();
		
		//calling the method
		 
		 primeList=AlgorithmUtility.primeNumbers();
		 primeAnagramSet=AlgorithmUtility.primeAnagram(primeList);
		System.out.println("prime numbers which are anagrams are:");
		System.out.println(primeAnagramSet);
	}


}
