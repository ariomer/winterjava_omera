package tr_day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {
		// bir ArrayList nasil olusturulur
		// ArrayList bir objecttir, dolayisiyla yeni bir tane olusturmak icin new keyword'unu kullanmaliyiz
		
		// 1.Yol
		ArrayList<String> list = new ArrayList<String>();
		
		// 2.Yol
		ArrayList<String> list2 = new ArrayList<>();
		
		// 3.Yol En cok bu kullanilir
		List<String> list3 = new ArrayList<>();
		
		//NOT: Eger contructor olarak List<>() kullanilirsa  CTE verir
		// List<>() constructor olarak kullanilamaz
		// Olusturdugunuz Class isimleri Java'da kullanilan object isimleri ile AYNI OLMAMALIDIR
		
		// List'e eleman ekleme
		// List olustururken otomatik olarak eleman ekleme ozelligi yoktur
		// Elemanlarin tek tek eklenmesi gerekir
		
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");
		
		// List nasil yazdirilir
		System.out.println(list3); // [Ali, Veli, Ayse]
		
		list3.add(1, "Can");// 1.indexe istenen degeri ekler
		System.out.println(list3); // [Ali, Can, Veli, Ayse]
		
		list3.add(1, "Fatma");// 1.indexe istenen degeri ekler
		System.out.println(list3); //[Ali, Fatma, Can, Veli, Ayse]
		
		// Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip,
				// kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
				
		int arr[] = {2,3,5,3,6,4,3,6,7};
		int sayi = 3;
		
		List<Integer> istenenList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=sayi) {
				istenenList.add(arr[i]);
			}
		}
		System.out.println(istenenList);
	}

}
