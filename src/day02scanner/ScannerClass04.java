package day02scanner;

import java.util.Scanner;

public class ScannerClass04 {
	
	/*
	Type a program which calculates the volume of a rectangular prism
	whose length, with, and height are entered by user.
	Hint 1: Volume of a rectangular prism is width x length x height
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the width of the rectangular prism");
		double  width = scan.nextDouble();
		
		System.out.println("Please enter the length of the rectangular prism");
		double  length = scan.nextDouble();
		
		System.out.println("Please enter the height of the rectangular prism");
		double  height = scan.nextDouble();
		
		System.out.println("Volume of a rectangular prism is: " + (width * length * height));
		scan.close();

	}
	
	

}
