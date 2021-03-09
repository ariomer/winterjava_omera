package tr_day21_scope;

public class Scope4 {

	public static void main(String[] args) {
		
		int sayi=10;
		//1-Bir method icinde olusturulan variable, sadece o method icinde kullanilabilir
		//1-System.out.println(isim);
		
		int sayi2; //2- bir local variable deger atanmadan da olusturulabilir
		//2- System.out.println(sayi2); ancak ilk deger atamasi yapilmayan variable'lar kullanilamaz
		//2- sayi2++; ilk deger atanmadigi icin artirma ve azaltma yapilamaz
		//2- Java deger atamasi olmadan local variable olusturulmasina izin verir, ilerde deger atanacak diye bekler
		
		sayi2=15;//2- Olusturmasi ayri satirda(11.satir), deger atamasi ayri satirda (16.satir) yapilabilir
		
		//3- Birden fazla method'un oldugu Class'larda her method'da kullanmamiz gereken
		//3- ortak variable'lar varsa Class level'da variable olusturmaliyim
		//3- ortak variable Class'in yapisina bagli olarak instance veya static olabilir

	}
	
	public static void staticMethod() {
		
		String isim="Hasan";
		//1- System.out.println(sayi); bu kurala main method icerisinde olusturulan variable'larda dahildir
	}
	
	public void method() {
		boolean isTrue=true;
		//1- System.out.println(sayi); bu kural static olan veya olmayan tum methodlar icin gecerlidir
	}

}
