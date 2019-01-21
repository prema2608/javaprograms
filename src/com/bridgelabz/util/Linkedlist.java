package com.bridgelabz.util;

public class Linkedlist {
	static Node head; 
	static class Node {

		private String data;
		private Node next;

		// Constructor
		Node(String token)
		{
			data = token;
			next = null;
		}


		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
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
			Node last = Linkedlist.head;
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
		while (currNode.next != null || currNode.data == null) {
			if(currNode.data !=null)    {
				kz=Integer.parseInt(currNode.data);
				str[i]=kz;
				i++;
			}
			currNode = currNode.next;

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


	public void getLinkedlist() {
		// TODO Auto-generated method stub
		
		Node tmp = head;
		while (true)
		{
			if(tmp==null)
			{
				break;

			}

			if(tmp.getData()!=null)
			{
				System.out.print(tmp.getData()+"\t\t\t\t");
			}
			tmp=tmp.getNext();
		}
		
		
		
	}






}






