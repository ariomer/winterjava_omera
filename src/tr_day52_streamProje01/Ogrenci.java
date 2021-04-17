package tr_day52_streamProje01;

public class Ogrenci {
	
	private String ad;
	private String soyAd;
	private int yas;
	private double diploamaNotu;
	private String cinsiyet;

	public Ogrenci(String ad, String soyAd, int yas, double diploamaNotu, String cinsiyet) {
		super();
		this.ad = ad;
		this.soyAd = soyAd;
		this.yas = yas;
		this.diploamaNotu = diploamaNotu;
		this.cinsiyet = cinsiyet;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public double getDiploamaNotu() {
		return diploamaNotu;
	}

	public void setDiploamaNotu(double diploamaNotu) {
		this.diploamaNotu = diploamaNotu;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	@Override
	public String toString() {
		return  "ad =" + ad + '\'' +
				", soy Ad =" + soyAd + '\'' +
				", yas =" + yas + 
				", diploama Notu=" + diploamaNotu + 
				", cinsiyet=" + cinsiyet + '\'';
	}

	

}
