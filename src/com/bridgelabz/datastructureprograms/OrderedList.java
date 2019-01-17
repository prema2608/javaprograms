/*
 *Created by: prema.s
 *Date: 22/12/2018.
 *Purpose:  Read .a List of Numbers from a file and arrange it ascending Order in a Linked List.
 * Take user input for a number, if found then pop the number out of the list else insert the 
 * number in appropriate position*/

package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Linkedlist;

public class OrderedList {
	static Linkedlist list = new Linkedlist();
	static String fName = "/home/admin1/Desktop/abc.txt";


	public static void main(String args[]) throws IOException {
		FileReader file = new FileReader("/home/admin1/Desktop/number.txt");
		BufferedReader read = new BufferedReader(file);
		final String DELIMITER = " ";
		String[] tokens = null;
		String str[] = null;
		

		try {

			String word;
			while ((word = read.readLine()) != null) {
				tokens = word.split(DELIMITER);
				for (String token : tokens) {
					Linkedlist.insert(list, token);
					
				}

			}
			System.out.println("Items in the list");
			Linkedlist.printList(list);
			int n = 0;

			do {
				System.out.println(
						"Press 1 to search word  \t Press 2 for Display the sorted items in the file \tpress 3 to exit");
				System.out.println("enter your choice");
				int choice = DataStructureUtility.intValue();

				switch (choice) {
				case 1:

					System.out.println("Enter the value");
					String str1 = DataStructureUtility.stringValue();
					int flag = 0;
					for (int i = 0; i < list.size(list); i++) {
						if (str1.equals(tokens[i])) {
							Linkedlist.delete(list, str1);
							flag = 1;
						}
					}
					// Linkedlist.printList(list);
					if (flag == 0) {
						Linkedlist.insert(list, str1);
						System.out.println("value is not found so added to list");
						Linkedlist.printList(list);

					}
					str = Linkedlist.toStrinConv(list);
					DataStructureUtility.writeFile(fName, str);
//					 dispSorted(list);
					break;
				case 2:
				{
					
					dispSorted(list);
					break;
				}
					
					
					
				case 3: {
					System.exit(0);
					System.out.println("Exited");
				}

					break;

				default:
					System.out.println();
					break;
				}
			} while (n <= 30);
		}

		catch (IOException io) {
			io.printStackTrace();
		}

	}

	public static void dispSorted(Linkedlist list) {
		{
			// Linkedlist.printList(list);

			int[] arr = Linkedlist.toIntConv(list);
			int[] arr1 = Linkedlist.stringSort(arr);
			System.out.println("Sorted items in the File:");
			for (int i = 0; i < arr1.length; i++)
				if (arr1[i] != 0)
					System.out.println(arr1[i]);
		}
	}
}

