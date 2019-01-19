package com.bridgelabz.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockPortfolio
{


    static List<StockDetails> Stocklist=new ArrayList<StockDetails>();
    static String stockFile="/home/admin1/Desktop/stocksfiles.json";
   
   
    //adding a stock
    /**
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    public static void addStock() throws JsonGenerationException, JsonMappingException, IOException
    {
        String string=OopsUtility.readFile(stockFile);
        try {
        	Stocklist = OopsUtility.userReadValue(string, StockDetails.class);
            System.out.println("File is not empty!");
        } catch (Exception e) {
            System.out.println("File is empty!");
        }
        StockDetails stock=new StockDetails();
        System.out.println("Enter the name of stock");
        stock.setStockName(OopsUtility.stringValue());
        System.out.println("Enter the number of share");
        stock.setNoOfShares(OopsUtility.intValue());
        System.out.println("Enter the price per share");
        stock.setSharePrice(OopsUtility.floatValue());
        Stocklist.add(stock);
        System.out.println("Stock created");
        String json=OopsUtility.userWriteValueAsString(Stocklist);
        OopsUtility.writeFile(json,stockFile);
           
    }
   
   
    //per share stock's price calculation
    /**
     * @throws FileNotFoundException
     */
    public static void eachStockValue() throws FileNotFoundException
    {
        String string=OopsUtility.readFile(stockFile);
        try {
        	Stocklist = OopsUtility.userReadValue(string, StockDetails.class);
            System.out.println("File is not empty!");
        } catch (Exception e) {
            System.out.println("File is empty!");
        }   
        for(StockDetails stock:Stocklist)
        {
            float dir=stock.getSharePrice()*stock.getNoOfShares();
            System.out.println("Stock is " +stock.getStockName() + " and price of each share of it is " +dir);
           
        }
           
    }
   
   
   
    //total stock share calculation
    /**
     * @throws FileNotFoundException
     */
    public static void totalStockValue() throws FileNotFoundException
    {
        float sum=0;
        String string=OopsUtility.readFile(stockFile);
        try {
        	Stocklist=OopsUtility.userReadValue(string, StockDetails.class);
            System.out.println("File is not empty!");
        }catch(Exception e) {
            System.out.println("File is empty");
        }
        for(StockDetails stock:Stocklist)
        {
            float dir=stock.getSharePrice()*stock.getNoOfShares();
            sum+=dir;
            System.out.println("Total stock of "+stock.getStockName()+" is " +sum);
           
        }
    }
   
   
   
    //displaying stock
    /**
     * @throws IOException
     */
    public static void displayStock() throws IOException
    {
        String s2=OopsUtility.readFile(StockPortfolio.stockFile);
        try {
            StockPortfolio.Stocklist=OopsUtility.userReadValue(s2, StockDetails.class);
        }
        catch(Exception e)
        {
            System.out.println("unable to read");
        }
        for (StockDetails st : Stocklist)
        {
            System.out.println("Stock name : " +st.getStockName());
            System.out.println("Stock's number of share : " + st.getNoOfShares());
            System.out.println("Stock per share price : " + st.getSharePrice());
            System.out.println("------------------------------------------------------");
    }
   
    }


	
	
}
