package com.bridgelabz.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.oopsprograms.MyStockManagerApp;
import com.bridgelabz.util.Stack;

public class StockAccount {
	// member declaration
	static String chooseAccount;
	static List<StockDetails> Stocklist = new ArrayList<StockDetails>();
	static String path = "/home/admin1/Documents/Prema/My Programs/javaprograms/";
	static Linkedlist list = new Linkedlist();
	static QueueLinkedList<String> queue = new QueueLinkedList<String>();
	static Stack<String> stack = new Stack<String>();
	static Stack<String> tempStack = new Stack<String>();

	// contains switch cases for get stock details
	/**
	 * @throws IOException
	 */
	public static void stockEntry() throws IOException {
		int op = 4;
		while (op != 0) {
			System.out.println("Enter the choice");
			System.out.println("1.Buy Stock\n2.Sell Stock\n3.Save Stock\n4.Print Report\n5.Go Back");
			int ch = OopsUtility.intValue();
			switch (ch) {
			case 1:
				buyStock();

				break;
			case 2:
				sellStock();

				break;
			case 3:
				saveStock();

				break;
			case 4:
				printReport();

				break;
			case 5:
				MyStockManagerApp.main(null);

			}
		}
	}

	// buy stock
	/**
	 * @throws IOException
	 */
	public static void buyStock() throws IOException {
		System.out.println("Stocks available are");
		StockPortfolio.displayStock();
		System.out.println("Enter the stock name you want to buy");
		String sName = OopsUtility.stringValue();
		System.out.println("Enter how many shares you want ");
		int nOshare = OopsUtility.intValue();
		String s1 = OopsUtility.readFile(path + chooseAccount);// Current file details in s1
		String s2 = OopsUtility.readFile(StockPortfolio.stockFile);// StockFile in s2
		StockPortfolio.Stocklist = OopsUtility.userReadValue(s2, StockDetails.class);
		try {
			Stocklist = OopsUtility.userReadValue(s1, StockDetails.class);
			StockDetails stt = newEntry(sName, nOshare);
			Stocklist.add(stt);
		} catch (Exception e) {

		}
		String json = OopsUtility.userWriteValueAsString(StockPortfolio.Stocklist);
		OopsUtility.writeFile(json, StockPortfolio.stockFile);
	}

	// buy stock continued
	/**
	 * @param sName    is the name of the stock
	 * @param nOfShare is the number of the stock
	 * @return
	 */
	public static StockDetails newEntry(String sName, int nOfShare) {
		for (StockDetails stock : StockPortfolio.Stocklist) {
			if (sName.equals(stock.getStockName())) {
				int newNoOfShare = stock.getNoOfShares() - nOfShare;
				stock.setNoOfShares(newNoOfShare);
				StockDetails stockCustomer = new StockDetails();
				stockCustomer.setStockName(sName);
				stockCustomer.setNoOfShares(nOfShare);
				stockCustomer.setSharePrice(stock.getSharePrice());
				Transactions transaction = new Transactions();
				String date1 = StockPortfolio.getDate();
				transaction.setDate(date1);
				transaction.setTransactionStatus("Purchase");
				StockDetails.setTransactions(transaction);
				return stockCustomer;
			}

		}
		return null;
	}

	// buy stock continued
	/**
	 * @throws IOException
	 */
	public static void displayAccount() throws IOException {
		String string = OopsUtility.readFile(path + chooseAccount);
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			String fileName = file.getName();
			if (chooseAccount.equals(fileName))
				try {
					Stocklist = OopsUtility.userReadValue(string, StockDetails.class);
					System.out.println("Account details are:");
					for (StockDetails stockCustomer : Stocklist) {
						System.out.println("Stock name is " + stockCustomer.getStockName());
						System.out.println("Number of share " + stockCustomer.getNoOfShares());
						System.out.println("Share price is " + stockCustomer.getSharePrice());
						System.out.println("Transaction date is " + StockDetails.getTransactions().getDate());
						System.out.println(
								"Transaction status is " + StockDetails.getTransactions().getTransactionStatus());
						System.out.println("-------------------------------------------------");
					}

				} catch (Exception e) {
					System.out.println("Empty file");
				}
		}
	}

	// sell stock

	/**
	 * @throws IOException
	 */
	public static void sellStock() throws IOException {
		displayAccount();
		System.out.println("Enter the name of stock to sell");
		String stockName = OopsUtility.stringValue();
		System.out.println("how many shares you want to sell");
		int numOfShares = OopsUtility.intValue();
		String string = OopsUtility.readFile(path + chooseAccount);
		try {
			Stocklist = OopsUtility.userReadValue(string, StockDetails.class);
			StockDetails newS = soldData(stockName, numOfShares);
			Stocklist.add(newS);
			updateStock(stockName, numOfShares);
		} catch (Exception e) {
			System.out.println("kindly buy before selling");
		}

	}

	// sell stock continued
	/**
	 * @param stockName   is name of stock
	 * @param numOfShares is the number of the stock
	 * @throws IOException
	 */
	private static void updateStock(String stockName, int numOfShares) throws IOException {
		String string = OopsUtility.readFile(StockPortfolio.stockFile);
		try {
			StockPortfolio.Stocklist = OopsUtility.userReadValue(string, StockDetails.class);
			for (StockDetails st : StockPortfolio.Stocklist) {
				if (stockName.equals(st.getStockName())) {
					int newDetail = st.getNoOfShares() + numOfShares;
					st.setNoOfShares(newDetail);
				}
			}
		} catch (Exception e) {
			System.out.println("Unable to update the details");
		}

	}

	// sell stock continued
	/**
	 * @param stockName   is name of stock
	 * @param numOfShares is the number of the stock
	 * @returns new stock details
	 */
	private static StockDetails soldData(String stockName, int numOfShares) {
		for (StockDetails stock : Stocklist) {
			if (stockName.equals(stock.getStockName())) {
				StockDetails newStock = new StockDetails();
				newStock.setStockName(stockName);
				newStock.setNoOfShares(numOfShares);
				newStock.setSharePrice(stock.getSharePrice());
				Transactions transaction = new Transactions();
				String date1 = StockPortfolio.getDate();
				transaction.setDate(date1);
				transaction.setTransactionStatus("Sold");
				StockDetails.setTransactions(transaction);

				return newStock;
			}
		}

		return null;
	}

	// saving a stock
	public static void saveStock() {
		System.out.println("Saving the account");
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			String fileName = file.getName();
			if (chooseAccount.equals(fileName))
				try {
					String json = OopsUtility.userWriteValueAsString(Stocklist);
					OopsUtility.writeFile(json, fileName);
					System.out.println("details saved");

				} catch (Exception e) {
					System.out.println("Unable to write into the file");
				}
		}

	}

	// Printing stock
	/**
	 * @throws IOException
	 */
	public static void addPrint() throws IOException {
		String string = OopsUtility.readFile(path + chooseAccount);
		Stocklist = OopsUtility.userReadValue(string, StockDetails.class);
		for (StockDetails stock : Stocklist)
			try {
				list.insert(list,stock.getStockName());
				queue.enqueue(StockDetails.getTransactions().getDate());
				stack.push(StockDetails.getTransactions().getTransactionStatus());
			} catch (Exception e) {
				System.out.println("No operations performed");
			}
	}

	// printing stock continued
	/**
	 * @throws IOException
	 */
	public static void printReport() throws IOException {
		addPrint();
		System.out.println("Stock sold and purchased details are:");

		list.getLinkedlist();

		System.out.println();
//		for (int i = 0; i < queue.size; i++) {
		while(!queue.isQueueEmpty())
		{
			System.out.print(queue.remove() + "\t\t");
		}
//		}
		System.out.println();
		while (!stack.isEmpty()) {
			tempStack.push(stack.pop());
		}

		while (!tempStack.isEmpty()) {
			System.out.print(tempStack.pop() + "\t\t\t");
		}
		System.out.println();
		System.out
		.println("-------------------------------------------------------------------------------------------");
	}

	// creating a new customer
	/**
	 * @throws IOException
	 */

	public static void createcustom() throws IOException {
		System.out.println("Enter name of customer with extension (eg:file.json)");
		String book = OopsUtility.stringValue();
		File file = new File(path + book);
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("File is created");
		} else {
			System.out.println("File of that name already exists");
		}
	}
	public static void createCustomer() throws IOException {

		System.out.println("Enter the name of Customer.");
		String sCus = OopsUtility.stringValue();

		File file = new File(path + sCus + ".json");

		boolean done = file.createNewFile();// to create new files
		if (done) {
			System.out.println("Account created");
		} else
			System.out.println("Account already exists");
	}

	// opening a customer's account
	/**
	 * @throws IOException
	 */
	public static void openAccount() throws IOException {

		System.out.println("Enter your choice");
		File[] arrayOfFiles = new File(System.getProperty("user.dir")).listFiles();
		for (File file : arrayOfFiles) {
			if (file.getName().endsWith(".json"))
				System.out.println(file.getName());
		}

		chooseAccount = OopsUtility.stringValue();
		for (File file : arrayOfFiles) {
			String fileName = file.getName();
			if (chooseAccount.equals(fileName)) {
				if (file.length() > 0) {
					System.out.println("File is not Empty ");
					String string = OopsUtility.readFile(fileName);
					Stocklist = OopsUtility.userReadValue(string, StockDetails.class);
					stockEntry();

				} // end of if
				else {
					System.out.println("File is empty");
					System.out.println("Add new data onto the stock");
					stockEntry();

				}
			} // end of if

		} // end of for

	}// end of method

}
