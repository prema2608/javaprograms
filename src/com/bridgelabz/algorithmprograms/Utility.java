/*
*Created by: prema.s
*Date: 22/12/2018.
*Purpose: To perform sorting and searching operation and print there elapsed time in decreasing order*/
package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;
import com.bridgelabz.util.FunctionalUtility;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Utility 
{
	//main method
	public static void main(String[] args)
	{
       Map<String,Long> map=new HashMap<>();  
		   
          for(Map.Entry m:map.entrySet())
		  {  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

		int option;
		do
		{
		System.out.println("Enter 1 for binary Search for Integer"+
		"Enter 2 for Binary Search for String"+
        "Enter 3 for Insertion Sort for Integer"+
		"Enter 4 for Insertion Sort for String"+
		"Enter 5 for Bubble Sort for Integer"+
		"Enter 6 for Bubble Sort for String");
		
		System.out.println("Enter your option");
		option=AlgorithmUtility.intValue();
		
		AlgorithmUtility u=new AlgorithmUtility();
	    System.out.println("Enter number of elements");
	  int  n = AlgorithmUtility.intValue();
	  
	  String[]  array = new String[n];
	 System.out.println("Enter " + n + " elements");
	 

	 
	   switch(option)
	   {
	   case 1:
		 long startTimer =  FunctionalUtility.startTime();
		   for (int c = 0; c < n; c++)
		        array[c] = AlgorithmUtility.stringValue();
			 
			    System.out.println("Enter number to find");
			  String search = AlgorithmUtility.stringValue();
				
			  u.binaryOfString(array, search);
		long stopTimer = FunctionalUtility.stopTime();
		System.out.println("stop time is : "+stopTimer);
          
			  long elapsed=FunctionalUtility.elapsedTime(stopTimer,startTimer);
			  map.put("binInteger", elapsed/1000);
			  System.out.println("Elapsed time is: "+elapsed/1000+" sec");
		   break;
		   
	   case 2:
		   long startTimer1 =  FunctionalUtility.startTime();
		   for (int c = 0; c < n; c++)
		        array[c] = AlgorithmUtility.stringValue();
			 
			    System.out.println("Enter word to find");
			  String search1 = AlgorithmUtility.stringValue();
				
			  u.binaryOfString(array, search1);
			  long stopTimer1 = FunctionalUtility.stopTime();
				System.out.println("stop time is : "+stopTimer1);
		          
					  long elapsed1=FunctionalUtility.elapsedTime(stopTimer1,startTimer1);
					  map.put("binString", elapsed1/1000);
					  System.out.println("Elapsed time is: "+elapsed1/1000+" sec");
			 break;
			 
	   case 3:
		   long startTimer2 =  FunctionalUtility.startTime();
			boolean insert;
			
			String ary[]=new String[n];
				
			
			for(int i=0;i<ary.length;i++)
			{
				ary[i]=AlgorithmUtility.stringValue();
			}
		insert=	u.insertionSort(ary);
		long stopTimer2 = FunctionalUtility.stopTime();
		System.out.println("stop time is : "+stopTimer2);
          
			  long elapsed2=FunctionalUtility.elapsedTime(stopTimer2,startTimer2);
			  map.put("IsertInteger", elapsed2/1000);
			  System.out.println("Elapsed time is: "+elapsed2/1000+" sec");
		break;
	   case 4:
		   long startTimer3 =  FunctionalUtility.startTime();
		   boolean insert1;
			
			for(int i=0;i<array.length;i++)
			{
				array[i]=AlgorithmUtility.stringValue();
			}
		insert1=u.insertionSort(array);
		long stopTimer3 = FunctionalUtility.stopTime();
		System.out.println("stop time is : "+stopTimer3);
          
			  long elapsed3=FunctionalUtility.elapsedTime(stopTimer3,startTimer3);
			  map.put("InsertString", elapsed3/1000);
			  System.out.println("Elapsed time is: "+elapsed3/1000+" sec");
		   break;
		
	   case 5:
		   long startTimer4 =  FunctionalUtility.startTime();
		   boolean bubb1;
			
			for(int i=0;i<array.length;i++)
			{
				array[i]=AlgorithmUtility.stringValue();
			}
		   
		   bubb1=u.bubbleSort(array);
		   long stopTimer4 = FunctionalUtility.stopTime();
			System.out.println("stop time is : "+stopTimer4);
	          
				  long elapsed4=FunctionalUtility.elapsedTime(stopTimer4,startTimer4);
				  map.put("bubbInteger", elapsed4/1000);
				  System.out.println("Elapsed time is: "+elapsed4/1000+" sec");
		   break;
		   
	   case 6:
		   long startTimer5 =  FunctionalUtility.startTime();
		   boolean bubb2;
			
			for(int i=0;i<array.length;i++)
			{
				array[i]=AlgorithmUtility.stringValue();
			}		   
			 bubb2=u.bubbleSort(array);
			 long stopTimer5 = FunctionalUtility.stopTime();
				System.out.println("stop time is : "+stopTimer5);
		          
					  long elapsed5=FunctionalUtility.elapsedTime(stopTimer5,startTimer5);
					  map.put("bubbString", elapsed5/1000);
					  System.out.println("Elapsed time is: "+elapsed5/1000+" sec");
			break;
			 
	   default:
		   System.out.println("Enter valid choices");
		   
	   }
	 } while(option<=6);
		   
	   
		Map<String,Long> reverseSortedMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
         
        System.out.println("Elapsed time in decreasing order : " + reverseSortedMap+"sec");
		
	}
	
	
}
	 


		
	


