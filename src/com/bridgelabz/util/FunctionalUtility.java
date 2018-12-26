package com.bridgelabz.util;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.functionalprograms.*;
public class FunctionalUtility
{
	
//replacestring
	//method to replace string with String as input
	public void replaceString(String str1)
	{

		Scanner s = new Scanner(System.in);
	String	s1= s.nextLine();
		
		if(s1.length()>=3) 
		{
			String s2=str1.replace("##username##",s1);
		System.out.println(s2);
		}
		else
		{
		System.out.println("Invalid name");
		}
		
	}
	//flipcoin
	
	//method  with integer as input
	public void flipCoin(int n)
	{
		
		  int head=0,tail=0;
		int c=n;
		Random r=new Random();	
		while(n!=0)
		{
			double rn=r.nextDouble();
			if(rn>.50){
				++head;
			}
			else 
			{
				++tail;
			}
			n--;
		}
		System.out.println("perc of Head="+ head*100/c);
		System.out.println("perc of Tail="+ tail*100/c);

		}
		
		
//leapyear
	
	public boolean leapYear(int n)
	{
		 boolean flag = false;
		 	 
		 if(n%400 ==0)
		 {
			 flag= true;
		 }
		 else if(n%100 ==0)
		 {
			 flag=false;
		 }
		 else if(n%4 ==0)
		 {
			 flag= true;
		 }
		 else if(n%400 ==0)
		 {
			 flag= true;
		 }
		 else
		 {
			 flag=false;
		 }
		
		return flag;
	}

	//power of 2
	
	public void powerOf2(int n)
	{
		int count=0;
		if(n>=0 && n<31)
		{
			for(int i=0;i<=n;i++)
			{
				double t=Math.pow(2, count);
				count++;
				System.out.println("the computed series is:");
			}
		}
		
		
	}
	
	
	//prime factors
	public void primeFactors(int n)

	{
	
		for(int i=2;i<n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i+"");
				n=n/i;
				
			}
		}
		//brute force
	  if(n>2)
	  {
		  System.out.println(n);
	  }
	}
	
	
//Harmonic number
  public double harmonicNumber(int n)
	{
		double sum=0.0;
		if(n==1)
			return 1;
		else{
			for(double i=1;i<=n;i++)
			{
				sum=sum+(1/i);

			}
			return sum;
		}

	}
  
  
  //(
//gambler ( not sure)
public void gamblerWinLoss(int s,int g,int t)
{
	int win =0,loss=0,j=t;
	Random r=new Random();

	while(j==0 && t==0)
	{
		int n=r.nextInt(2);
		if(n==0)
		{
			s--;
			loss++;
		}
		else
		{
			win++;
			s++;
		}

	}
	System.out.println("No. of win="+win);
	System.out.println("No. of loss="+loss);
	System.out.println("win %="+win*100/j);
	System.out.println("loss %="+loss*100/j);
	System.out.println("remaining stack=" +s);
	System.out.println("remaining choices= " +t);
	System.out.println("remaining goals=" +g);

}


//coupon numbers

public int couponNumber(int n)
{
	boolean[] collect= new boolean[n];  
	int count = 0;                           
	int dist = 0;                        
	while (dist< n) 
	{
		Random r=new Random();
		int value =r.nextInt(n);
		count++;                                 
		if (collect[value]==false) 
		{
			dist++;
			System.out.println(dist);
		}
			else 
			{
			   collect[value] = true;
			}
   	}

  return  count;
}
  
  //2D Array

public static int[][] arrayInt(int m,int n)
{
	int a[][]=new int[m][n];
	FunctionalUtility u=new FunctionalUtility();  
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println("Integer Array");

	for(int i = 0; i<m; i++)
	{
		for (int j = 0; j<n; j++)
	    {
			a[i][j] = sc.nextInt();
	    }   
	}
	return a;
}

public static double[][] arrayDouble(int m,int n)
{
	double b[][]=new double[m][n];
	FunctionalUtility u=new FunctionalUtility(); 
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println("Double Array");

	for(int i = 0; i<m; i++)
	{
		for (int j = 0; j<n; j++)
	    {
			b[i][j] = sc.nextDouble();
	    }   
	}
	return b;
}

public static String[][] arrayBoolean(int m,int n)
{
String c[][]=new String[m][n];
FunctionalUtility  u=new FunctionalUtility();    
Scanner sc = new Scanner(System.in);
System.out.println();
System.out.println("Boolean Array");

	for(int i = 0; i<m; i++)
	{
		for (int j = 0; j<n; j++)
		{
			c[i][j] = sc.next();
		}   
	}
return c;
}


public static void display(int[][]a,double[][]b,String[][]c,int m,int n)
{
PrintWriter pw=new PrintWriter(System.out,true);

// integers
System.out.println();
pw.println("2D ARRAY INTEGER");

for(int i = 0; i<m; i++)
{
	for (int j = 0; j<n; j++)
    {
		pw.print("\t"+a[i][j]+" ");
    } 
 pw.println("\t");
}

//double
System.out.println();
pw.println("2D ARRAY DOUBLE");
	
for(int i = 0; i<m; i++)
{
	for (int j = 0; j<n; j++)
    {
		pw.print("\t"+b[i][j]+" ");
    } 
pw.println("\t");
}
	 
// boolean
System.out.println();
pw.println("2D ARRAY BOOLEAN");
		
for(int i = 0; i<m; i++)
{
	for (int j = 0; j<n; j++)
	{
		pw.print("\t"+c[i][j]+" ");
	} 
pw.println("\t");
}
}


//sumof3AddsTo-0 
//method to find the triplets
	public static int findDiffTriplet(int b[],int length)
	{
		System.out.println();
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				for(k=j+1;k<length;k++)
				{
					
					if (b[i] + b[j] + b[k] == 0)
					{
						System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
					}
				}
			}
		}
		
		return count;
	}



//StopWatch

public long startTimer=0;
public long stopTimer=0;
public long elapsed;


public void startTime()
{
	startTimer=System.currentTimeMillis();
	System.out.println("Start Time is: "+startTimer);
}


public void stopTime()
{
	stopTimer=System.currentTimeMillis();
	System.out.println("Stop Time is: "+stopTimer);
}

public long elapsedTime()
{
	elapsed=stopTimer-startTimer;
	return elapsed;
}




//Distance of tw0 points


public void distanceOfPoints()

{
	 int x1,x2,y1,y2;
	 
     double dis;

     Scanner sc=new Scanner(System.in);

     System.out.println("enter x1 point");

         x1=sc.nextInt();

         System.out.println("enter y1 point");

         y1=sc.nextInt();

     System.out.println("enter x2 point");

         x2=sc.nextInt();

     System.out.println("enter y2 point");

         y2=sc.nextInt();
	    
 dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	    	 	    
       System.out.println("distance btw the"+"["+x1+","+y1+"]&"+"["+x2+","+y2+"]="+dis);

	
	
}



//Quadratic Equation


public void quadraticEqu()
{
    int a, b, c;

    double root1, root2, d;

    Scanner s = new Scanner(System.in);

    System.out.println("Given quadratic equation:ax^2 + bx + c");

    System.out.print("Enter a:");

    a = s.nextInt();

    System.out.print("Enter b:");

    b = s.nextInt();

    System.out.print("Enter c:");

    c = s.nextInt();

    System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);

    d = b * b - 4 * a * c;

    if(d > 0)

    {

        System.out.println("Roots are real and unequal");

        root1 = (- b + Math.sqrt(d))/(2*a);

        root2 = (-b - Math.sqrt(d))/(2*a);

        System.out.println("First root is:"+root1);

        System.out.println("Second root is:"+root2);

    }

    else if(d == 0)

    {

        System.out.println("Roots are real and equal");

        root1 = (-b+Math.sqrt(d))/(2*a);

        System.out.println("Root:"+root1);

    }
}



// WindChill

public void windChill()
{
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the temp in Fahrenheit " +
		"between -58ºF and 41ºF: ");
	double temp= sc.nextDouble();
	System.out.print("Enter the wind speed(v)>=2: ");
	
	double v = sc.nextDouble();

    //formula
	double wc = 35.74 + 0.6215 * temp -
							 35.75 * Math.pow(v, 0.16) +
							 0.4275 * temp* Math.pow(v, 0.16);

	System.out.println("The wind chill index is " + wc);
}



//permutation of string using recursive func
/// copied

	// Utility function to swap two characters in a character array
	public static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	// Recursive function to generate all permutations of a String
	 public static void permutations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) 
		{
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

//permutation using iterative method
	 
	 
}



		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


