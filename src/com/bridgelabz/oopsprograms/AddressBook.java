package com.bridgelabz.oopsprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class AddressBook 
{

	List<PersonDetails> personlist = new ArrayList<PersonDetails>();
 List<AddressDetails> addresslist = new ArrayList<AddressDetails>();
	static PersonDetails person = new PersonDetails();
	static AddressDetails address = new AddressDetails();

	
	//adding the persons
	public static void addPerson()
	{

		System.out.println("Enter the person First name to be added into book");
		person.setFname(OopsUtility.stringValue());

		System.out.println("Enter the last name of the person");
		person.setLname(OopsUtility.stringValue());

		System.out.println("Enter the person phone number");
		person.setPhonumbr(OopsUtility.longValue());

		System.out.println("Enter the Address details of the person");
		System.out.println("-----------------------------------------------------");


		System.out.println("Enter the Street");
		address.setStreet(OopsUtility.stringValue());

		System.out.println("Enter the name of the city");
		address.setCity(OopsUtility.stringValue());

		System.out.println("Enter the name of the state");
		address.setState(OopsUtility.stringValue());

		System.out.println("Enter the Zipcode");
		address.setZipcode(OopsUtility.longValue());

	}

	
	
	//editing the persons
	public static void editPerson()
	{
		System.out.println("Enter the first name of the person whom you want to edit");
		String fname=OopsUtility.stringValue();

		System.out.println("Enter the last name of the person whom you want to edit");
		String lname = OopsUtility.stringValue();

		if(fname.equals(person.getFname()) && (lname.equals(person.getLname())))
		{       	 
			System.out.println("Enter 1 to edit phone number , 2 to edit the addres of the person");
			System.out.println("Enter your option");
			int option = OopsUtility.intValue();

			switch(option)
			{
			case 1:
			{
				System.out.println("Enter the new phone number ");
				person.setPhonumbr(OopsUtility.longValue());
				break;
			}
			
         	case 2:
			{
				System.out.println("Editing the address");
				System.out.println("Press 1 to edit street   2. city  3.state  4.Zipcode");
				System.out.println("enter your choice"); 
				int choice = OopsUtility.intValue();
				switch(choice)
				{
				case 1:
				{
					System.out.println("Enter the street name to be edited");
					address.setStreet(OopsUtility.stringValue());
					break;
				}
				case 2:
				{

					System.out.println("enter the city name to be edited");
					address.setCity(OopsUtility.stringValue());
					break;
				}
				case 3:
				{
					System.out.println("enter the state name to be edited");
					address.setState(OopsUtility.stringValue());
					break;
				}
				case 4:
				{
					System.out.println("Enter the Zipcode to be edited");
					address.setZipcode(OopsUtility.longValue());
					break;
				}
				}

			}	 


			}
		}
	}
	
	
	//displaying the details
	 public void displayDetails()
	 {
		 System.out.println("-----Person Details:-----");
		 System.out.println("First Name="+person.getFname());
		 System.out.println("Last Name="+person.getLname());
		 System.out.println("Phone number="+person.getPhonumbr());
		 System.out.println("Address Details:");
		 System.out.println("Street name:"+address.getStreet());
		 System.out.println("city name:"+address.getCity());
		 System.out.println("State name:"+address.getState());
		 System.out.println("Zipcode:"+address.getZipcode());

	 } 
      
// deleting the person

public void deletePerson()
{
	System.out.println("Enter the person's First name for deleting:");
	String fname=OopsUtility.stringValue();
	
	System.out.println("enter the last name:");
	String lname = OopsUtility.stringValue();
	
	if(fname.equals(person.getFname())&& lname.equals(person.getLname()))
	{
		personlist.remove(person);
		
		System.out.println("Person removed Successfully");
		
    }
		 
		 
 }



//Sorting the person

public void sortPerson()
{
	System.out.println("How you want to sort the person in the book?");
	System.out.println("press 1 to sort by last name and press 2 for sorting by Zipcode ");
	System.out.println("Enter your choice");
	int choice = OopsUtility.intValue();
	
	
	switch(choice)
	{
	case 1:
	{
		Collections.sort(personlist,(person1,person2)->person1.getLname().compareTo(person2.getLname()));	
		displayDetails();
		break;
	}
	
	case 2:
	{
		Collections.sort(addresslist, (person1,person2)->person1.getZipcode()>person2.getZipcode()? 0
				:person1.getZipcode()<person2.getZipcode()? -1:
						person1.getZipcode()==person2.getZipcode()?0 :-10);
	}
}
	
	
	
	
	
}





}