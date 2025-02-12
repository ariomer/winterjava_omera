package tr_day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		//linked bagli demek
		// linked list'te tum elemanlar tren gibi birbirine baglidir
		
		// Collections'da object olustururken
		// olusturmak istedigimiz collection'in class mi yoksa interface'mi olduguna bakmaliyiz.
		// Eger olusturmak istedigimiz collection interface ise
		// Data turu olarak o interface'i, constructor olarak ise uygun bir class secmeliyiz
		// Simdiye kadar List(interface) olustururken constructor olarak ArrayList() seciyorduk
		
		List<String> liste = new ArrayList<>();
		liste.add("X");
		liste.add("Y");
		
		LinkedList<String> ll1 = new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); // [A, B]
		ll1.add(1, "C");
		System.out.println(ll1); // [A, C, B]
		ll1.addAll(liste);
		System.out.println(ll1); // [A, C, B, X, Y]
		
		ll1.addAll(2,liste);
		System.out.println(ll1); // [A, C, X, Y, B, X, Y]
		
		ll1.addLast("K");
		System.out.println(ll1); // [A, C, X, Y, B, X, Y, K]
		
		// LinkedList List ve Queue interface'lerine implement ile child oldugundan
		// her iki interface'deki tum method'lari override etmek zorundadir.
		// Islev olarak ayni isi yapan addLast() queue'dan ve add() ise List'den inherit edilmistir.
		
		// Ben bir linkedlist olusturmak istiyorum ama sadece List ozelliklerini tasisin
		List<String> listList = new LinkedList<>();
		listList.add("Sadece list'ten gelen ozellikler var");
		
		// Ben bir linkedlist olusturmak istiyorum ama sadece Queue ozelliklerini tasisin
		Queue<String> queueList = new LinkedList<>();
		queueList.add("Sadece queue'dan gelen ozellikler var");
		
		
	}

}
