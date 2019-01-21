package com.bridgelabz.util;

public class StockDetails
{
	private String stockName;
	private int noOfShares;
	private float sharePrice;
	private static Transactions transactions;
	
	public static Transactions getTransactions() {
		return transactions;
	}
	public static void setTransactions(Transactions transactions) {
		StockDetails.transactions = transactions;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public float getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(float sharePrice) {
		this.sharePrice = sharePrice;
	}
	

}
