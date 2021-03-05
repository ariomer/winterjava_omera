package tr_day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// Kullanicidan 40'den kucuk pozitif bir sayi alin
		// girilen sayinin faktoryelini hesaplayip yazdiran bir method olusturun
		// 6 ! = 1 * 2 * 3 * 4 * 5 *6 = 720
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive number that is less than 35");
		int num = scan.nextInt();
		
		if(num<=0 || num >=40) {
			System.out.println("Please enter a positive number between 0 and 35");
		}else {
			factorial(num);
		}
		scan.close();
	}

	public static void factorial(int num) {
		long fac = 1;
		for(int i=num;i>0;i--) {
			fac*=i;
		}
		System.out.println(fac);
	}

}
