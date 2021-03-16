package tr_day27arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		
		System.out.println(list); //[Ali, Can, Ayse, Fatma]
		
		System.out.println(list.size()); //4
		
		System.out.println(list.remove(1)); // indexi 1 olan Can'i silip, sildigi elemani bana dondurecek
		System.out.println(list); //[Ali, Ayse, Fatma]
		
		System.out.println(list.remove("Ayse")); // Ayse'yi silecek ve bize true donecek
		System.out.println(list); //[Ali, Fatma]
		
		System.out.println(list.remove("Mehmet")); // Mehmet'i bulamadigi icin silemeyecek ve bize false donecek
		System.out.println(list); //[Ali, Fatma]
		
		String isim="Ali"; // String'ler Immutable'dir bu nedenle degistirilemez
		isim.toLowerCase();
		System.out.println(isim); //Ali java String methodlari ile String'i degistirmez. Ancak assing yaparsak String degisir
		
		list.remove(1);
		list.remove("Ali");
		System.out.println(list); // []
		
		
	}

}
