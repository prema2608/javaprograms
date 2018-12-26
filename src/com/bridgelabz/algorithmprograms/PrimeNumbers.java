package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;
/*
*Created by: prema.s
*Date: 20/12/2018.
*Purpose: to find the prime no. from 0 to 1000*/
public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		List<Integer> primeList = new ArrayList<>();
		//AlgorithmUtility u = new AlgorithmUtility();
		//calling the method
		primeList=AlgorithmUtility.primeNumbers();
		System.out.println(primeList);
	}

}
