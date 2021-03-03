package tr_day16_forloop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir String giriniz");
		String str = scan.nextLine();
		
		for(int i=str.length()-1; i>=0 ;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
