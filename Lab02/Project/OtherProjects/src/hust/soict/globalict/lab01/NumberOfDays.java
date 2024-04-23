package hust.soict.globalict.lab01;

import java.util.*;

public class NumberOfDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int Y = input.nextInt();
		
		if (Y < 0) {
			System.out.println("Invalid year. Please enter again");
			System.exit(0);
		}
		
		System.out.print("Enter month: ");
		String M = input.next();
		
		switch (M) {
			case "1": case "3": case "5": case "7": case "8": case "10": case "12":
			case "Jan": case "Mar": case "May": case "Jul": case "Aug": case "Oct": case "Dec":
			case "Jan.": case "Mar.": case "July": case "Aug.": case "Oct.": case "Dec.":
			case "January": case "March": case "August": case "October": case "December":
				System.out.println("This month has 31 days.");
				break;
			
			case "4": case "6": case "9": case "11":
			case "Apr": case "Jun": case "Sep": case "Nov":
			case "Apr.": case "June": case "Sept.": case "Nov.":
			case "April": case "September": case "November":
				System.out.println("This month has 30 days");
				break;
			
			case "2": case "Feb": case "Feb.": case "February":
				if (Y % 4 != 0) System.out.println("This month has 28 days.");
				else {
					if (Y % 100 == 0 && Y % 400 != 0) {
						System.out.println("This month has 28 days.");
					}
					else System.out.println("This month has 29 days.");
				}
				break;
			default:
				System.out.println("Invalid month. Please enter again.");
			
		}
		
	}
}
