package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.AddressBookManagement;
import com.bridgelabz.util.OopsUtility;

public class MyAddressBookApp
{
	public static void main(String[] args) throws IOException {

		AddressBookManagement addressBookApplication = new AddressBookManagement();
		boolean run = true;
		System.out.println("***********Address Page***********");
		while (run == true) {
			System.out.println("1.Create Book 2.Open Book 3.Save Book 4.Save As Book 5.Close Book 6.exit");
			int choice = OopsUtility.intValue();
			switch (choice) {
			case 1:
				addressBookApplication.createBook();
				run = true;
				break;
			case 2:
				addressBookApplication.openBook();
				run = true;
				break;
			case 3:
				addressBookApplication.saveBook();
				run = true;
				break;
			case 4:
				addressBookApplication.saveAsBook();
				run = true;
				break;
			case 5:
				addressBookApplication.closeBook();
				run = true;
				System.out.println("Book Closed");
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Please select correct choice");
			}
		}

	}
}
	
	
	

