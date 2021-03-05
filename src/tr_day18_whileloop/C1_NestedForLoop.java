package tr_day18_whileloop;

import java.util.Scanner;

public class C1_NestedForLoop {

	public static void main(String[] args) {
		/*
		 	Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim tablosu olusturun.
		 	Ornek,kullanici 3 girerse,
			 1 2 3
			 2 4 6
			 3 6 9
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int num = scan.nextInt();
		
		for(int i=1; i <=10; i++) {
			System.out.println(num + "x" + i + "=" + (num*i));
		}
		
		for(int j=1; j<=num; j++) {
			System.out.println("");
			for(int k=1; k<=num; k++) {
				System.out.print(k*j+" ");
			}
		}
		scan.close();
	}

}
