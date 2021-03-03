package day10forloops;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		multiplicationTable();
		
	}
	
	/*
	 	
	 */
	public static void multiplicationTable() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to see multiplication table");
		double d = scan.nextDouble();
		
		int i = 1;
		
		while(i<=10) {
			System.out.println(d + "x" + i + "=" + (d*i));
			
		i++;
		}
		
		
	}

}
