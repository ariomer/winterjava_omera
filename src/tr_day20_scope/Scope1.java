package tr_day20_scope;

import java.util.Scanner;

public class Scope1 {
	
	int sayi; //class'in icinde fakat main method'un disinda olusturulan
			  //ve satic olmayan variable'lara INSTANCE(Object) variable denir
			  //class level'da olusturuldugu icin class'in her yerinden belli sartlarla kullanilabilir
			  //Instance variable'lar object'e bagli olarak calisir(ogretmenin adi)
	
	public String isim="Mehmet";
	public String soyisim;
	boolean izindeMi;
	char ilkHarf;

	public static void main(String[] args) {
		
		//System.out.println(sayi); // static olmayan bir variable'a static method icinden ulasamayiz
									// main method'umuz static oldugu icin main method icerisinden
		//method()					// static olmayan variable veya method'lara direk ulasamayiz
		
		// instance bir variable'a main method icerisinden ulasmak istedigimizde
		// OBJECT olusturmaliyiz
		
		Scanner      scan   =      new         Scanner(System.in);// bu javadaki standart object olusturma formudur
	//Class ismi   object ismi    keyword      Class ismi ()
		
		Scope1 obj1 = new Scope1();
		System.out.println(obj1.sayi);
		System.out.println(obj1.isim);
		System.out.println(obj1.soyisim);
		// instance variable'lar olusturuldugunda biz istersek deger atayabiliriz
		// instance variable'lara eger biz deger atamazsak java default deger atar
		
		Scope1 obj2 = new Scope1();
		obj2.isim="Muslum";
		obj2.soyisim="Baba";
		System.out.println(obj2.isim + " " + obj2.soyisim);// Muslum Baba
		System.out.println(obj1.isim + " " + obj1.soyisim);// Mehmet null
		System.out.println(obj2.izindeMi);// false
		System.out.println(obj2.ilkHarf);// space
		
		Scope1 obj3 = new Scope1();
		obj3.isim="Ferdi";
		obj3.soyisim="Tayfur";
		obj3.izindeMi=true;
		System.out.println(obj3.isim + " " + obj3.soyisim + " " + obj3.izindeMi);// Ferdi Tayfur true
		
		scan.close();
    }
	
	public static void staticMethod() {
		System.out.println("Static Method calisti");
	}
	
	public void method() {
		System.out.println(sayi);// bu method static olmadigi icin instance variablelara direk erisebilir
		sayi=sayi+20; // bu method icerisinde gecerli olmak uzere degerini degistirebilir
	}
   
}
