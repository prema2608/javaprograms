package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

public class PowerOf2
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the power value");
		double n=sc.nextInt();
		double p= Math.pow(2.0,n);
		System.out.println("value="+p);

	}


}
