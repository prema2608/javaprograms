package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.DataStructureUtility;

public class PrimeNum2D 
{

	public static void main(String[] args)
	{

		List<List<Integer>> lt = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		int x=0;
		int y =100;


		for(int i=0;i<10;i++)
		{
			System.out.println("The prime numbers  from " +x+" to "+y+" are:");	 
			list=DataStructureUtility.primeNumbers(x,y);
			lt.add(list);
			System.out.println(list);

			x+=100;
			y+=100;


		}

	}
}

