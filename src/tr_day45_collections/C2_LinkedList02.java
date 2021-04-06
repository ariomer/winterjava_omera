package tr_day45_collections;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		
		LinkedList<Object> ll1 = new LinkedList<>();
		// Collection'da esitligin sol tarafinda <> icinde data turu yazilmasa
		// veya data turu olarak Object yazilsa collections calisir
		// Ama boyle bir kullanimda surekli cast yapildigi icin
		// zaman ve hafiza acisindan verimli degildir.
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000; i++) {
			ll1.add("A"+i); // concatination
			ll1.add(20+i); // toplama
			ll1.add('C'+i); // ASCII degerleri toplayacak
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("===========================");
		//System.out.println(ll1); // [A, 20, C]
		
		LinkedList ll2 = new LinkedList<>();
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000; i++) {
			ll2.add("B"+i); // concatination
			ll2.add(25+i); // toplama
			ll2.add('K'+i); // ASCII degerleri toplayacak
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("===========================");
		//System.out.println(ll2); // [B, 25, K]
		
		LinkedList<Integer> ll3 = new LinkedList<>();
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000; i++) {
			ll3.add(10+i); // concatination
			ll3.add(20+i); // toplama
			ll3.add(30+i); // ASCII degerleri toplayacak
		}
		System.out.println(System.currentTimeMillis());
		
		//System.out.println(ll3); //[D, 15, Z]

	}

}
