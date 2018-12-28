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
	
	
	public boolean bubbleSort(int a[])
	{
		boolean bubb = false;
		int temp=0;
		for(int i=0;i<a.length;i++)         
		{
			for(int j=i+1;j<a.length;j++)
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
	
		System.out.println("The sorted order is:");

		for(int i=0;i<a.length;i++)      
		{
		     System.out.println(a[i]);		
		}
		return bubb;
}
	
	
	
	
	
	
	// Insertion sort
		
	
		public boolean  insertionSort(String[] ary)
		{

			
		       boolean insert;
		       
			System.out.println("Sorted order is: ");
			for(int i=0;i<ary.length;i++)
			{
				Arrays.sort(ary);
				System.out.println(ary[i]);
	       }
			return false;
			
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
	
	public int dayOfWeek(int m, int d, int y)
	{
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
	        return result;
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
            System.out.println("INVALID INPUT");
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



///BinarySearch methods

public boolean binaryOfInt(int[] array, int search, int n)
{
	boolean binInt = false;
	
	  int  first  = 0;
	   int last   = n - 1;
	   int middle = (first + last)/2;
	 bubbleSort(array);
	    while( first <= last )
	    {
	      if ( array[middle] < search )
	        first = middle + 1;    
	      else if ( array[middle] == search )
	      {
	        System.out.println(search + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if (first > last)
	      System.out.println(search + " isn't present in the list.\n");
	return binInt;
	  }

//binaryOfString

public void binaryOfString(String[] array, String search)
{
	
	//boolean binInt = false;

	  int first  =0;
	   int last   = array.length;
	   int middle = (first+last)/2;
	   insertionSort(array);
	    while( first <= last )
	    {
	      if (array[middle].compareTo(search)<0)
	        first = middle + 1;    
	      else if ( array[middle].compareTo(search)==0)
	      {
	        System.out.println(search + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if (first > last)
	      System.out.println(search + " isn't present in the list.\n");

	  }

//bubble sort for string


public boolean bubbleSort(String a[])
{
	boolean bubb1 = false;
	String temp=null;
	for(int i=0;i<a.length;i++)         
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i].compareTo(a[j])>0)
			{
				//Swapping
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("The sorted order is:");

	for(int i=0;i<a.length;i++)      
	{
	     System.out.println(a[i]);		
	}


	return bubb1;

}





//find your number



public void findNumber(String value,int low, int up, int mid, int count, int n)
{
	
   	System.out.println("Is this the number you taught?:"+mid);
	
//   	System.out.println("If the number you taught is greater than " +mid+ " then enter HIGH");
//   	System.out.println();
//   System.out.println("If the number you taught is greater than " +mid+ " then enter LOW");
//   System.out.println();
//   System.out.println("If the number you taught is same as " +mid+ " then enter YES");
//   	
	System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
	value=AlgorithmUtility.stringValue();
   	do
    {
   	
   		 if (value.equals("high"))
        {
			low= mid;
			count++;
			mid=(low+ up+1)/2;
			findNumber(value,low,  up,  mid, count, n);
        }
   		 
   		 else if(value.equals("low"))
         {
 			up=mid;
 			count++;
 			mid=(low+ up+1)/2;
 			findNumber(value,low,  up,  mid,count, n);
 		}
   		 
   		 
		else if (value.equals("yes"))
        {
			System.out.println("The number you thought was: "+mid);
			int no=count+1;
			System.out.println("It takes "+no+" times to find the number which you taught");
			
			break;
        }

	}
	while(low<=up);
		if (count>n)
		{
			System.out.println("Number is not found");
		}
		else
		{
			System.exit(0);
		}
	}


// binary swapping nibbles

   

public void binNibbles() {

	
	    	System.out.println("enter the number");
	    	int n =AlgorithmUtility.intValue();
	    	System.out.println(Integer.toBinaryString(n));
	    	
	    	System.out.println("before Swapping the nibbles:"+Integer.toBinaryString(n));
	    	n=swapNibbles1(n);
	    	System.out.println("After Swapping the nibbles:"+Integer.toBinaryString(n));
	    	int flag =0;
	    	for(int i=0;i<n;i++)
	    	{
	    		
	    	if(Math.pow(2, i)==n)
	    	{
	    		 flag =1;
	    	}
	    	
	    
	    	}
	    	if(flag==1)
	    		
	    	{
	    		System.out.println(n+" is power of 2");
	    	}
	    	else
	    	{
	    		System.out.println(n+" is not power of 2");
	    	}
	    	
}
public static int swapNibbles1(int n) 
{ 
    return ((n & 0x0F) << 4 | (n & 0xF0) >> 4); 
}


	
	
} 










	





	
	
	
	











































































































































