package tr_day18_whileloop;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// While : iken, oldugu surece
		// 10'dan 30'a kadar olan sayilardan 4 ile bolunebilenleri
		// aralarinda bir bosluk olacak sekilde yanyana yazdirin
		
		// For Loop
		
		for(int i=10;i<=30;i++) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		//While Loop
		int i = 10;
		while (i<=30) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
			i++;
		}
	}

}
