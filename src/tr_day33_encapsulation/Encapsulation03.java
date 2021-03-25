package tr_day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 class'indaki class member'a ulasmaya calisalim
		
		Encapsulation02 obj1 = new Encapsulation02();
		Encapsulation02 obj2 = new Encapsulation02();
		
		//Biz erisim yetksini ikiye ayiriyoruz
		// 1- Okuyabilme
		// 2- Degistirip kullanabilme set() 
		
		System.out.println(obj1.sayi); // 100 public oldugun hem okudum
		obj1.sayi=25;                  // hem de deger atayabildim
		System.out.println(obj1.sayi); //25
		System.out.println(obj2.sayi); //100
		
		System.out.println(obj1.getOkulIsmi()); // Yildiz Koleji, get method'u oldugu icin sadece bilgi verir
		
		obj1.setHesapNo(546789);
		obj1.setTcNo("3264578448");
		//System.out.println(obj1.setTcNo("3264578448")); set() methodu okumaya izin vermez
		
		
		// Bir Calss içinde class member oluşturuken bunu diğer class lar ile
		// ne oranda paylaşacağımıza karar veririz
		// 1- Herkes okuyabilsin ve obje üzerinden değer atayıp kullanbilsin ==> public
		// 2 - Herkes okuyabilsin ama kimse obje uzerinden de olsa değiştiremesin Private ==> Public get();
		// 3 - Ilk atadığım değeri kimse goremesin Private ==> Public set ()
		
		

	}

}
