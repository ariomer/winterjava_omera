package tr_day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// Kullanicidan degerler alarak int bir array olusturun
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Array icine kat tane deger gireceginizi belirtiniz");
		int uzunluk = scan.nextInt();
		int i = 0;
		int arr[]= new int[uzunluk];
		do {
			System.out.println("Lutfen bir sayi giriniz");
			arr[i]= scan.nextInt();
			i++;
		}while(i<uzunluk);
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
}
