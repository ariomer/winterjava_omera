package day12dowhilevariablesconstructors;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		passwordCheck();

	}
	
	public static void passwordCheck() {
		
		Scanner scan = new Scanner(System.in);
		String password = "";
		
		do {
			System.out.println("Please enter password");
			password = scan.nextLine();
			if(password.length()>6) {
				System.out.println("It is okay");
			}else {
				System.out.println("It should be min 7 character");
			}
		}while(password.length()<=6);
		scan.close();
	}

}
