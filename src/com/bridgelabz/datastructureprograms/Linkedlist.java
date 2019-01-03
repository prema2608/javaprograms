package com.bridgelabz.datastructureprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Linkedlist {
    Node head; // head of list
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        String data;
        Node next;

        // Constructor
        Node(String token)
        {
            data = token;
            next = null;
        }
    }
    public static Linkedlist insert(Linkedlist list, String String)
    {
        // Create a new node with given data
        Node new_node = new Node(String);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public int size(Linkedlist list) {
    	int i=0;
    	Node last = list.head;
        while (last.next != null) {
            last = last.next;
            i++;
        }
        return i;
    }
    public static void printList(Linkedlist list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            if(currNode.data!=null)
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static int delete(Linkedlist list,String key)
    {
        int flag=0;
        Node currNode = list.head;       
        while(currNode != null)
        {
            if(currNode.data!=null)
            {
                if((currNode.data).compareToIgnoreCase(key)==0) {
                    currNode.data=null;   
//                    System.out.println("entered "+key+" found and deleted");
                    flag=1;
                    break;
                }
            }
            currNode = currNode.next;
        }

        return flag;           
    }
//    public static void FileWriter(Linkedlist list,String[] fileContent,String path) throws IOException
//    {
//        //String[] fileContent = DataStructureUtility.toStrinConv(list);
//        FileWriter fileWriter = new FileWriter(path);   
//        for(String s:fileContent)
//        {
//            if(s!=null) {
//                fileWriter.write(s);
//                fileWriter.write(" ");
//            }
//        }
//        fileWriter.close();
//    }
    
    public static int[] toIntConv(Linkedlist list)
    {
        int kz=0;
        Node currNode = list.head;
        int i=0;
        int[] str =new int[100];
        while (currNode != null) {
            if(currNode.data!=null)    {
                kz=Integer.parseInt(currNode.data);
                str[i]=kz;
                i++;
                currNode = currNode.next;
            }
            }
		;
		return str;
     

    }

    
    
    

    public static String[] toStrinConv(Linkedlist list)
    {
        Node currNode = list.head;
        int i=0;
        String[] str =new String[1000];
        while (currNode != null) {
            if(currNode.data!=null)
                str[i]=currNode.data ;
            i++;
            currNode = currNode.next;
        }
        return str;
    }
    static Scanner scanner=new Scanner(System.in);
    public static int readInteger() {
        return scanner.nextInt();
    }   
    public static double readdouble() {
        return scanner.nextDouble();
    }
    public static String readString() {
        return scanner.next();
    
    }

 

//    public static  String[] insertionSort1(Linkedlist list)
//	{
//			boolean insert = false;
//          
//		System.out.println("Sorted order is: ");
//		String[] arr=toStrinConv(list);
////		for (int i = 0; i < list.size(list); i++) 
////		{
//			Arrays.sort(arr);
//			
////			System.out.println();
////		}
////		
////		return arr;
//			for(String s:arr)
//			{
//				System.out.println(s);
//			}
//			return arr;
//			}


public static int[] stringSort(int[] myArray) {
    //int size = myArray.length;

    for(int i = 0; i<myArray.length; i++) {
        for (int j = i+1; j<myArray.length-1; j++) {
            if(myArray[i]!=0 && myArray[j]!=0 ) {
                if(myArray[i]>myArray[j]){
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }
    return myArray;

}


//public static int[] sort(int[] arr )
//{
//	int size=arr.length;
//	for(int i=size;i>0;i--)
//	{
//  		for(int j=1;j<size;j++)
//		{
//    		if(arr[j-1]>arr[j])
//			{
//      			int temp=arr[j-1];
//      			arr[j-1]=arr[j];
//      			arr[j]=temp;
//    		}
//  		}
//  		size--;
//	}
//	return arr;
	}//End of sorting method









//    public static void dispFile( String fname)
//    {