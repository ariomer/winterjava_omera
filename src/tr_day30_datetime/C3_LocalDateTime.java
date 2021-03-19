package tr_day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);//2021-03-19T20:09:36.526085300
		
		System.out.println(ldt.toString());//2021-03-19T20:09:36.526085300
		
		String time = ldt.toString();
		
		System.out.println(time.startsWith("2021"));//true

	}

}
