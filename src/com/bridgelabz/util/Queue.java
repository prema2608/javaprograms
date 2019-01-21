 package com.bridgelabz.util;

import java.util.NoSuchElementException;

class Node<T>
{
	protected T data;
    @SuppressWarnings("rawtypes")
	protected Node link;
 
    
    public Node()
    {
        link = null; 
    }  
    
   
    @SuppressWarnings("rawtypes")
	public Node(T d,Node n)
    {
        data = d;
        link = n;
    }  
    
    /*  Function to set data to current Node  */
   	public void setData(T d)
    {
        data = d;
    }   
    
   	/*  Function to get link to next node  */
   	@SuppressWarnings("rawtypes")
	public Node getLink()
    {
     	return link;
    }  
    
	/*  Function to set link to next Node  */
    public void setLink(@SuppressWarnings("rawtypes") Node n)
    {
        link = n;
    }  

    /*  Function to get data from current Node  */
    public T getData()
    {
		return data;
       
    }
}
 
/*  Class linkedQueue  */
public class Queue
{
	@SuppressWarnings("rawtypes")
	public Node front, rear;
    public int size;
 
    /* Constructor */
    public Queue()
    {
        front = null;
        rear = null;
        size = 0;
    }    
    
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == null;
    }   
    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return size;
    }    
    
    /*  Function to insert an element to the queue */
    public void enqueue(int data)
    {
        @SuppressWarnings({ "unchecked", "rawtypes" })
		Node node = new Node(data, null);
        if (rear == null)
        {
            front = node;
            rear = node;
        }
        else
        {
            rear.setLink(node);
            rear = rear.getLink();
        }
        size++ ;
    }   
    
    /*  Function to remove front element from the queue */
   	@SuppressWarnings("unchecked")
	public <T> T remove()
    {
        if (isEmpty())
		{
        	throw new NoSuchElementException("Underflow Exception");
		}
        @SuppressWarnings("rawtypes")
		Node ptr = front;
        front = ptr.getLink();        
        if (front == null)
		{
            rear =null;
			size-- ; 
		}       
        return (T) ptr.getData();
    }    
    
    /*  Function to check the front element of the queue */
    public int peek()
    {
        if (isEmpty())
		{
            throw new NoSuchElementException("Underflow Exception");
		}
        return (int) front.getData();
    }    
 
    public void display(int amt)
    {  
    	System.out.println("remaining amount is "+amt);
    }
		
}