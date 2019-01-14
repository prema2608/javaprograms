                                                                                                                                                                                                                                                                                                                                                                                       package com.bridgelabz.util;

public class Linkedlist {
    Node head; 
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
    
    
    public int size(Linkedlist list) 
    {
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
         System.out.println("word found and deleted from list");
                    flag=1;
                    break;
                }
            }
            currNode = currNode.next;
        }

        return flag;           
    }

    
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
//    static Scanner scanner=new Scanner(System.in);
//    public static int readInteger() {
//        return scanner.nextInt();
//    }   
//    public static double readdouble() {
//        return scanner.nextDouble();
//    }
//    public static String readString() {
//        return scanner.next();
//    
//    }

 

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


}






