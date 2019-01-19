package com.bridgelabz.oopsprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.CliniqueManagmnt;
import com.bridgelabz.util.OopsUtility;

public class MyClinicManagmntApp
{
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException
	{  
	CliniqueManagmnt clinicalmngnt = null;
	
		do {
		System.out.println("Enter 1.To add Details  2. To search Details  3. To Take Appointments  4. To Display Famous Doctor"
				+ "  5.To Display Famous Specialist  6.To EXIT");
		System.out.println("enter the choice");
		int choice= OopsUtility.intValue();
		
		switch(choice)
		{
		case 1:
		{
			clinicalmngnt=new CliniqueManagmnt();
			CliniqueManagmnt.addDetails();
			break;
		}
		case 2:
		{
			clinicalmngnt=new CliniqueManagmnt();
         	CliniqueManagmnt.searchDetails();
		break;
		}
		case 3:
		{
			clinicalmngnt=new CliniqueManagmnt();
			CliniqueManagmnt.takeAppointment();
		break;
		}
		
		case 4:
		{
			clinicalmngnt=new CliniqueManagmnt();
			CliniqueManagmnt.famousDoctor();
			break;
		}
		
		case 5:
		{
			clinicalmngnt=new CliniqueManagmnt();
			CliniqueManagmnt.famousSpecialist();
			break;
		}
		case 6:
		{
			System.exit(0);
			System.out.println("Thank you");
		}
		default:break;
		}
	}while(clinicalmngnt!=null);

}
}
