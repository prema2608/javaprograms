package com.bridgelabz.singletonlink;

public class StaticBlockSingletonMain 
{

	
	public static void main(String[] args) 
	{
		StaticBlockSingleton instance = StaticBlockSingleton.getInstance();
		   System.out.println(instance);

			StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
			   System.out.println(instance1);

		
	}
}
