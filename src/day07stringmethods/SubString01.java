package day07stringmethods;

import java.util.Scanner;

public class SubString01 {
	
	 /*
	 	A part of a String is called substring
	 	substring() of String class is used for getting a substring from the String
	 	We use substring() to get a part of a String by using indexes
	 */

	public static void main(String[] args) {
		
		
		String s1 = "Java is Java";
		System.out.println(s1.substring(5));//is Java
		//index is inclusive
		System.out.println(s1.substring(7));// Java
		//s1.substring(0) and System.out.println(s1) returns the same String
		System.out.println(s1.substring(0));//Java is Java
		//How can I get the last character?
		System.out.println(s1.substring(s1.length()-1));//a
		System.out.println(s1.substring(12));//nothing
		//System.out.println(s1.substring(13));//StringIndexOutOfBoundsException
		
		/*
		 	We have two type of error messages:
		 	1) While we type our code we get "red underline" this is called "Compile time error"
		 	2) While we type our code we don't any red underline but after running our code we get red messages on the console,
		 	it is "Run Time Error"
		 */
		
		String s2 = "Java is OOP language";
		System.out.println(s2.substring(0, 3));
		System.out.println(s2.substring(0,14));
		
		//How do I get just'i'
		System.out.println(s2.substring(5, 6));
		
		
		/*
        Ask user to enter a String 
        If the first and the last character of the String are same
        print "Wooow!" otherwise, print "Hmmmm!" on the console
    */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String");
		String str = scan.nextLine();
		String first = str.substring(0, 1);
		String last = str.substring(str.length()-1);
		
		if(first.equals(last)) {
			System.out.println("Wooow!");
		}else {
			System.out.println("Hmmm!");
		}
		
		scan.close();

	}

}
