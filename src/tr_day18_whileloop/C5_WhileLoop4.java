package tr_day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		/*
		 	Soru 6 ) Kullanicidan bir sayi alin
		 	ve bu sayiyi tam bolen sayilari
		 	ve toplam kac tane  olduklarini ekranda yazdirin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int num = scan.nextInt();
		
		int i = 1;
		int j = 0;
		while (i<=num) {
			if(num%i==0) {
				j++;
				System.out.println(j + ".Bolen: " + i);
				
			}
			i++;
		}System.out.println(j + " tane tam bolen vardir");
		
		scan.close();
	}
}
