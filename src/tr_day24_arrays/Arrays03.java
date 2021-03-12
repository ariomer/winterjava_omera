package tr_day24_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		/*
		 * Soru1: Verilen bir array'in tum elemanlarini
		 * toplayan bir program yazin
		 */
		
		int arr[] = {10,15,2,45,78};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		//verilen array'in tum elemanlarini toString metodu olmadan yazdirin
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
