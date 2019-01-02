package com.bridgelabz.util;


public class linkedList<string>
{		
	
		private static int counter;
		private Node head;
	 
		// Default constructor
		public linkedList() {
	 
		}
	 
		// appends the specified element to the end of this list.
		public void insert(string data) {
	 
			// Initialize Node only incase of 1st element
			if (head == null) 
			{
				head = new Node(data);
			}
	 
			Node Temp = new Node(data);
			Node Current = head;
	 
			// Let's check for NPE before iterate over Current
			if (Current != null) {
	 
				// starting at the head node, crawl to the end of the list and then add element after last node
				while (Current.getNext() != null) {
				        Current = Current.getNext();
				}
	 
				// the last node's "next" reference set to our new node
			     Current.setNext(Temp);
			}
	 
			// increment the number of elements variable
			incrementCounter();
		}
	 
		private static int getCounter() {
			return counter;
		}
	 
		private static void incrementCounter() {
			counter++;
		}
	 
		private void decrementCounter() {
			counter--;
		}
	 
		// inserts the specified element at the specified position in this list
		public void add(Object data, int index) {
			Node Temp = new Node(data);
			Node Current = head;
	 
			// Let's check for NPE before iterate over Current
			if (Current != null) {
				// crawl to the requested index or the last element in the list, whichever comes first
				for (int i = 0; i < index && Current.getNext() != null; i++) {
					Current = Current.getNext();
				}
			}
	 
			// set the new node's next-node reference to this node's next-node reference
			Temp.setNext(Current.getNext());
	 
			// now set this node's next-node reference to the new node
			Current.setNext(Temp);
	 
			// increment the number of elements variable
			incrementCounter();
		}
	 
		public Object get(int index)
		// returns the element at the specified position in this list.
		{
			// index must be 1 or higher
			if (index < 0)
				return null;
			Node Current = null;
			if (head != null) {
				Current = head.getNext();
				for (int i = 0; i < index; i++) {
					if (Current.getNext() == null)
						return null;
	 
					Current = Current.getNext();
				}
				return Current.getData();
			}
			return Current;
	 
		}
	 
		// removes the element at the specified position in this list.
		public boolean remove(int index) {
	 
			// if the index is out of range, exit
			if (index < 1 || index > size())
				return false;
	 
			Node Current = head;
			if (head != null) {
				for (int i = 0; i < index; i++) {
					if (Current.getNext() == null)
						return false;
	 
					Current = Current.getNext();
				}
				Current.setNext(Current.getNext().getNext());
	 
				// decrement the number of elements variable
				decrementCounter();
				return true;
	 
			}
			return false;
		}
	 
		// returns the number of elements in this list.
		public int size() {
			return getCounter();
		}
	 
		public String toString() {
			String output = "";
	 
			if (head != null) {
				Node Current = head.getNext();
				while (Current != null) {
					output += "[" + Current.getData().toString() + "]";
					Current = Current.getNext();
				}
	 
			}
			return output;
		}
	 
		private class Node {
			// reference to the next node in the chain, or null if there isn't one.
			Node next;
	 
			// data carried by this node. could be of any type you need.
			Object data;
	 
			// Node constructor
			public Node(Object dataValue) {
				next = null;
				data = dataValue;
			}
	 
			// another Node constructor if we want to specify the node to point to.
			@SuppressWarnings("unused")
			public Node(Object dataValue, Node nextValue) {
				next = nextValue;
				data = dataValue;
			}
	 
			// these methods should be self-explanatory
			public Object getData() {
				return data;
			}
	 
			@SuppressWarnings("unused")
			public void setData(Object dataValue) {
				data = dataValue;
			}
	 
			public Node getNext() {
				return next;
			}
	 
			public void setNext(Node nextValue) {
				next = nextValue;
			}
	 
		}
	}