package tr_day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
		/*
		 Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
  		 - Method’da indirim uygulayip fiyati main method’da yazdirin
  		 - Method’lari arka arkaya cagirip dogru calistiklarini kontrol edin
		 */
		
		double fiyat = 100;
		
		System.out.println("%10 indirimli fiyat: " + indirim10(fiyat));
		System.out.println("%30 indirimli fiyat: " + indirim20(fiyat));
		System.out.println("%25 indirimli fiyat: " + indirim25(fiyat));
		System.out.println("Method call sonrasi fiyat: " + fiyat);
	}

	public static double indirim10(double fiyat) {
		fiyat = fiyat*0.9;
		return fiyat;
	}

	public static double indirim20(double fiyat) {
		fiyat = fiyat*0.8;
		return fiyat;
	}

	public static double indirim25(double fiyat) {
		fiyat = fiyat*0.75;
		return fiyat;
	}

}
