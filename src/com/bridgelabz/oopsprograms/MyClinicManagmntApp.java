package com.bridgelabz.oopsprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;

public class MyClinicManagmntApp
{
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{  int val =0;
		do {
		System.out.println("Enter 1.to add details 2.for searching "
				+ "3. for display doctor");
		System.out.println("enter the choice");
		int choice= OopsUtility.intValue();
		
		switch(choice)
		{
		case 1:
		{
			CliniqueManagmnt.addDetails();
			break;
		}
		case 2:
		{
			CliniqueManagmnt.searchDetails();
		break;
		}
		case 3:
		{
			CliniqueManagmnt.displayDoctor();
		}break;
		
		}
	}while(val<=30);

}
}
