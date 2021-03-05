package tr_day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir program yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String");
		String str = scan.nextLine();
		
		//1.Way
		String reverse = "";
		
		for(int i=str.length()-1; i>=0 ;i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
		
		//2.Way
		
		for(int i=str.length()-1; i>=0 ;i--) {
			System.out.print(str.charAt(i));
		}
		scan.close();
		System.out.println("");
		//3.Way
		reverse(str);
		
	}

	public static void reverse(String str) {
		for(int i=str.length()-1; i>=0 ;i--) {
			System.out.print(str.charAt(i));
		}	
	} 
}
