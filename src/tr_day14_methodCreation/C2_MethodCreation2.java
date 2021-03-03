package tr_day14_methodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
		//Bir methodu calistirmak icin main methodun icinde cagirmamiz gerekir
		//Bir methodu cagirmak icin ise mathod adini ve parametrelere uygun
		//argument'leri yazmaliyiz
		ortalama(85.2,90.3);
	}
	
	// bir method olusturmak istedigimizde Class'in icinde ama main method'un disinda
	// bir alanda olusturmaliyiz. Genel kullanim method'lar main method'dan sonra olur
	
	public static void ortalama(double sayi1, double sayi2) {
		System.out.println("girdiniz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
		//Bir method'u o methodu calistirmak icin yeterli degildir
		//olusturulan method main method icinden cagirilinca calisir
	}

}
