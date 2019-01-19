package com.bridgelabz.oopsprograms;

import java.io.IOException;

import com.bridgelabz.util.AddressBookManagement;
import com.bridgelabz.util.OopsUtility;

public class MyAddressBookApp
{
	public static void main(String[] args) throws IOException {

		AddressBookManagement addressBookApplication = null;
		do
		{
			System.out.println("1.Create Book 2.Open Book 3.Save Book 4.Save As Book 5.Close Book 6.exit");
			int choice = OopsUtility.intValue();
			switch (choice) {
			case 1:
			{
				addressBookApplication=new AddressBookManagement();
				addressBookApplication.createBook();
			}
			break;
			case 2:
			{
				addressBookApplication=new AddressBookManagement();
				addressBookApplication.openBook();
				break;
			}
			case 3:
			{
				addressBookApplication=new AddressBookManagement();
				addressBookApplication.saveBook();
				break;
			}
			case 4:
			{
				addressBookApplication=new AddressBookManagement();
				addressBookApplication.saveAsBook();
				break;
			}
			case 5:
			{
				addressBookApplication=new AddressBookManagement();
				addressBookApplication.closeBook();
				System.out.println("Book Closed");
				break;
			}
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Please select correct choice");
			}
		}while (addressBookApplication!=null);
	}
}





