package tr_day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int sayi=10;
		int sayi1=20;
		int sayi3=30;
		String isim="Ali";
		
		// Java'da birden fazla elemani koyabilecegimiz (store) object'ler vardir.
		// Bugun bunlardan ilkini ogrenecegiz
		
		int arr[] = {10,20,30}; // int[] arr = {10,20,30};
		                        // Bu ornekte Array'in elemanlarini direk yazdigim icin
								// Uzunluk belirtmeye ihtiyac kalmadi
		System.out.println(arr);
		System.out.println(Arrays.toString(arr)); //[10, 20, 30]
		
		String takim[] = new String[5]; // [null, null, null]
		System.out.println(Arrays.toString(takim)); //[null, null, null]
		
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim)); //[Ali, null, null]
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim)); //[Ali, Veli, Hasan]
		
		//takim[3]="Mehmet"; //Java Run Time programdir. dolayisiyla array programi
						     //olusturulur. 36.satirda syntax olarak hata olmadiginda CTE olmaz.
							 // Program calistiginda 3.index olmadigi icin RTE verir
		
		// Array'deki bir elemani update etme
		takim[1]="Kemal";
		System.out.println(Arrays.toString(takim));
		
		// Bir Array'in uzunlugunu nasil bulabiliriz
		System.out.println(takim.length); //3
		
		//Array'deki son elemani Mehmet yapin
		takim[takim.length-1]="Mehmet";
		System.out.println(Arrays.toString(takim));
		
		// eger array'in eleman sayisi tek ise ortaki elemani Can yapalim
		
		if(takim.length%2==1) {
			int ortaIndex=(takim.length)/2;
			takim[ortaIndex]="Can";
			System.out.println(Arrays.toString(takim));
		}
	}

}
