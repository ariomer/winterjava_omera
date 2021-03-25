package tr_day33_encapsulation;

public class Encapsulation02 {
	private String okulIsmi="Yildiz Koleji";
	// Okul isminin baska class'lardan okunmasini ama deger atanamamasini istiyorsak
	// getter() method'u olusturuyoruz
	
	private String tcNo="12345678901";
	private int hesapNo=5554321;
	// Object olusturularak deger atanip kullanilmasini istedigimiz ama
	// ilk atadigimiz degerin gorulmemesini istiyorsak setter() method'u kullaniliriz
	
	public int sayi = 100;

	public static void main(String[] args) {
		// eger ulasmak istedigim class uyeleri(class members) public degilse baska
		// package'lerden ulasmak icin ekstre islem yapmam gerekir
		
		//Yapabilecegimiz islemlerden 1.si Encapsulation(Data Saklama)
		// bu class'da kimseyle paylasmak istemedigimiz variable ve method'lar olusturalim
		
		//private yapinca guvenlik konusunu halletmis olduk
		//Ancak class uyelerinin private olmasi OOP consept'e aykiri
		
		//Encapsulation class'imizda olusturdugumuz class uyelerine
		//kimlerin ne oranda ulasabilecegini belirlemek icin yapilir
		

	}
	
	private void denemeMethod() {
		System.out.println("Deneme method'u calisti");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}
	
}
