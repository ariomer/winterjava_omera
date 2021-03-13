package tr_day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
	public static void main(String[] args) {
		/*
		 * 1- Ic Icice array olusturdugumuzda disardaki ana array弾 outer array
		 *  icerdeki kucuk array値ere ise inner array denir
		 * 2- Eger icerdeki array値erin boyutlari birbirinden farkli ise 
		 *  Array段 ancak tum elemenlari yazarak declare edebiliriz
		 * 3- Multi dimensional array壇e bir elemanin indexi icin 
		 *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
		 */
		
		
		int arr[][] = {{1,3,5},{3,5},{5,9,11,3}}; // iki katli bir array壇ir
		
		//11'i idex ile ifade etmek istersek arr[2][2]
		
		// eger Array段 uzunlukla declare etmek istersek inner array uzunluklari esit olmali
		
		int arr2[][] = new int [3][2];
		// [3] ilk yazilan sayi outer array段n icinde kac tane inner array oldugunu belirtir
		// [2] her bir inner array段n uzunlugu 
		
		System.out.println(Arrays.toString(arr2));
		
		// Multidimensional array値eri yazdirmak icin toString method置 kullanilamz
		// Cunku toString method置 outer methodu String弾 cevirir
		// outer array段n icinde inner array値er oldugundan toString method置nda inner array値erin 
		// referans degerlerini yazdirilir
		
		System.out.println(Arrays.deepToString(arr2));
		
	}
}
