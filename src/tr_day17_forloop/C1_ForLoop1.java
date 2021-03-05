package tr_day17_forloop;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int num = scan.nextInt();
		
		if(num<=0) {
			System.out.println("Please enter a positive number");
		}else {
			
			System.out.println("Please enter a threshold");
			int threshold = scan.nextInt();
			
			if(sumOfDigits(num)>threshold) {
				System.out.println("The number is bigger than your threshold");
			}else {
				System.out.println("The number is not bigger than your threshold");
			}
		}
		scan.close();
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		String num2 = num + ""; //int num'i Stringe cevirdik
		for(int i=1; i<num2.length(); i++) {
			sum += num%10;
			num = num/10;
		}
		return sum;
	}

}
