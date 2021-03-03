package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement05 {
	
	/*
	 	Type java code by using if-else if() statement.
		A school has following rules for grading system:
		1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. From 80 to 100 - A
		Ask user to enter marks and print the corresponding grade.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the your mark...");
		int a = scan.nextInt();
		
		if(a<0) {
			System.out.println("The mark should be between 0 and 100");
		}else if(a>=0 && a<50) {
			System.out.println("Your grade is " + a + ", it means D");
		}else if(a<60) {
			System.out.println("Your grade is " + a +  ", it means C");
		}else if(a<80) {
			System.out.println("Your grade is " + a +  ", it means B");
		}else if(a<=100) {
			System.out.println("Your grade is " + a +  ", it means A");
		}else {
			System.out.println("The mark should be between 0 and 100");
		}
		
		scan.close();

	}

}
