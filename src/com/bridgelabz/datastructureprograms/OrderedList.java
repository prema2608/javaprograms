/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose:  Read .a List of Numbers from a file and arrange it ascending Order in a Linked List.
* Take user input for a number, if found then pop the number out of the list else insert the 
* number in appropriate position*/


package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Linkedlist;

public class OrderedList 
{
	public static void main(String args[])throws IOException
	{
	FileReader file = new FileReader("/home/admin1/Desktop/number.txt");
	BufferedReader read=new BufferedReader(file);
	final String DELIMITER=" ";
	Linkedlist list = new Linkedlist();
      
	 try  
	 {
		 
	String word;
	while ((word = read.readLine()) != null) {
		String[] tokens = word.split(DELIMITER);
		for(String token:tokens)
		{
			Linkedlist.insert(list,token);
		}
		  Linkedlist.printList(list);

		int[] arr = Linkedlist.toIntConv(list);
		  
		
		int[] arr1=Linkedlist.stringSort(arr);
		 System.out.println( "sorted array is");
		for(int i=0;i<arr1.length;i++)
			if(arr1[i]!=0)
    
		System.out.println(arr1[i]);
	System.out.println("Enter the value");
		String str =DataStructureUtility.stringValue();
		int flag=0;
		for(int i=0;i<list.size(list);i++)
		{
//System.out.println(tokens[i]);
	    	if(str.equals(tokens[i]))
		     {
			
	    		Linkedlist.delete(list,str);
		       System.out.println("value is found and  deleted from list");
               flag=1;
		       Linkedlist.printList(list);
		       break;
		     }
		}
//		else 
		if(flag==0)
			{
			Linkedlist.insert(list,str);
			System.out.println("value is not found so added to list");
			Linkedlist.printList(list);
		}

			break;
			
	}
	 }catch (IOException io)
	 {
		 io.printStackTrace();
	 }
	
	}
	
	
	
	}

