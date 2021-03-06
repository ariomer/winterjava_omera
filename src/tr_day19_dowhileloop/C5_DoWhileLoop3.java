package tr_day19_dowhileloop;

import java.util.Scanner;

public class C5_DoWhileLoop3 {

	public static void main(String[] args) {
		/*
         Soru 5 ) Kullanicidan bir sifre girmesini isteyin. 
         Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
         Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin 
         ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
       - Sifre kucuk harf icermelidir 
       - Sifre buyuk harf icermelidir
       - Sifre ozel karakter icermelidir
       - Sifre en az 8 karakter olmalidir.
        */
		Scanner scan=new Scanner(System.in);
		String sifre="";
		int sonuc=0;
		do {
			System.out.println("Lutfen sifrenizi giriniz");
			sifre = scan.nextLine();
			
			sonuc = 	kucukHarfVarMi(sifre) + 
						buyukHarfVarMi(sifre) + 
						ozelKarVarMi(sifre)   + 
						uzunlukUygunMu(sifre);
		}while(sonuc!=4);
		System.out.println("Sifreniz kabul edildi");
		scan.close();
	}

	public static int kucukHarfVarMi(String sifre) {
		int flagKucuk=0;
		int index=0;
		while(index<sifre.length()) {
			if(sifre.charAt(index)>='a' && sifre.charAt(index)<='z') {
				flagKucuk=1;
			}
		index++;
		}
		if (flagKucuk==0) {
			System.out.println("Sifre kucuk harf icermelidir");
		}
		return flagKucuk;
	}
	
	public static int buyukHarfVarMi(String sifre) {
		int flagBuyuk=0;
		int index=0;
		while(index<sifre.length()) {
			if(sifre.charAt(index)>='A' && sifre.charAt(index)<='Z') {
				flagBuyuk=1;
			}
		index++;
		}
		if (flagBuyuk==0) {
			System.out.println("Sifre bucuk harf icermelidir");
		}
		return flagBuyuk;
	}
	
	public static int ozelKarVarMi(String sifre) {
		int flagOzelKar=0;
		int index=0;
		while(index<sifre.length()) {
			if(sifre.charAt(index)>=' ' && sifre.charAt(index)<='/') {
				flagOzelKar=1;
			}
		index++;
		}
		if (flagOzelKar==0) {
			System.out.println("Sifre ozel karakter icermelidir");
		}
		return flagOzelKar;
	}
	
	public static int uzunlukUygunMu(String sifre) {
		int sonucUzunluk=0;
        if (sifre.length()<8) {
            System.out.println("sifre en az 8 karakter olmalidir");
        } else {
            sonucUzunluk=1;
        }
        return sonucUzunluk;
	}
}
