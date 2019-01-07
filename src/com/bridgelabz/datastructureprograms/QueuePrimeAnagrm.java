/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose: Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue using the Linked List 
*and Print the Anagrams from the Queue. ..*/


package com.bridgelabz.datastructureprograms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Queue;

public class QueuePrimeAnagrm 
{
	public static void main(String[] args)
	{
        LinkedList<Integer> list1 = new LinkedList<Integer>();
		Set<Integer> set=new HashSet<Integer>();
		Queue queue=new Queue();

		for(int i=0;i<1000;i++) {
			int flag=DataStructureUtility.checkPrime(i);
			if(flag==0)
				list1.add(i);
		}
		set=DataStructureUtility.primeAnagram1(list1);
		System.out.println("prime anagrams in the queue:");
		// System.out.println();
		System.out.println(set);
		java.util.Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			queue.enqueue(itr.next());
		}


	}
}


