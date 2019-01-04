package com.bridgelabz.datastructureprograms;
import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Linkedlist;

import java.io.*;                 

	public class UnOrderedList
	{
	public static void main(String args[])throws IOException
	{
	FileReader file = new FileReader("/home/admin1/Desktop/dogs.txt");
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
		
		System.out.println("Enter the word to be searched");
		String str =DataStructureUtility.stringValue();
		int flag=0;
		for(int i=0;i<list.size(list);i++)
		{
//System.out.println(tokens[i]);
	    	if(str.equals(tokens[i]))
		     {
			
	    		Linkedlist.delete(list,str);
		       System.out.println("word is found and  deleted from list");
               flag=1;
		       Linkedlist.printList(list);
		       break;
		     }
		}
//		else 
		if(flag==0)
			{
			Linkedlist.insert(list,str);
			System.out.println("word not found so added to list");
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
	
	
           
	
	
 
	