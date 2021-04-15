package tr_day51_streamOrnekler;

import java.util.ArrayList;
import java.util.List;

public class Stream04String {

	public static void main(String[] args) {
		List<String> liste = new ArrayList<>();
		liste.add("Ali");
		liste.add("Mark");
		liste.add("Jackson");
		liste.add("Amanda");
		liste.add("Mariano");
		liste.add("Alberto");
		liste.add("Tucker");
		liste.add("Christ");
		
		aIleBaslayanlar(liste);
		System.out.println("==============");
		buyukHarfeCevir(liste);

	}
	
	// Listedeki bas harhi A ile baslayan isimleri yazdiran methodu tanimlayalim..
	public static void aIleBaslayanlar(List<String> liste) {
		liste.stream().filter(h-> h.startsWith("A")).forEach(System.out::println);
	}
	
	public static void buyukHarfeCevir(List<String> liste) {
		liste.stream().map(h-> h.toUpperCase()).forEach(System.out::println);
	}

}
