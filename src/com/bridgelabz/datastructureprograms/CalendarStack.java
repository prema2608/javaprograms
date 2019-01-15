package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.QueueLinkedList;
import com.bridgelabz.util.Stack;

public class CalendarStack
{

	public static void main(String[] args) {
		// DataStructureUtility u = new DataStructureUtility();
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);

		String[] months = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		// days[i] = number of days in month i
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// check for leap year
		if (month == 2 && DataStructureUtility.isLeapYear(year))
			days[month] = 29;

		// print calendar header
		System.out.println("   " + months[month] + " " + year);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		System.out.println();

		// starting day
		int d = DataStructureUtility.day(month, 1, year);

		Stack<QueueLinkedList<Integer>> mystacklist = new Stack<QueueLinkedList<Integer>>();
		QueueLinkedList<Integer> queue = new QueueLinkedList<Integer>();
		Stack<QueueLinkedList<Integer>> Stacklnkdlist = new Stack<>();
		// printing the calendar
		for (int i = 0; i < d; i++)
			System.out.print("\t");
		for (int i = 1; i <= days[month]; i++) {
			queue.enqueue(i);
			if (((i + d) % 7 == 0) || (i == days[month])) {
				mystacklist.push(queue);
			queue = new QueueLinkedList<Integer>();
				continue;
			}
		}
		
		 for (int i = 0; i < mystacklist.size(); i++) {
			 Stacklnkdlist.push(mystacklist.pop());
		 }

		for (int i = 0; i < Stacklnkdlist.size(); i++) {
			QueueLinkedList<Integer> weeks = Stacklnkdlist.pop();
			for (int j = 0; j < weeks.getSize(); j++) {
				System.out.print(weeks.remove() + "\t");
			}

			System.out.println();
		}

	}

	
	
}
