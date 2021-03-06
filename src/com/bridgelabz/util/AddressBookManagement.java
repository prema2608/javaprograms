package com.bridgelabz.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.oopsprograms.MyAddressBookApp;

public class AddressBookManagement

{

	List<AddressBook> bookmangmnt = new ArrayList<AddressBook>();
	AddressBook addrsbook = new AddressBook();

	AddressBook addressBook = null;
	static List<AddressBook> liOfAddressBook = new ArrayList<AddressBook>();
	static ObjectMapper objectMapper = new ObjectMapper();
    File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
	static final String str= "/home/admin1/Documents/Prema/My Programs/javaprograms/";
	static String bookName = null;

	public void createBook() throws IOException {
		System.out.println("Enter name of address book with extension (eg:file.json)");
		String book = OopsUtility.stringValue();
		File file = new File(str + book);
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("File is created");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	public static void setBookName(String book) {
		AddressBookManagement.bookName = book;
	}

	public static String getBookName() {
		return bookName;
	}

	public void openBook() throws IOException {
		addressBook = new AddressBook();
		System.out.println("Files available are:");
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Choose the address book");
		String book = OopsUtility.stringValue();
		setBookName(book);
		int flag = 0;
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (book.equals(filename)) {
				if (file.length() > 0) {
					System.out.println("Add Details");
					String string = OopsUtility.readFile(filename);
					AddressBook.personlist = objectMapper.readValue(string, new TypeReference<List<PersonDetails>>() {
					});
					AddressBook.setPersonlist(AddressBook.personlist);
					insertAddressBook();
				} else {
					System.out.println("Address Book is empty");
					System.out.println("Add new data onto the Address Book");
					insertAddressBook();
				}
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("File doesnot exist or u have not given extention(.json)");
		}
	}

	public void insertAddressBook() throws IOException {
		addressBook = new AddressBook();
		boolean run = true;
		while (run == true) {
			System.out.println(
					"select choice\n1.Add 2.Edit 3.Display 4.Delete 5.Sort 6.Go to Main Page");
			int i = OopsUtility.intValue();
			switch (i) {
			case 1:
				AddressBook.addPerson();
				saveBook();
				run = true;
				break;
			case 2:
				AddressBook.editPerson();
				saveBook();
				run = true;
				break;
			case 3:
				AddressBook.displayDetails();
				run = true;
				break;
			case 4:
				AddressBook.deletePerson();
				saveBook();
				run = true;
				break;
			case 5:
				AddressBook.sortPerson();
				run = true;
				break;
		
			case 6:
				MyAddressBookApp.main(null);
				run = false;
				break;
			default:
				System.out.println("no choice");
				break;
			}
		}
		liOfAddressBook.add(addressBook);
	}

	
	 
	
	public void saveBook() {
		int flag = 0;
		String ch_book = getBookName();
		for (File file : arrayOfFiles) {
			String filename = file.getName();
			if (ch_book.equals(filename)) {
				try {
					String json = objectMapper.writeValueAsString(AddressBook.getPersonlist());
					OopsUtility.writeFile(json, filename);
					System.out.println("Address book details saved");
					flag = 1;
				} catch (Exception e) {
					System.out.println("Cannot write to file");
				}
			}
		}
		if (flag == 0) {
			System.out.println("File doesnot exist or u have not given extention(.json)");
		}
	}

	public void saveAsBook() throws IOException {
		System.out.println("List of files");
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}
		System.out.println("Enter the file name to be saved with extension (eg:file.json)");
		String book = OopsUtility.stringValue();
		File file = new File(str + book);
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("File is created");
			String json = objectMapper.writeValueAsString(AddressBook.getPersonlist());
			OopsUtility.writeFile(json, book);
			System.out.println("Address book details saved");
		} else {
			System.out.println("File of that name already exists");
		}
	}

	public void closeBook() {
		addressBook = null;
	}
}