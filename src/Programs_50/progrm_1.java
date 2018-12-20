package Programs_50;

import java.util.Scanner;

public class progrm_1 
{
	public static void main(String[] args) 
	{
		String s1,s2,s3,s4;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name");
		s1= s.nextLine();
		
		if(s1.length()>3) 
		{
		System.out.println("hello "+s1+"how r you");
		s2= s.nextLine();
		
		System.out.println("Enter the name to replace");
		s3= s.nextLine();
		
		s4 = s1.replace(s2, s3);
		
		System.out.println(s4);
	}
	

	}
}
