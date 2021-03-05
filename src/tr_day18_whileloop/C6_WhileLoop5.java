package tr_day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// Verilen sayinin asal olup olmadigini bulan program yazin
		// asal sayi : 1 ve kendisi disinde hicbir pozitif tamsayiya bolunmeyen
		
		int sayi = 50;
		String flag = "Asal"; //flag bizim istedigimiz sartin gerceklesip gerceklesmedigini kontrol eder
		int bolen = 2;
		while (bolen<sayi) {
			if(sayi%bolen==0) {
				flag="Asal sayi degil";
			}
			
			bolen++;
		}
		System.out.println(flag);
		

	}

}
