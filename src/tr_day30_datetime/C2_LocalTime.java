package tr_day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {

	public static void main(String[] args) {
		// Java'da saat ile islem yapmak icin
		// LocalTime class'indan object kullaniriz
		
		LocalTime saat = LocalTime.now();
		System.out.println(saat);//19:46:04.314119400
		
		for (int i = 0; i < 1000000; i++) {
			i+=1;
		}
		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2);//19:46:04.319119600
		
		System.out.println(saat.plusHours(15));//10:46:04.314119400
		
		System.out.println(saat.getSecond());//39
		
		System.out.println(saat.minusSeconds(1564548745));//15:07:01.126452200
		
		System.out.println(saat.now(ZoneId.of("GMT")));

	}

}
