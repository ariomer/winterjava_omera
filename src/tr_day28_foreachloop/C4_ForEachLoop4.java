package tr_day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {

	public static void main(String[] args) {
		/*
		 iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
		 Sonucu ekrana yazdiriniz.
		 Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
		 */
		
		String arr1[] = {"Ali","Can","Ayse","Seher"};
		String arr2[] = {"Ali","Veli","Mesut","Seher","Sedat"};
		
		//Ortak elemanlari bulmak icin bir list olusturalim
		List<String> list = new ArrayList<>();
		
		for (String each1 : arr1) {
			for (String each2 : arr2) {
				if(each1.equals(each2)) {
					list.add(each1);
				}
			}	
		}
		if(list.isEmpty()) {
			System.out.println("Ortak eleman yok");
		}else {
			System.out.println(list);
		}
	}
}
