package day04ifelse;

import java.util.Scanner;

public class IfStatement04 {
	
	/*
    Ask user to enter the values of length and width of a rectangle then check
    if it is square or not
    */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value length of a rectangle");
		double length = scan.nextDouble();
		System.out.println("Please enter the values width of a rectangle");
		double width = scan.nextDouble();
		
		if( width <=0 || length <=0) {
			System.out.println("Enter valid value");
		}
		if(length == width) {
			System.out.println("This is square");	
		}
		if(length != width) {
			System.out.println("This is rectangle");
		}
		scan.close();
	}
}	
