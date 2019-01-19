package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

public class OopsUtility 
{
	static Scanner sc = new Scanner(System.in);

	// scanner class for integer
	public static int intValue() {
		try {

			return sc.nextInt();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return 0;
	}

	// scanner class for double
	public static double doubValue() {
		try {

			return sc.nextDouble();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return 0.0;
	}

	// scanner class for boolean
	public static boolean boolValue() {
		try {

			return sc.nextBoolean();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;
	}

	// scanner class for float
	public static float floatValue() {
		try {

			return sc.nextFloat();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return 0;

	}
	
	public static long longValue() {
		try {

			return sc.nextLong();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return 0;
		
	}

	// scanner class for string
	public static String stringValue() {
		try {

			return sc.next();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}


	
	
	
	//regex pattern
	
	public static String patternMatch(String fname , String fullname, String numb, String date,String line )
	{
	   String regex1 = "<{2}+\\w+>{2}";
	   String regex2= "<{2}+\\w+ +\\w+>{2}";
	   String regex3 = "x{10}";
	   String regex4 = "<{2}\\d{2}+/+\\d{2}+/\\d{4}+>{2}";
	 
	
         Pattern p = Pattern.compile(regex1);
          Matcher m = p.matcher(line); 
           line = m.replaceAll(fname);
         
        
           Pattern p1= Pattern.compile(regex2);
           Matcher m1 = p1.matcher(line); 
           line = m1.replaceAll(fullname);
        
        
            Pattern p2 = Pattern.compile(regex3);
            Matcher m2= p2.matcher(line); 
             line = m2.replaceAll(numb);
        
 
             Pattern p3 = Pattern.compile(regex4);
             Matcher m3 = p3.matcher(line); 
              line = m3.replaceAll(date);
              
	           return line;
    }	
	
	
	
//json Inventories
	
	
	public static String readFile(String str) throws FileNotFoundException {
        FileReader f = new FileReader(str);
       
        @SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(f);
        String line = "";
        try {
            String word="";
            while ((word = read.readLine()) != null) {
                line = word;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return line; 
    }
////////////////////
public static void display(List<InventoryList> list2)
    {
        for (int i = 0; i < list2.size(); i++) {
            InventoryList it = list2.get(i);
            System.out.println("Inventory name :" + it.getInventoryName());
            for (int j = 0; j < it.getInventorylist().size(); j++) {
                System.out.println("name :" + it.getInventorylist().get(j).getName());
                System.out.println("price :" + it.getInventorylist().get(j).getPrice());
                System.out.println("weight :" + it.getInventorylist().get(j).getWeight());
                System.out.println();
            }
            System.out.println("---------------------------------------------");
        }
    }
///////////////////
    public static InventoryList insertInventoryList(String inventoryName,List<Inventory> listOfInventories)
    {
        InventoryList inventoryList = new InventoryList();
        inventoryList.setInventoryName(inventoryName);
        inventoryList.setInventorylist(listOfInventories);
        return inventoryList;
    }

	
///////////////////////////////////////
   
   public static void price(List<InventoryList> list2)
    {

        for (int i = 0; i < list2.size(); i++) {
            InventoryList it = list2.get(i);
            System.out.println("Inventory name :" + it.getInventoryName());
            for (int j = 0; j < it.getInventorylist().size(); j++) {
                System.out.println("name :" + it.getInventorylist().get(j).getName());
                double sum=it.getInventorylist().get(j).getPrice()*it.getInventorylist().get(j).getWeight();
                System.out.println("total price to be given is :"+sum);
            }
            System.out.println("---------------------------------------------");
        }
    }

///////////////////

public static void write(String json) throws IOException
    {
        FileWriter fw = new FileWriter("/home/admin1/Desktop/Inventory.json");
        @SuppressWarnings("resource")
		BufferedWriter bw = new BufferedWriter(fw);
        bw.write(json);
        bw.flush();
    }



public static void writeFile(String json, String fileName) throws IOException {
	FileWriter fw = new FileWriter(fileName);
	@SuppressWarnings("resource")
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(json);
	bw.flush();
}


public static Inventory getInventoryValues() {
	Inventory inventory = new Inventory();
    System.out.println("Enter name of inventory");
    inventory.setName(OopsUtility.stringValue());
    System.out.println("Enter weight of inventory in kilograms");
    inventory.setWeight(OopsUtility.doubValue());
    System.out.println("Enter price of inventory in rupees");
    inventory.setPrice(OopsUtility.doubValue());
    return inventory;
	
}


public static QueueLinkedList<QueueLinkedList<String>> cardQueue(String[] deck )
{
	QueueLinkedList<QueueLinkedList<String>> mainQueue = new QueueLinkedList<QueueLinkedList<String>>();
	QueueLinkedList<String> queueLinkedList = new QueueLinkedList<String>();
	System.out.println("Total no. of deck of cards are " + deck.length);
	for (int i = 0; i < 4; i++) {
		String[] demo = new String[9];
		for (int j = 0; j < 9; j++) {
			demo[j] = deck[i + j * 4];
		}
		String[] str2 = AlgorithmUtility.sort(demo);
		for (int k = 0; k < str2.length; k++) {
			queueLinkedList.enqueue(str2[k]);
		}
		mainQueue.enqueue(queueLinkedList);
		queueLinkedList = new QueueLinkedList<String>();
		continue;
	}
	return mainQueue;
}
public static void cardDisplay(QueueLinkedList<QueueLinkedList<String>> mainQueue)
{
	for (int i = 0; i < mainQueue.getSize(); i++) {
		QueueLinkedList<String> queue2 = mainQueue.remove();
		System.out.println("---------------------------------------- Person " + (i + 1)
				+ " -------------------------------------------");
		for (int j = 0; j < queue2.getSize(); j++) {
			System.out.print(queue2.remove() + " ,");
		}
		System.out.println();
	}
}



//used in clinical managment
static ObjectMapper objectMapper = new ObjectMapper();
public static <T> List<T> userReadValue(String str, Class<?> cls)
      throws JsonParseException, JsonMappingException, IOException {
  CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, cls);
  return objectMapper.readValue(str, colletion);
}

public static <T> String userWriteValueAsString(List<T> list)
      throws JsonGenerationException, JsonMappingException, IOException {
  return objectMapper.writeValueAsString(list);
}
	
}


