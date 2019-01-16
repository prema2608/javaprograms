package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook {

	static List<PersonDetails> personlist = new ArrayList<PersonDetails>();
static List<AddressDetails> addresslist = new ArrayList<AddressDetails>();
	static PersonDetails person = null;
static	AddressDetails address = null;
	// adding the persons
	public static void addPerson() {
		person = new PersonDetails();

		System.out.println("Enter the person First name to be added into book");
		person.setFname(OopsUtility.stringValue());

		System.out.println("Enter the last name of the person");
		person.setLname(OopsUtility.stringValue());

		System.out.println("Enter the person phone number");
		person.setPhonumbr(OopsUtility.longValue());

		System.out.println("Enter the Address details of the person");
		System.out.println("-----------------------------------------------------");

		address=new AddressDetails();
		System.out.println("Enter the Street");
		address.setStreet(OopsUtility.stringValue());

		System.out.println("Enter the name of the city");
		address.setCity(OopsUtility.stringValue());

		System.out.println("Enter the name of the state");
		address.setState(OopsUtility.stringValue());

		System.out.println("Enter the Zipcode");
		address.setZipcode(OopsUtility.longValue());

		person.setAddressDetails(address);
		personlist.add(person);
	}

	public static List<PersonDetails> getPersonlist() {
		return personlist;
	}

	public static void setPersonlist(List<PersonDetails> personlist) {
		AddressBook.personlist = personlist;
	}

	// editing the persons
	public static void editPerson() {
		address=new AddressDetails();
		person = new PersonDetails();

		System.out.println("Enter the first name of the person whom you want to edit");
		String fname = OopsUtility.stringValue();

		System.out.println("Enter the last name of the person whom you want to edit");
		String lname = OopsUtility.stringValue();
		for (PersonDetails per : personlist) 
		{
		if (fname.equals(per.getFname()) && (lname.equals(per.getLname()))) {
			System.out.println("Enter 1 to edit phone number , 2 to edit the addres of the person");
			System.out.println("Enter your option");
			int option = OopsUtility.intValue();

			switch (option) {
			case 1: {
				System.out.println("Enter the new phone number ");
				per.setPhonumbr(OopsUtility.longValue());
				break;
				
			}
			

			case 2: {
				AddressDetails address =per.getAddressDetails();
				System.out.println("Editing the address");
				System.out.println("Press 1 to edit street   2. city  3.state  4.Zipcode");
				System.out.println("enter your choice");
				int choice = OopsUtility.intValue();
				switch (choice) {
				case 1: {
					System.out.println("Enter the new street name ");
				    address.setStreet(OopsUtility.stringValue());
					break;
				}
				case 2: {

					System.out.println("enter the new city name ");
					address.setCity(OopsUtility.stringValue());
					break;
				}
				case 3: {
					System.out.println("enter the new state name");
					address.setState(OopsUtility.stringValue());
					break;
				}
				case 4: {
					System.out.println("Enter the new Zipcode to be edited");
					address.setZipcode(OopsUtility.longValue());
					break;
				}
				}
				per.setAddressDetails(address);
				}

			}

			}
		}
		}
	

	// displaying the details
	public static void displayDetails() {
//		person = new PersonDetails();
		for(PersonDetails person:personlist)
		{
		System.out.println("-----Person Details:-----");
		System.out.println("First Name=" + person.getFname());
		System.out.println("Last Name=" + person.getLname());
		System.out.println("Phone number=" + person.getPhonumbr());
		System.out.println("Address Details------:");
		System.out.println("Street name:" + person.getAddressDetails().getStreet());
		System.out.println("city name:" + person.getAddressDetails().getCity());
		System.out.println("State name:" + person.getAddressDetails().getState());
		System.out.println("Zipcode:" + person.getAddressDetails().getZipcode());
		}

	}

// deleting the person
	public static void deletePerson() {
		System.out.println("Enter the first name of the person which has to be deleted");
		String fName = OopsUtility.stringValue();
		System.out.println("Enter the last name of the person which has to be deleted");
		String lName = OopsUtility.stringValue();
		int flag = 0;
		if (!personlist.isEmpty()) {
			for (PersonDetails per : personlist) {
				if (fName.equals(per.getFname()) && lName.equals(per.getLname())) {
					personlist.remove(per);
					System.out.println("Person removed from the address book ");
					break;
				}
				flag = 1;
			}
		} else {
			System.out.println("Address book is empty");
		}
		if (flag == 0) {
			System.out.println("Entered first name and last name does not exist in address book");
		}
	}

//Sorting the person

	public static void sortPerson() {
		System.out.println("How you want to sort the person in the book?");
		System.out.println("press 1 to sort by last name and press 2 for sorting by Zipcode ");
		System.out.println("Enter your choice");
		int choice = OopsUtility.intValue();

		switch (choice) {
		case 1: {
			sortByLname();
			break;
		}

		case 2: {
		sortByZipcode();
			break;

		}
		}

	}

	public static void sortByLname() {
		Collections.sort(personlist, (person1, person2) -> person1.getLname().compareTo(person2.getLname()));
		System.out.println("sorted by Last name:");
//		displayDetails();

	}

	public static void sortByZipcode() {
		Collections.sort(personlist,
				(person1, person2) -> person1.getAddressDetails().getZipcode() > person2.getAddressDetails().getZipcode() ? -1
						: person1.getAddressDetails().getZipcode() < person2.getAddressDetails().getZipcode() ? -1
								: person1.getAddressDetails().getZipcode() == person2.getAddressDetails().getZipcode() ? 0 : -10);
		System.out.println("sorted by Zipcode:");
//		displayDetails();
	}

}