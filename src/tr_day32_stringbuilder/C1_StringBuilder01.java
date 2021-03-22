package tr_day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Rumeysa");
		System.out.println(sb1);//Rumeysa
		
		sb1.append(" ").append("Cetinturk"); //verilen SB'in sonuna istedigimiz String degerlerini ekler
		System.out.println(sb1);//Rumeysa Cetinturk
		
		String cumle = "Javayi cok sever";
		sb1.append(cumle, 6, 10); //Baska bir String'den istedigimiz bolumu SB'in sonuna ekler
								  //Baslangic indexi inclusive, bitis indexi exclusivedir.
		System.out.println(sb1);//Rumeysa Cetinturk cok
		
		System.out.println(sb1.length()); //21 SB'in uzunluk bilgisini verir
		System.out.println(sb1.capacity()); //23 (7+16) SB'in kapasite bilgisini verir 
		
		System.out.println(sb1.charAt(1)); //u SB'in istedigimiz indexte olan karakterin bilgisini verir
		
		sb1.charAt(5); //Bize bilgi getiren methodlar SB'i degistirmez
		System.out.println(sb1);//Rumeysa Cetinturk cok
		
		sb1.delete(17, 21); //SB'in istedigimiz index'lerin arasindaki kismini siler
		System.out.println(sb1); //Rumeysa Cetinturk

		sb1.deleteCharAt(16); //SB'in istedgimiz index'teki karakterini siler
		System.out.println(sb1); //Rumeysa Cetintur
		
		String isim = "Rumeysa Cetintur";
		System.out.println(sb1.equals(isim)); //false data turleri farkli oldugu icin 
											  //icerigin kiyaslanmasi mumkun degildir
		
		StringBuilder sb2 =  new StringBuilder("Rumeysa Cetintur"); 
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false SB'da equals method'u String'den farkli calisir
											 //Ancak kendisi ile true verir
											 //String'deki == gibi calisir
		System.out.println(sb1.equals(sb1)); //true
		
		System.out.println(sb1.indexOf("Cetin")); //8
		System.out.println(sb1.indexOf("e", 6)); //9
		
		System.out.println(sb1.indexOf("Kazim")); //-1
		
		sb1.insert(7, " "); //istedigimiz index'ten itibaren istenen Stringi ekler
		System.out.println(sb1); //Rumeysa  Cetintur
		
		cumle = "Merhaba Dunya";
		sb1.insert(0, cumle, 0, 8); // 0: SB'a hangi index'ten itibaren eklenecek
									// cumle : Hangi String'den eklenecek
									// 0 : cumlenin hangi index'inden baslanacak
									// 8 : bitis index'i
		
		sb1.insert(25, cumle, 8, 13);
		System.out.println(sb1); //Merhaba Rumeysa  CetinturDunya
		
		System.out.println(sb1.lastIndexOf("t")); //22 't' nin en son kullanildigi index
		System.out.println(sb1.lastIndexOf("a", 22)); //14 istenen indexten oncesine bakar
		
		sb1.replace(8, 16, "Seher"); // SB'in baslangic ve bitis index'leri arasindaki kismi
		                             // verilen String ile degistirir
		System.out.println(sb1); // Merhaba Seher CetinturDunya
		
		sb1.reverse();
		System.out.println(sb1); // aynuDrutniteC reheS abahreM
		sb1.reverse();
		
		sb1.setCharAt(10, 'k');
		System.out.println(sb1); // Merhaba Seker CetinturDunya
		
		System.out.println(sb1.subSequence(8, 13)); // Seker SB'in istedigimiz index'ler
		 											// arasindaki bolumu verir
		
		System.out.println(sb1.substring(8)); // Seker CetinturDunya
		
		sb1.toString();
		
		StringBuilder sb3=new StringBuilder("Java cok guzel");
		StringBuilder sb4=new StringBuilder("Java cok guzel");
		
		System.out.println(sb3.equals(sb4)); //false
		//iceriklerinin esit olup olmadigina bakmak icin String'deki equal methodunu kullanalim
		System.out.println(sb3.toString().equals(sb4.toString())); // true
		
		sb3.toString().concat(" Insanin sevdikce sevesi geliyor"); //String Class'ina ait methodlar
																   //kullanilinca kalici degisiklik olmaz
		System.out.println(sb3);
		//toString method'unu kullaninca SB String'e donusmus olur
		//dolayisiyla tum String methodlari kullanilabilir
		System.out.println(sb3.toString().concat(" Insanin sevdikce sevesi geliyor"));
		//Java cok guzel Insanin sevdikce sevesi geliyor
		
		System.out.println(sb1.length()); //27 
		System.out.println(sb1.capacity()); //48
		sb1.trimToSize(); // SB icin hazirlanan kapasitedeki fazlaliklari siler
						  // lenght ile kapasiteyi esit duruma getirir
		System.out.println(sb1.length()); //27 
		System.out.println(sb1.capacity()); //27
		
		System.out.println(sb3.compareTo(sb4)); // tum karakterlerin esitligini kontrol eder. Esit ise 0 verir

	}

}
