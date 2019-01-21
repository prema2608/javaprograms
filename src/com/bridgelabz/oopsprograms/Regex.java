package com.bridgelabz.oopsprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.bridgelabz.util.OopsUtility;

public class Regex 
{
	public static void main(String[] args) 

	{
		 
		BufferedReader fileReader;
		try {
			fileReader = new BufferedReader(new FileReader("/home/admin1/Desktop/regexfile.txt"));
			
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

				
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate localDate = LocalDate.now();
				
			   String date= dtf.format(localDate);
			
              
				String result = OopsUtility.patternMatch(fname, fullname, numb, date, line);
				
				System.out.println(result);
				
		}	catch (IOException io)
		{
			io.printStackTrace();
		}
	
	}
}











