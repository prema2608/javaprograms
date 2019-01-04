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
		  
		
		Linkedlist.stringSort(arr);
		//Linkedlist.printList(list);

////		String[] array=  Linkedlist.insertionSort1( list);  
//		Object array;
//		for(String s:array)
//		{
//			System.out.println(s);
//		}
		System.out.println("Enter the number");
		String str =DataStructureUtility.stringValue();
		int flag=0;
		for(int i=0;i<list.size(list);i++)
		{
//System.out.println(tokens[i]);
	    	if(str.equals(tokens[i]))
		     {
			
	    		Linkedlist.delete(list,str);
		       System.out.println("number is found and  deleted from list");
               flag=1;
		       Linkedlist.printList(list);
		       break;
		     }
		}
//		else 
		if(flag==0)
			{
			Linkedlist.insert(list,str);
			System.out.println("number is not found so added to list");
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

