package tr_day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		/*
		 	Soru 4) Kullanicidan baslangic ve bitis haflerini alin
		 	ve baslangic harfinden baslayip bitis harfinde biten
		 	tum harfleri buyuk harf olarak ekrana yazdirin.
		 	Kullanicinin hata yapmadigini farz edin.
		 */		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first character");
		char chr1 = scan.next().toUpperCase().charAt(0);
		System.out.println("Please enter last character");
		char chr2 = scan.next().toUpperCase().charAt(0);
		
		while(chr1<=chr2) {
			System.out.print(chr1+" ");
			chr1++;
		}		
		scan.close();
	}
}
