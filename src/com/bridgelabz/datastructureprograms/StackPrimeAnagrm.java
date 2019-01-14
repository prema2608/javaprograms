/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose: Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a stack using the Linked List 
*and Print the Anagrams from the stack. ..*/
package com.bridgelabz.datastructureprograms;

import java.util.LinkedList;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Stack;

public class StackPrimeAnagrm {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < 1000; i++) {
			int flag = DataStructureUtility.checkPrime(i);
			if (flag == 0)
				list1.add(i);
		}
		stack = DataStructureUtility.primeAnagram2(list1);
		System.out.println("prime anagrams in the Stack:");

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " " + stack.pop());
			System.out.println();
		}

	}
}
