package tr_day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {

	public static void main(String[] args) {
		/*
		Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. 
		Iki method olusturup list elemanlarini artirmayi deneyelim
  		- 1. Method’da elemanlari for each loop kullanarak artirin
 		- 2. Method’da elemanlari set method’u kullanarak artirin
  		- Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
		 */
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);//[10, 11, 12]
		
		artirMethod(list);// 13 14 15 
		System.out.println("1.Method call'dan sonra : " + list);// [10, 11, 12]
		setMethod(list);
		System.out.println("Set ile degistirdigimiz liste main method'un icinde : " + list); //[13, 14, 15]
	}

	public static void artirMethod(List<Integer> list) {
		for (Integer each : list) {
			each+=3;
			System.out.print(each + " "); 
		}
		System.out.println("");
		System.out.println(list);//listenin degismedigini gorduk
	}

	public static void setMethod(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			
			list.set(i, list.get(i)+3);
		} 
		System.out.println("Set ile degistirdigimiz liste method'un icinde : " + list);
		// Java Pass By Value kullanir ancak list'deki set method'u istisnai olarak
		// Method'un icinde yapilan degisiklikleri de kalici hale getirir.
	}

}
