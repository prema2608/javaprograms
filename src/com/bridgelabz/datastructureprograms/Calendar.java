package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;

public class Calendar
{
public static void main(String[] args)
{
	//DataStructureUtility u = new DataStructureUtility();
    int month = Integer.parseInt(args[0]);    
    int year = Integer.parseInt(args[1]);     

    
    String[] months = {
        "",                               
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    };

    // days[i] = number of days in month i
    int[] days = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // check for leap year
    if (month == 2 && DataStructureUtility.isLeapYear(year))
    	days[month] = 29;


    // print calendar header
    System.out.println("   " + months[month] + " " + year);
    System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSun");
    System.out.println();
 
    // starting day
    int d = DataStructureUtility.day(month,1, year);

    // printing the calendar
    for (int i = 0; i < d; i++)
    	System.out.print(" ");
    for (int i = 1; i <= days[month]; i++) {
    	System.out.print( i+"\t");
        if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
    }

}



}
