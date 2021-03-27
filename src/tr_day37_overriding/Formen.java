package tr_day37_overriding;

public class Formen extends Isci{
	
	public String sorumluOldBolum="bakim";
	public String isim="Emrullah";

	public static void main(String[] args) {
		
		// Inheritance'da data turu olarak class ismi kullanimi
		
		// Bir class'da object uretirken data turu olarak class'in kendisini
		// veya parent(lar)ini kullanabiliriz.
		// Olusturdugumuz object ile variable kullanmamiz gerekirse, hangi degeri alacagini
		// anlamak icin once Data olan class'a gideriz
		// orada aradigimiz variable varsa kullaniriz yoksa
		// parent(lar)ina bakariz, yukari dogru giderken ilk buldugumuz degeri kullaniriz
		
		Formen fr1=new Formen();
		// fr1 objectiinii kullanarak hangi class'larin variable'larini gorebilirim
		fr1.sorumluOldBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOldBolum+ " " + fr1.maas);
		// Emrullah Marangozhane 10000
		
		Isci fr2=new Formen();
		// Data turu olarak Isci secildigi icin
		fr2.bolum="Kaynak Atolyesi";
		//fr2.isim="Yakup";
		System.out.println(fr2.isim + " " + fr2.bolum+ " " + fr2.maas);
		// Mesut Kaynak Atolyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim); // Emre
		
	}

}
