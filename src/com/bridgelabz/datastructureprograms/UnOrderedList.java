
/*
 *Created by: prema.s
 *Date: 22/12/2018.
 *Purpose: Read the Text from a file, split it into words and arrange it as Linked List. Take a user input to search a Word in the List.
 * If the Word is not found then add it to the list, 
 *and if it found then remove the word from the List. 
 *In the end save the list into a file..*/
package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Linkedlist;

import java.io.*;

public class UnOrderedList {
	public static void main(String args[]) throws IOException {
		FileReader file = new FileReader("/home/admin1/Desktop/dogs.txt");
		BufferedReader read = new BufferedReader(file);
		final String DELIMITER = " ";
		Linkedlist list = new Linkedlist();

		try {

			String word;
			while ((word = read.readLine()) != null) {
				String[] tokens = word.split(DELIMITER);
				for (String token : tokens) {
					Linkedlist.insert(list, token);
				}
				Linkedlist.printList(list);
				int n = 0;

				do {
					System.out.println(
							"Press 1 to Search Word  \t Press 2 for Display the contents in the file\tpress 3 to exit");
					System.out.println("enter your choice");
					int choice = DataStructureUtility.intValue();

					switch (choice) {

					case 1: {
						System.out.println("Enter the word to be searched");
						String str = DataStructureUtility.stringValue();
						int flag1 = Linkedlist.delete(list, str);
						//System.out.println("word is found so deleted from list");

						if (flag1 == 0) 
						{
							System.out.println("word not found so added to list");
							Linkedlist.insert(list, str);

						}

					}
					break;

					case 2: 
						Linkedlist.printList(list);
						break;
					case 3:

						System.exit(0);
						System.out.println("Exited");
						break;

					default:
						System.out.println("please select correct choice");
						break;
					}
					n++;
				} while (n <= 30);

			}
		}

		catch (IOException io) {
			io.printStackTrace();

		}

		String fName = "/home/admin1/Desktop/xyz.txt";
		String str[] = Linkedlist.toStrinConv(list);
		DataStructureUtility.writeFile(fName, str);

	}
}
