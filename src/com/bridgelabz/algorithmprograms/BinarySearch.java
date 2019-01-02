package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.bridgelabz.util.AlgorithmUtility;
public class BinarySearch {
	/*
	* The main function is written to take input from the user and
	* calls binarySeacrhFile function to search word from list
	*/
	public static void main(String[] args) throws FileNotFoundException {
		String csvFile = "/home/admin1/Desktop/dogs.txt";
		BufferedReader fileReader = new BufferedReader(new FileReader(csvFile));
		final String DELIMITER = " ";
		try {
			String line = "";
			while ((line = fileReader.readLine()) != null) {
				String[] tokens = line.split(DELIMITER);
				AlgorithmUtility.sort(tokens);
				for (String token : tokens) {
					// Print all tokens
					System.out.println(token);
				}
				System.out.println("enter the key word which has to be searched ");
				String key = AlgorithmUtility.stringValue();
				int i = AlgorithmUtility.binarySearch(tokens, key);
				if (i >= 0) {
					System.out.println(tokens[i] + " is present in " + (i + 1) + " position in the array");
				} else
					System.out.println(key + " doesnot exists in the given txt file");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}


