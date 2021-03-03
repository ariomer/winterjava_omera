package day03wrapperclassconcatenatelogicaloperators;

import java.util.Scanner;

public class ModulusOperator01 {
	
	/*
	  Ask user to enter 3 digit integer.
	Type a program to find the sum of the digits
	For example; 438 ==> 4+3+8 = 15
	  */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 3 digits integer");
		int num = scan.nextInt();
		// num = abc
		
		int c = num%10;
		int b = (num/10)%10;
		int a = num/100;
		System.out.println("the sum of the digits: " + (a+b+c));
		
		scan.close();
		

	}

}
