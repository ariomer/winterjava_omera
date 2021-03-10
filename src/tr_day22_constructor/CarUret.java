package tr_day22_constructor;

public class CarUret {
	//su anda bu class'da gorunur bir constructor yok
	//bir class olusturuldugunda Java bu class'dan object uretilecegini bilir
	//ve gorunmeyen DEFAULT CONSTRUCTOR'i Class'a yerlastirir
	//default constructor parametresizdir dolasiyla sadece hic bir ozelligi tanimlanamayan
	// objectler uretir(tisort uret)
	//default constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir
	
	// eger biz sonradan bir constructor yazarsak, Java default consructor'i iptal eder
	
	//Bir constructor olusturalim
	
	public CarUret(){
		
	}
	//Kurallar 1- ismi class ile ayni olmalidir (dolayisiyla buyuk harf ile baslar)
	//		   2- Constructor return type'a sahip degildir
	//		   3- Constructor isminden sonra mutlaka parantez olur () ama parametre olmasi opsiyoneldir
	//         4- Bir constructor olusturuldugunda kimlerin kullanabilecegini belirlemek icin access modifier yazilir
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	//Bir programda cok fazla uretecegimiz objectler icin bir tane class olusturuluz
	//Bu Class'da olusturulacak objectlere ait tum ozellikler olur
	//Bu class direk calistirilmayacagi icin main method olmasa da olur
	//(Kaliphane gibidir)
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");		
	}
	
	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir.");
	}

}
