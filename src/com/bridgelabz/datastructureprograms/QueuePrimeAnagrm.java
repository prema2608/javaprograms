/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose: Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue using the Linked List 
*and Print the Anagrams from the Queue. ..*/

package com.bridgelabz.datastructureprograms;

import java.util.LinkedList;
import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Queue;

public class QueuePrimeAnagrm {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();

		Queue queue = new Queue();

		for (int i = 0; i < 1000; i++) {
			int flag = DataStructureUtility.checkPrime(i);
			if (flag == 0)
				list1.add(i);
		}

		queue = DataStructureUtility.primeAnagram3(list1);
		System.out.println("prime anagrams in the Stack:");

		while (!queue.isEmpty()) {
			System.out.print(queue.remove() + " " + queue.remove());
			System.out.println();
		}

	}
}
