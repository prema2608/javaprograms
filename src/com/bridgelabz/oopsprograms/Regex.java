package com.bridgelabz.oopsprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.util.OopsUtility;

public class Regex 
{
	public static void main(String[] args) 

	{
		String csvFile = "/home/admin1/Desktop/regexfile.txt";
		BufferedReader fileReader;
		try {
			fileReader = new BufferedReader(new FileReader(csvFile));
			
			String line = "";
			String sum;
			while ((sum = fileReader.readLine()) != null)
			{
				line=sum;
			}
			System.out.println(line);


				System.out.println("Enter your First name");
				String fname = OopsUtility.stringValue();

				System.out.println("Enter your Last name");
				String lname = OopsUtility.stringValue();
				String fullname = fname+lname;

				System.out.println("Enter your Phone number");
				String numb = OopsUtility.stringValue();

				System.out.println("Enter the date");
				String date = OopsUtility.stringValue();
                
			
              
				String result = OopsUtility.patternMatch(fname, fullname, numb, date, line);
				
				System.out.println(result);
				
		}	catch (IOException io)
		{
			io.printStackTrace();
		}
	
	}
}











