package com.bridgelabz.singletonlink;

public class EagerInitializedSingletonMain 
{
	
		   public static void main(String[] args)
		    {
			   //its not creating object becoz it is private
			  // EagerInitializedSingleton eg = new EagerInitializedSingleton();
			   EagerInitializedSingleton instance = EagerInitializedSingleton.getInstance();
			   System.out.println(instance);
			   EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
			   System.out.println(instance1);

		    }	
	}
		

