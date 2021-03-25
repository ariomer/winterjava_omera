package tr_day34_inheritance;

public class Encapsulation {
	
	private String okulIsmi = "Yildiz Koleji";
	private int okulHesapNo = 12345;
	private boolean okulAcikMi = true;

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public int getOkulHesapNo() {
		return okulHesapNo;
	}
	
	public boolean isOkulAcikMmi() {
		return okulAcikMi;
	}
	
	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi = okulIsmi;
	}
	
	public void setokulHesapNo(int okulHesapNo) {
		this.okulHesapNo = okulHesapNo;
	}
	
	public void setokulAcikMi(boolean okulAcikMi) {
		this.okulAcikMi = okulAcikMi;
	}
}
