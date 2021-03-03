package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement02 {
	/*
	 	Ask user to enter a character,
		then check whether the character is alphabet or not
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = scan.next().charAt(0);
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " is an alphabet");
		}else {
			System.out.println(ch + " is not an alphabet");
		}
		
		scan.close();

	}

}
