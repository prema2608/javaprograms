package com.bridgelabz.datastructureprograms;
import com.bridgelabz.util.DataStructureUtility;
import java.io.*;
import java.util.LinkedList;                 

	public class UnOrderedList
	{
	public static void main(String args[])throws IOException
	{
	FileReader file = new FileReader("/home/admin1/Desktop/dogs.txt");
	BufferedReader read=new BufferedReader(file);
	final String DELIMITER=",";
	LinkedList<String> list = new LinkedList<String>();
      
	 try 
	 {
		 
	String word;
	while ((word = read.readLine()) != null) {
		String[] tokens = word.split(DELIMITER);
		for(String token:tokens)
		{
			list.add(token);
		}
		System.out.println(list);
		
		
		System.out.println("Enter the word to be searched");
		String str =DataStructureUtility.stringValue();
		 
		System.out.println("word is found and  deleted from list");
		if(str.equals(list))
		{
		   list.remove(str);	
		}
		
		else
		{ 
			System.out.println("word not found so added to list");
			list.add(str);
		}
		System.out.println(list);
	}
	 }catch (IOException io)
	 {
		 io.printStackTrace();
	 }
	}
           
	}
	
	
 
	