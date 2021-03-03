package tr_day15_methodcreation;

import java.util.Iterator;

public class C4_ForLoop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazdiralim
		/*
		 System.out.println("Hello World");
		 System.out.println("Hello World");
		 System.out.println("Hello World");
		 System.out.println("Hello World");
		 System.out.println("Hello World");
		 */

        // bunun yerine loop kullaniyoruz
	    // ne yapacagimizi java'ya soyluyoruz, kac kere gerektigini soyluyoruz
		
	    // Tum loop'larda a3 seyi yazmak zorundayiz
	    // 1) Baslangic degeri
		// 2) Bitis degeri
		// 3) Artis degeri
		
		for (int i = 100; i>3; i-=5) {
			System.out.println(i + " Hello World");
		}
		//Not: Eger sart kismi bizim artisimiza hep true verirse loop sonsuz donguye girer
		//Not: loop'da artis degeri pozitif oldugu gibi negatif de olabilir i--
		//Not: Artis degeri 1 olmak zorunda degil, farkli da olabilir
		//Not: eger loop'un sarti hic true olmazsa loop body hic devreye girmez
	}

}
