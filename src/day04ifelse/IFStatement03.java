package day04ifelse;

import java.util.Scanner;

public class IFStatement03 {
	
	 /*
    Type java code by using if statement
    When you enter the name of the day a week, 
    output will be "Weekday" or "Weekend day" according to the name of the day
    Get the name of the name from user
    */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the day");
		String dayName = scan.next().toLowerCase();
		
		//to compare Strings DO NOT use "=="  sign. We use it for primitives
		//Use equals() to compare String
		
		if (dayName.equals("saturday") || dayName.equals("sunday")) {
			System.out.println("Weekend Day");
		}
		if (dayName.equals("monday") || dayName.equals("tuesday") || dayName.equals("wednesday") || dayName.equals("thursday") ||
				dayName.equals("friday")){
			System.out.println("Weekday");
		}
		if( !dayName.equals("monday") && !dayName.equals("tuesday") && !dayName.equals("wednesday") && !dayName.equals("thursday") &&
				!dayName.equals("friday") && !dayName.equals("saturday") && !dayName.equals("saturday")) {
			System.out.println("Invalid dayname");
		}
		scan.close();
			
	}

}
