package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement04 {
	/*
	 	Type java code by using if-else if() statement,
if both of the two integers are positive, output will be the sum of them.
If both of the two integers are negative, output will be the multiplication of them.
Otherwise; output will be “I cannot add or multiply different signed numbers”
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first integer");
		int num1 = scan.nextInt();
		System.out.println("enter second integer");
		int num2 = scan.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
		}else if(num1 < 0 && num2 < 0)  {
			System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
		}else if(num1==0 && num2==0) {
			System.out.println("The sum and multiplication of " + num1 + " and " + num2 + " is " + (num1 + num2));
		}
		else {
			System.out.println("I cannot add or multiply different signed numbers");
		}
		
		scan.close();

	}

}
