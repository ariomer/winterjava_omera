package tr_day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Verilen bir array'de verilen bir elemanin var olup olmadigini nasil kontrol ederiz?
		
		int arr[] = {10,25,3,16,75};
		
		int sayi=15; 
		
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==sayi) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("Array sorulan elemani iceriyor");
		}else {
			System.out.println("Array sorulan elemani icermiyor");
		}
		
		// Arrays class'inda method kullanarak yapalim
		// Ilk once siralama yapmaliyiz
		Arrays.sort(arr); // ilk once sort yapmaliyiz [3,10,16,25,75]
		System.out.println(Arrays.binarySearch(arr, 10)); // sonuc olarak aranan sayinin index'ini doner
		
		// binarySearch sonuc olarak aradigimiz eleman varsa indexini verir
		// aradigimiz eleman yoksa - isaret ile olsaydi kacinci eleman olacagini dondurur
		
		int arr2[]= {12,15,25,14,3,12,65};
		Arrays.sort(arr2); //[3,12,12,14,15,25,65]
		System.out.println(Arrays.binarySearch(arr2, 14)); // 3.index
		System.out.println(Arrays.binarySearch(arr2, 20)); // -6 olsaydi 6. sirada olurdu
		System.out.println(Arrays.binarySearch(arr2, 12)); // 1. index
		
		// Array nasil String'e cevrilir
		
		String arrayString = Arrays.toString(arr2);
		System.out.println(arrayString);
		System.out.println(arrayString.substring(5));// bastaki [ parantez dahil tum array'i String'e cevirir
	}

}
