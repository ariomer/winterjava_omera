package tr_day16_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanicidan pozitif bir sayi alin
        // 1'den kullanicinin girdigi sayiya kadar olan tum tamsayilarin 
        // toplamini yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Pozitif 1 tamsayi girin lutfen");
		int sayi1 = scan.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<=sayi1;i++) {
			sum =sum+i;
		}System.out.println(sum);
		
		scan.close();

	}

}
