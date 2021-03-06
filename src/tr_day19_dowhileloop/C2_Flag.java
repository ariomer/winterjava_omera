package tr_day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// Kullanicidan bir cumle alin, while loop kullanarak
		// Cumlede buyuk var mi yok mu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		int index = 0;
		String flag = "Cumlede buyuk harf yok";
		while(index<cumle.length()) {
			if(cumle.charAt(index)>='A' && cumle.charAt(index)<='Z') {
				flag="Cumlede buyuk harf var";
			}
		index++;
		}
		System.out.println(flag);
	scan.close();
	}
}
