/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose: Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a stack using the Linked List 
*and Print the Anagrams from the stack. ..*/
package com.bridgelabz.datastructureprograms;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Stack;

public class StackPrimeAnagrm 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		Set<Integer> set=new HashSet<Integer>();
		Stack stack=new Stack(1000);

		for(int i=0;i<1000;i++) {
			int flag=DataStructureUtility.checkPrime(i);
			if(flag==0)
				list1.add(i);
		}
	set=DataStructureUtility.primeAnagram1(list1);
	 System.out.println("prime anagrams in the Stack:");
    // System.out.println();
	System.out.println(set);
	java.util.Iterator<Integer> itr=set.iterator();
         while(itr.hasNext()) {
        	 stack.push(itr.next());
         }
    	 System.out.print("prime anagrams in Stack in reverse order:");
         System.out.println();

         while(!stack.isEmpty())
             System.out.print(stack.pop() +" ");

		}		
}




	
