package com.bridgelabz.util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	   String regex1 = "<<name>>";
	   String regex2= "<<fullname>>";
	   String regex3 = "xxxxxxxxxx";
	   String regex4 = "XX/XX/XXXX";
	    
	   
	
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
	
	
	

	
	
	
}


