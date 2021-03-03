package tr_day14_methodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {

		ortalama(80,60);//2.yi calistirir ve sonuc olarak 70 verir
		ortalama(80,60,55);//1.yi calistirir ve sonuc olarak 65 verir

	}

	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		System.out.println("girdiniz uc sayinin ortalamasi : " + (sayi1 + sayi2 + sayi3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {
		System.out.println("girdiniz iki sayinin ortalamasi : " + (sayi1 + sayi2) / 2);
	}
}
