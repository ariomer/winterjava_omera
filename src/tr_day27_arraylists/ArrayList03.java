package tr_day27_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir tam sayi alin
		// aldigini sayidan kucuk olan fibonacci dizisi elemanlarini yazdirin
		// 1 1 2 3 5 8 13 21 34 55.....
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir pozitif tamsayi giriniz..");
		int sayi=scan.nextInt();
		
		List<Integer> fibo = new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		System.out.println(fibo);//[1, 1]
		System.out.println(fibo.get(0)+fibo.get(1)); //2

		for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayi; i++) {
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
		}
		System.out.println(fibo);
		
		scan.close();
	}
}
