package tr_day51_streamOrnekler;

import java.util.stream.IntStream;

public class Stream05Digerleri {

	public static void main(String[] args) {
		
		System.out.println("Toplam : " + topla(4));
		System.out.println("Toplam : " + topla1(4));
	}
	
	// ORNEK25: 1'den belirtilen degere kadar olan tamsayilari toplayan ve sonucu dondoren metodu yaziniz
	
	public static int topla(int deger) {
		
		return IntStream.range(1, deger).sum(); // deger dahil degil
	}
	
	public static int topla1(int deger) {
		return IntStream.rangeClosed(1, deger).sum(); // deger dahil
	}

}
