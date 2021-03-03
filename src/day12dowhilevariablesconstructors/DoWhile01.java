package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		evenIntCheck();
	}
	
	public static void evenIntCheck() {
		//Ask user to enter an integer
		//If the integer is even print on the console “You won!”
		//Otherwise ask user to enter another integer
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Please enter a number...");
			num = scan.nextInt();
			if(num%2==0) {
				System.out.println("You won!");
			}
		}while(num%2!=0);
		scan.close();
		
	}

}
