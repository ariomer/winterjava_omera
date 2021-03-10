package tr_day22_constructor;

public class ParametreliConstructor {

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	public ParametreliConstructor(int yil) {
		this.yil = yil;
	}
	public ParametreliConstructor() {
		
	}
	public ParametreliConstructor(String marka, String model) {
		this.marka=marka;
		this.model=model;
	}
	public ParametreliConstructor(String marka, String model,int yil, boolean kazasiVarMi) {
		this.marka=marka;
		this.model=model;
		this.yil=yil;
		this.kazasiVarMi=kazasiVarMi;
	}
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");		
	}
	
	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir.");
	}

}
