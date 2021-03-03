package day02scanner;

import java.util.Scanner;

public class Homework03 {
	
	/*
 	3)Type a program which converts the mile to kilometer. Mile value will be
	entered by user. (Use double)
	Hint 1: km = mile x 1.6
	Hint 2: To get double, use nextDouble()
   */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the mile value");
		double mile = scan.nextDouble();
		
		System.out.println("mile to km value :" + (mile * 1.6));
		scan.close();
	}


}
