package tr_day51_streamOrnekler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream04String {

	public static void main(String[] args) {
		List<String> liste = new ArrayList<>();
		liste.add("Ali");
		liste.add("Mark");
		liste.add("Jackson");
		liste.add("Amanda");
		liste.add("Alihano");
		liste.add("Mariano");
		liste.add("Alberto");
		liste.add("Tucker");
		liste.add("Christ");
		
		aIleBaslayanlar(liste);
		System.out.println("==============");
		buyukHarfeCevir(liste);
		System.out.println("==============");
		uzunlugaGoreYazdir(liste,3);
		System.out.println("==============");
		System.out.println("TUM ELEMANLAR BELIRTILEN DEGERDEN KUCUK:" + uzunlukKucukMu(liste,7));
		System.out.println("==============");
		System.out.println("Baslayan Yok mu: " + baslamayanHarfVarMi(liste, "M"));
		System.out.println("==============");
		System.out.println("r" + " ile biten herhangi bir eleman var mi : " + herhangiBitenVarMi(liste, "r"));
		System.out.println("==============");
		aileOYazdir(liste);
		uzunluk(liste);
		yazdir(liste);
		
	}
	
	// Listedeki bas harhi A ile baslayan isimleri yazdiran methodu tanimlayalim..
	public static void aIleBaslayanlar(List<String> liste) {
		liste.stream().filter(h-> h.startsWith("A")).forEach(System.out::println);
	}
	
	 //********************************************************************************************
    // ORNEK17: Listedeki tüm isimleri büyük harfe çeviren metodu tanımlayalım..
    //********************************************************************************************
	public static void buyukHarfeCevir(List<String> liste) {
		liste.stream().map(h-> h.toUpperCase()).forEach(System.out::println);
	}
	
	//********************************************************************************************
    // ORNEK18: Listedeki tüm elemanları uzunluklarına göre sıralayan ve Küçük harfe çeviren
    // ve yazdıran metodu tanımlayalım..
    //********************************************************************************************
	public static void uzunlugaGoreYazdir (List <String> liste, int uzunluk){
	    liste.stream().filter(t->t.length() > uzunluk).forEach(System.out::println);
	}
	
	// Listedeki tüm elemanların uzunlukları belirtilen uzunluktan kucuk mu diye kontrol eden 
	// metodu tanımlayalım..
	// allMatch() belirtilen sartlari tum elemanlar sagliyorsa true dondurur. yoksa false
	public static boolean uzunlukKucukMu(List<String> liste , int uzunluk) {
	    return liste.stream().allMatch(t->t.length()<uzunluk);
	}
	
	//****************************************************************************************************
    // ÖRNEK21: Listedeki TÜM elemanların belirtilen harfi ile başlamadığını kontrol eden metodu yazınız.
    //****************************************************************************************************
    // noneMatch() Belirtilen sartları tüm elemanlar sağlamıyorsa true döndürür. yoksa false
    public static boolean baslamayanHarfVarMi(List <String> liste, String harf){
        return liste.stream().noneMatch(t->t.startsWith(harf));
    }
	
	
    //****************************************************************************************************
    // ÖRNEK22: Listedeki herhangi bir eleman belirtilen bir harf ile bitiyor mu diye kontrol eden metodu yazınız.
    //****************************************************************************************************
	// anyMatch() belirtilen sartlari tum elemanlar saglamiyorsa true dondurur. yoksa false
	public static boolean herhangiBitenVarMi(List<String> liste, String harf) {
		return liste.stream().anyMatch(t->t.endsWith(harf));
	}
	
	//A ile baslayip o ile biten elemanlari yazdiran methodu tanimlayiniz
	
	public static void aileOYazdir(List<String> liste) {
		liste.stream().
		        filter(x->x.
				startsWith("A") && x.endsWith("o")).
		        forEach(System.out::println);
	}
	
	//  ÖRNEK24: Aşağıdaki formata göre listedeki her bir elemanın uzunluğunu yazdıran metodu yazınız.
	//  Ali: 3        Mark: 4       Amanda: 6     vb.
	
	public static void uzunluk(List<String> liste) {
	    liste.stream().sorted(Comparator.comparing(String::length)).
	            map(t-> t  + " : " + t.length() + " ").
	            forEach(System.out::print);
	}
	
	public static void yazdir(List<String> liste) {
		liste.stream().
				map(String::toLowerCase).
				filter(t->t.startsWith("a")).
				forEach(System.out::println);
	}
	
}
