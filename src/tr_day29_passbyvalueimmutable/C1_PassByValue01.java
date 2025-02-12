package tr_day29_passbyvalueimmutable;

public class C1_PassByValue01 {

	public static void main(String[] args) {
		// PassByValue ve PassByReference
		
		/*
	 	Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
  		- Method�da indirim uygulanan fiyati yazdirin
  		- Method Call sonrasi original fiyati yazdirin ve method�da yapilan degisikligin
    	orginal degeri degistirip degistirmedigini kontrol edin.
		 */
		
		double fiyat = 100;
		
		indirimUygula(fiyat); // Method call
		System.out.println("Method call sonrasi fiyat: " + fiyat);

	}

	public static void indirimUygula(double fiyat) {
		
		fiyat = fiyat*0.9;
		
		System.out.println("%10 indirimli fiyat: " + fiyat);
		System.out.println(fiyat-10);
	}

}
