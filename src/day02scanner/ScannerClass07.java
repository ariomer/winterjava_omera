package day02scanner;

import java.util.Scanner;

public class ScannerClass07 {
	
	/*
	   User will enter first name and you will print the first character on the console.
	   User will enter last name and you will print the first character on the console.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first name");
		char firstNameinitial = scan.next().charAt(0);
				
		System.out.println("Please enter your last name");
		char lastNameinitial = scan.next().charAt(0);
		
		System.out.println("Initial of the first name: " + firstNameinitial);
		System.out.println("Initial of the first name: " + lastNameinitial);
		
		/*
		If you use mathematical opearations for chars, Java uses the ASCII values fo chars.
		If you want to print chars on the console as characters not ASCII values, you have 2 options
		1) Use String together with chars
		2) Use System.out.print()
		
		Note1 : System.out.println() the output then goes to the next line
		Note2 : System.out.print() the output then waits the same line
		 */
		
		//1.Way
		System.out.println("" + firstNameinitial + lastNameinitial);
		
		//2.Way
		System.out.print(firstNameinitial);
		System.out.print(lastNameinitial);
		
		scan.close();
	}
	


}
