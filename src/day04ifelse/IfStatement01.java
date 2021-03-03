package day04ifelse;

import java.util.Scanner;

public class IfStatement01 {
	
	/*
	 Get the integer from user 
	 Type java code, if an integer is even, output will be “The integer is even”.
 	If the integer is odd, output will be “The integer is odd”.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check if it is even or odd");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Even");
		}
		if(num %2 != 0) {
			System.out.println("Odd");
		}
		
		scan.close();

	}

}
