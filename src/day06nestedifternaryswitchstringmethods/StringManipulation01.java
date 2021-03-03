package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class StringManipulation01 {
	
	/*
	 	String Methods:
	 	1)toUpperCase() 2)toLowerCase 3)charAt()     4)equals()         5)equalsIgnoreCase() 6)length()
	 	7) next()       8)nextLine()  9)indexOf()    10) lastIndexOf()  11) contains()
	 */

	public static void main(String[] args) {
		
		//9)indexOf()
		
		String str = "Java is easy if you study";
		
		//indexof() returns the index of first occurrence of the character
		System.out.println(str.indexOf("i")); //5
		//indexof() accepts char as parameter as well
		System.out.println(str.indexOf('i')); //5
		//if the character doesnt exist in the String, it returns "-1"
		System.out.println(str.indexOf("x")); //-1
		//If you use multiple characters in indexof(). it returns the index of first character
		System.out.println(str.indexOf("easy")); //8
		//If you use indexof() with 2 parameter, Java looks for the index of character after the given index.
		//Second parametere is inclusive
		System.out.println(str.indexOf('e', 8));//8
		
		/*
		 	Ask user to enter a String and a character, then check if the String has the character
		 */
//		
		Scanner scan = new Scanner(System.in);
//		System.out.println("enter a string the enter a character");
//		String s = scan.nextLine();
//		char ch = scan.next().charAt(0);
//		
//		String result = s.indexOf(ch)==-1 ? "The String has no character" : "The String has the character";
//		System.out.println(result);
		
		//10) lastIndex0f() returns the index of last occurrence of the character
		String t = "Java ah Java!";
		
		//In lastindexOf() method you can use char and String. Both are acceptable
		System.out.println(t.lastIndexOf('a'));//11
		System.out.println(t.lastIndexOf("a"));//11
		//lastindexOf() method return -1 if character does not exist in the String
		System.out.println(t.lastIndexOf("w"));//-1
		//lastindexOf() method returns the index of first character of last occurrence of "Java"
		System.out.println(t.lastIndexOf("Java"));//8
		//If you use lastindexOf() with 2 parameters , get the character starting with the index and to the beginning of the String
		//In the following example we are using "Java a"
		System.out.println(t.lastIndexOf("v",5));//8
		
		/*
		 	Ask user to give you a String and a character
		 	If the character does not exist in the String or exist just once print "Not good!"
		 	If the character is used multiple times print "Woow!"
		 */
		
//		System.out.println("enter a string the enter a character");
//		String s = scan.nextLine();
//		char ch = scan.next().charAt(0);
//		
//		if(s.indexOf(ch)==-1 || s.indexOf(ch)==s.lastIndexOf(ch)) {
//			System.out.println("Not good!");
//		}if(s.indexOf(ch)!=s.lastIndexOf(ch)) {
//			System.out.println("Woow!");
//		}
		
		//11) contains() is used to check if a single character or multiple characters exist in a String
		
		//contains() method returns boolean
		//contains() method cannot be used with chars, you have to use Strings
		String r = "Learn Java, earn money";
		System.out.println(r.contains("e"));//true
		System.out.println(r.contains("x"));//false
		System.out.println(r.contains("earn"));//true
		
		scan.close();
		

	}

}
