package tr_day33_Encapsulation;

import tr_day20_scope.Scope1;
import tr_day21_scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		// OOP concept
		// Object Oriented Programing
		// Bir proje kapsamindaki class'larda olusturulan variable ve method'larin
		// baska class'larda tekrar tekrar yazilmamasi, var oldugu class'dan object uretilerek
		// bu variable ve method'larin istendigi kadar kullanilmasidir.(reusability)
		// Write once reuser anywhere
		
		// Scope6 class'indaki variable ve methodlara ulasmak istiyorum
		// bunun icin Scope6 class'indan object uretmeliyiz
		
		Scope6 obj1 = new Scope6();
		// esitligin sol tarafi declaration
		// declaration 2 parcadir ilk parca Data turu, ikinci kisim isim
		// non-primitive'ler icin data turu ayni zamanda class ismi olabilir
		// esitiligin saginda ise deger, 2 parcadan olusur
		// new ketword'u, ikincisi de constructor
		// hangi class'tan object uretmek istersek o class'in constructor'ini kullaniriz
		obj1.num1 = 10;
		System.out.println(obj1.num1); //10
		obj1.add();
		
		//deneme() main method icinden cagirabilir miyim?
		//deneme() method'u static olmadigi icin main method'dan direk cagirilamaz
		//bunun yerine icinde oldugumuz class'dan bir object uretip onun uzerinden 
		//static olmayan method'lari cagirabiliriz
		Encapsulation01 obj3 = new  Encapsulation01();
		obj3.deneme();
 	}
	
	public void deneme() {
		// Projemiz kapsaminda bulunan tum class'lardan
		// public variable ve method'lara istedigim yerden object ureterek ulasabilirim
		// eger ulasmak istedigim class uyeleri(class members) public degilse baska
		// package'lerden ulasmak icin ekstre islem yapmam gerekir
		Scope1 obj2 = new Scope1();
		obj2.isim="Ahmet";
		obj2.soyisim="Ozcelik";
		obj2.sayi=20;
		obj2.method();
		
		// Istedigimiz class'dan object uretip oradaki public class uyelerine ulasabilirim...
	}
	

}
