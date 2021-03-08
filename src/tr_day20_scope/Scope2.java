package tr_day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		// farkli class'lardan da Scope1 class'ina object olusturarak erisilebilir
		
		Scope1 obj4 = new Scope1();
		System.out.println(obj4.isim);
		System.out.println(obj4.soyisim);
		obj4.isim="Ahmet";
		obj4.soyisim="Can";
		System.out.println(obj4.isim + " " + obj4.soyisim);

	}

}
