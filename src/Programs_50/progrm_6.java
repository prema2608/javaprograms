package Programs_50;

import java.util.Scanner;

public class progrm_6 
{
  public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int N = s.nextInt();
		
		for(int i=2;i<N;i++)
		{
			while(N%i==0)
			{
				System.out.println(i+"");
				N=N/i;
				
			}
		}
	  if(N>2)
	  {
		  System.out.println(N);
	  }
}
}