package day02scanner;

import java.util.Scanner;

public class Homework01 {
	
	/*
	 	1)Type a program which calculates the area and the perimeter of a circle
		whose radius is entered by user. (Use float)
		Hint 1: Take pi number as 3.14159
		Hint 2: Area of a circle is 3.14159 x radius x radius
		Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
		Hint 4: To get float, use nextFloat()
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the radius value");
		float radius = scan.nextFloat();
		
		System.out.println("The perimeter of a circle: " + (2 * 3.14159 * radius));
		System.out.println("The area of a circle: " + (3.14159 * radius * radius));
		
		scan.close();
	}
	
	

}
