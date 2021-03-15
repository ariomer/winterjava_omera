package tr_day26_arraylists;

import java.util.Arrays;

public class C1_Array01 {

	public static void main(String[] args) {
		
		// Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip,
		// kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
		
		int arr[] = {2,3,5,3,6,4,3,6,7};
		int sayi = 3;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==3) {
				count++;
			}
		}
		
		int arr2[] = new int[arr.length-count];
		int k = 0;
		for (int j = 0 ; j < arr.length; j++) {
				if(arr[j]!=sayi) {
					arr2[k] = arr[j];
					k++;
					
				}
			}
		System.out.println(Arrays.toString(arr2));
	}

}
