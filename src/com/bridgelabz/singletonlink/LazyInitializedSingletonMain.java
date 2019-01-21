package com.bridgelabz.singletonlink;

public class LazyInitializedSingletonMain 
{
  public static void main(String[] args) 
  {
	  
	  LazyInitializedSingleton instance = LazyInitializedSingleton.getInstance();
	System.out.println(instance);
	LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
	System.out.println(instance1);
}
	
	
	
}
