package day11whileloopdowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 	Ask user to enter a number
		    If the number user entered is less than 10 print “Won!” on the console
		 	Otherwise, ask user to enter a number again.
		 */
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		do {
				System.out.println("Please enter a number ");
				num = scan.nextInt();
		}while(num>9);
		System.out.println("Won");
		scan.close();

	}

}
