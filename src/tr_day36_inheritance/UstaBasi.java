package tr_day36_inheritance;

import java.util.ArrayList;
import java.util.List;

public class UstaBasi extends Isci{
	
	public String bolum="Takimhane";
	public int sorOldIsciSay=20;
	
	public static void main(String[] args) {
		
		UstaBasi ub1=new UstaBasi();
		//Object'i torun class'inda olusturunca 3 class'a da ulasabiliriz
		
		System.out.println(ub1.bolum); //Takimhane
		System.out.println(ub1.sorOldIsciSay); //20
		System.out.println(ub1.saatUcreti); //20
		System.out.println(ub1.isim); //Mehmet
		
		//List<String> list = new ArrayList<>();
		//Object str= new String("Hasan");
		
		Isci ub2=new UstaBasi();
		// Extends ile birbirine bagli olan classlarda IS-A relation olan
		// Data turleri istege bagli olarak kullanilabilir
		// Daha genis Data turu yazmanin avantaji:
		// Kapsamin daha genis olmasi
		// Daha genis Data turu yazmanin dezavantaji:
		// Data turu olarak sectigimiz class ve parent(larina) ait datalara ulasabiliriz
		
		System.out.println(ub2.departman); // Isci classindan
		System.out.println(ub2.izindeMi); //Personel classindan
		
		
		Personel ub3=new UstaBasi();
		System.out.println(ub3.id); //Personel classindan
		
		
	}

}
