package tr_day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
	
	@SuppressWarnings({"unused", "resource"})
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
		
		//try-catch blogu exception ile handle etmekde kullanilabilir
		// throws keyword'u ise sadece declaration'dir, dolayisla
		// throws kullanilan bir method'da exception olursa KOD BLOKE OLUR
		
		int k =0 ; 
		
		while((k=fis.read())!=-1) {
			System.out.println((char)k);
		}
		
		// Eger birden fazla exception icin throws keyword'u kullanacaksak
		// yazacagimiz exceptionlarin arasindaki iliski ve siralama onemli olur
		// eger yazdigimiz exception'lar arasinda parent-child iliskisi varsa
		// once child exception yazilmalidir, aksi takdirde child exception erisilemez olur.
		
		// Eger yazacaklarimiz arasinda parent-child iliskisi varsa
	    // istersek sadece Parent'i yazmamiz da yeterli olur
		
	}

}
