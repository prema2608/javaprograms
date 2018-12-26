package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.algorithmprograms.VendingMachine;

public class AlgorithmUtility 
{
	
	static Scanner sc = new Scanner(System.in);

	
	 public	static int intValue()
		{
			try 
			{ 
				
			return sc.nextInt();	
				
			 }
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			return 0;
		}
	
	 public	static double doubValue()
		{
			try 
			{ 
				
			return sc.nextDouble();	
				
			 }
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			return 0.0;
		}
	
	 public	static boolean boolValue()
		{
			try 
			{ 
				
			return sc.nextBoolean();
			 }
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			return false ;
		}
	 
	 public	static float floatValue()
		{
			try 
			{ 
				
			return sc.nextFloat();	
				
			 }
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			return 0;
			
		}
	 public	static String stringValue()
		{
			try 
			{ 
				
			return sc.next();	
				
			 }
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
			return null ;
		}
	
	
	//Anagram of string
	
	
	/**
	 * @param s1
	 * @param s2
	 * @return
	 */
	public boolean anagramOfString(String s1, String s2)
	{
		
	        boolean status=true;
	 
			if(s1.length() != s2.length())
			{
			  status = false;
			  System.out.println("Enter the both the strings of same size");
			}
			else
			{
			    char[] string1= s1.toLowerCase().toCharArray();
			    char[] string2 = s2.toLowerCase().toCharArray();
			    
			  
			    Arrays.sort(string1);
			    Arrays.sort(string2);
			    
			   
			    status = Arrays.equals(string1, string2);
			}
			
			return status;
			
	        
			
	}

	//prime Numbers
	
	public static List<Integer> primeNumbers()
	{
		List<Integer> primeList = new ArrayList<>();
		int i =0;
	    int num =0;
	       
	       String  primeNumbers = "";

	       for (i = 2; i <= 1000; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
			  primeList.add(i);
		     //primeNumbers = primeNumbers + i + " ";
		  }	
	   }	
	       
	       System.out.println("Prime numbers from 0 to 1000 are :");
	       System.out.println(primeNumbers);
		return primeList;
		
	   }
		
	//anagram palindrome
	

	public static void anagramPalin(List<Integer> primeList)
	{
		
	}
	
	
	
	//Bubble sort
	
	
	public void bubbleSort()
	{
		int i,j,temp=0;
	
		System.out.println("Enter how many numbers to be sorted:");
		int n=AlgorithmUtility.intValue();
		int a[]=new int[n];
		
		System.out.println("Enter value for "+n+" numbers:");

		for(i=0;i<a.length;i++)       
		{
		    a[i]=sc.nextInt();		
		}

		for(i=0;i<a.length;i++)         
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					//Swapping
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("The sorted order is:");

		for(i=0;i<a.length;i++)      
		{
		     System.out.println(a[i]);		
		}
}
	// Insertion sort
		
	
		public void insertionSort()
		{

			System.out.println("Enter no. of words to be printed: ");
			int n=AlgorithmUtility.intValue();
			 
			String ary[]=new String[n];
				
			System.out.println("Enter the words: ");

			for(int i=0;i<ary.length;i++)
			{
				ary[i]=AlgorithmUtility.stringValue();
			}
			System.out.println();
		       
			System.out.println("Sorted order is: ");
			for(int i=0;i<ary.length;i++)
			{
				Arrays.sort(ary);
				System.out.println(ary[i]);
	       }
			
		}
		
		
	
	
	
	
	
	//monthly payment
	
	public double monthlyPayment(double y, double p, double r2)
	{
	  
		double n = 12*y;
		double r = r2/(12*100);
		//formula
		
		double Paymnt=  p*r/(1-Math.pow((1+r),(-n)));
		
		System.out.println("The calculated monthly payment is:"+Paymnt);
		return Paymnt;
	}
	
	//temperature conversion
	
	public float tempConversn(float fahrn, float cel, int choice) 
	{
		float result = 0.0f;
		if (choice == 1) 
		{
			result = (fahrn - 32) * 5 / 9;
			return result;
		} 
		else 
		{
			result = (cel * 9 / 5) + 32;

			return result;
		}

	}
	
	
	 // Day of Week
	
	public boolean dayOfWeek(int m, int d, int y)
	{
		boolean flag = false;
		
		   int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 +y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + 31 * m0 / 12) % 7;  
	        int result = d0;
	        if(result==0)
	        {
	        	System.out.println("the Day of the week is Sunday");
	        }
	        else if(result==1)
	        {
	        	System.out.println("the Day of the week is monday");
	        } 
	        
	        else if(result==2)
	        {
	        	System.out.println("the Day of the week is Tuesday");
	        } 
	        else if(result==3)
	        {
	        	System.out.println("the Day of the week is wednesday");
	        } 
	        else if(result==4)
	        {
	        	System.out.println("the Day of the week is Thursday");
	        } 
	        else if(result==5)
	        {
	        	System.out.println("the Day of the week is Friday");
	        } 
	        else if(result==6)
	        {
	        	System.out.println("the Day of the week is Saturday");
	        } 
	        else
	        {
	        	System.out.println("invalid input");
	        	
	        }
	        return flag;
	}
	
	
 
//merge sort

	
	public  void mergeSort(String array[],int low,int high)
    {
        int n=high-low;
        if(n<=1)
            return;
        int mid=low+n/2;
        mergeSort(array,low,mid);//recursive calling
        mergeSort(array,mid,high);//recursive calling
        String[] temparr=new String[n];
        int i=low,j=mid;
        for(int k=0;k<n;k++)
        {
            if(i==mid)
                temparr[k]=array[j++];
            else if(j==high)
                temparr[k]=array[i++];
            else if(array[j].compareToIgnoreCase(array[i])<0)
                temparr[k]=array[j++];
            else
                temparr[k]=array[i++];
        }

        for(int k=0;k<n;k++)
        {
            array[low +k]=temparr[k];
        }
   }
	
	//Vending machine
	
	public void vendingMachine(int money, int[] notes) {

        int rem;
        int i=0;
        int total=0;

        if(money==0)
        {
            System.out.println("no outputs");
        }
        else
        { for(i=0;i<notes.length;i++)
        {
            if(money>=notes[i])
            {
                int calNotes=money/notes[i];
                rem=money%notes[i];
                money=rem;
                total=total+calNotes;
                System.out.println(notes[i]+ " Ruppee Notes:  "+calNotes);

            }

        }

        System.out.println("Total numbet of notes are"+total);

        }
    }


	
	
	//Square root of n	

public static double getSqrt(double e,double c) 
{
     double t=c;
     while(Math.abs(t - c/t) > e*t )
{
         t=((c/t)+t)/2;
         System.out.println("Apprx sqrt is= "+t);
     }
     return t;

 }

//decimalTobinary
public void deciToBin()
{
	
	    	System.out.println("enter the number");
	    	int n =AlgorithmUtility.intValue();
	    	System.out.println(Integer.toBinaryString(n));
	    	
}
	
}

	





	
	
	
	











































































































































