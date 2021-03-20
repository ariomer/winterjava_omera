package tr_day31varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		//verilen int'lardan ilki haric tum sayilari toplayin ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin
		
		toplama(2,5);
        toplama(5,10,15);
        toplama(4,5,9,7);
        toplama(5,6,8,10,45,78,-12);

	}
	
	public static void toplama(int sayi, int... var) { // data turunden sonra yazdigimiz ... varags kullanacagimiz anlamina geliyor
    	int sum = 0;
    	System.out.println("varags'a dahil olmayan argument : " + sayi); 
		for (int each : var) {
			sum += each;
		} 
    	int carpim = sayi * sum;
    	System.out.println(carpim);
	}

}
