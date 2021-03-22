package tr_day31varargsstringbuilder;

public class C6_StringBuilder01 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder(); //Bos bir SB olusturur
		System.out.println("sb1 : " + sb1);
		
		StringBuilder sb2 = new StringBuilder("Mehmet"); //Icinde "Mehmet" degeri olan bir SB uretir
		System.out.println("sb2 : " + sb2);
		
		StringBuilder sb3 = new StringBuilder(10); //10 karakter kapasitesi olan bir SB uretir
		System.out.println("sb3 : " + sb3);
		
		sb1.append(" Hoca");
		System.out.println("sb1 append: " + sb1);//sb1 append:  Hoca
		
		sb2.append(" Hoca");
		System.out.println("sb2 append: " + sb2);//sb2 append: Mehmet Hoca
		
		sb3.append(" Hoca");
		System.out.println("sb3 append: " + sb3);//sb3 append:  Hoca
		
		System.out.println("sb1 uzunluk " + sb1.length());//5
		System.out.println("sb1 capacity " + sb1.capacity());//16, bir deger yazmadigimiz icin default kapasite 16
		
		System.out.println("sb2 uzunluk " + sb2.length());//11
		System.out.println("sb2 capacity " + sb2.capacity());//22, ilk basta biz 6 olusturduk 16 da default deger
		
		System.out.println("sb3 uzunluk " + sb3.length());//5
		System.out.println("sb3 capacity " + sb3.capacity());//10 basta 10 kapasite verdigimiz icin dolana kadar 10 u kullanir
		
		// capacity hafiza yonetimi icin onemli cok onemli
		// koda yazilirken sabit uzunluk ve maksimum uzunluk belli ise
		// 3.method ile olusturarak HAFIZA KULLANIMINI optimize edebiliriz

	}

}
