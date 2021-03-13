package tr_day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Array (Dizi):Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
		// Arrayolusturulurken 2 seyi declare etmeliyiz: 1-data type(Bir array in icerisinde
		// sadece ayni data tipinden elemanlar olabilir. 2-uzunluk (uzunluk array'in icerisinde konulacak 
		// max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
		
		int arr[] = {10,23,54}; // length=3
		String isimler[]=new String[4]; // length=4 olan bos bir array olusturur
		
		// Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
		// Mesela isimler array'in icinde isim degerleri degil, isimlerin referanslari olur
		
		//array'in elemanlarina ulasma ve update etme
		isimler[2]="Boss";
		isimler[0]="Elveda";
		
		// Array'in tum elemanlari yazdirma
		System.out.println(Arrays.toString(isimler));
		
		//method kullanmadan tum elemanlari yazdiralim
		// loop kullanmamiz lazim
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i]+ " ");
		}
		System.out.println();
		
		//Array'in elemanlarini nasil siralayabiliriz
		isimler[1]="Oguzhan";
		isimler[3]="bilal";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));

	}

}
