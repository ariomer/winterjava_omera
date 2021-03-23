package tr_day33_Encapsulation;

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
		System.out.println(obj1.sayi);
		System.out.println(obj1.getOkulIsmi()); // Yildiz Koleji
		
		System.out.println(obj2.sayi); //100
		
		obj1.setHesapNo(546789);
		// Bir Calss içinde class member oluşturuken bunu diğer class lar ile
		// ne oranda paylaşacağımıza karar veririz
		// 1- Herkes okuyabilsin ve obje üzerinden değer atayıp kullanbilsin ==> public
		// 2 - Herkes okuyabilsin ama kimse obje uzerinden de olsa değiştiremesin Private ==> Public get();
		// 3 - Ilk atadığım değeri kimse goremesin Private ==> Public set ()
		
		

	}

}
