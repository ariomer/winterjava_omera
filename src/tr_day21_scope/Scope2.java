package tr_day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		//Static variable'lar icin object olusturma ihtiyaci yoktur
		//Baska bir Class'dan static variable'lara ulasmak istedigimizde
		//ulasmak istedigimiz Class'in adi .static variable adi yazmamis yeterlidir
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);// Java Run Time programdir.
										  // Scope2 Class'i calistirildiginda Scope1 calismazzz
		                                  // dolayisiyla en basta olusturulan veya atanan degerler gecerli olur
		
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulAdi);// Mehmet Koleji
		
		Scope1.staticMethod();//1201 Mehmet Koleji false
		System.out.println(Scope1.okulId);//1203 
		System.out.println(Scope1.okulAdi);//Mehmet Koleji

	}

}
