package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*
	 	Type java code by using ternary.
		Write a program to print absolute value of an integer entered by user.
	     */
		System.out.println("Enter a integer...");
		int a = scan.nextInt();
		
		int result1 = a<0 ? -1*a : a;
		
 		System.out.println("absolute value of " + a + " is " + result1);
 		
 		/*
 		 	Type java code by using using ternary.
			Take values of length and width of a rectangle from user and check if it is square or not.
 		 */
 		System.out.println("Enter values of length and width of the rectangle");
 		double length = scan.nextDouble();
 		double width = scan.nextDouble();
 		
 		String result2 = length==width ? "it is square" : "it is rectangle";
 		
 	    System.out.println(result2);
 			
 		scan.close();

	}

}
