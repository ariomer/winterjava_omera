package day10forloops;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		drawRevTriangle();

	}
	
	/*
	 	Create the following image by getting the number of rows from user
		 				 .
		                 .
		              * * * *
		               * * *
		                * *
		                 *
	 	
	 */
	
	public static void drawRevTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting an integer");
		int num= scan.nextInt();
		System.out.println("   .");
		System.out.println("   .");
		for (int i = 1; i<=num; i++) {
			
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			
			for(int k=i; k<=num; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}

}