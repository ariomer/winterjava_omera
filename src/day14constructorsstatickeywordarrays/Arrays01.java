package day14constructorsstatickeywordarrays;

import java.util.Arrays;

public class Arrays01 {
	
	/*
	 	1)To store multiple values, we need "Arrays"
	 	2)An array can have just a single data type
	 	  If you decide to store integer into an array, you can store just integers not the others.
	 	3)Arrays accept just "primitive data types" as elements, when you put "String" in an array, Java stores
	 	  their "references" inside the array, not the String itself.
	 */

	public static void main(String[] args) {
		
		/*
		 	How to create an array
		 	1)Decide which data type will you store
		 	2)Put a name for the array
		 	3)After the name put"[]"
		 	4)Use "new" keyword
		 	5)Put the data type again with brackets => []
		 */
		int array1[] = new int[5];
		array1[0] = -2;
		array1[1] = 11;
		array1[2] = 27;
		array1[3] = 33;
		array1[4] = 22;
		System.out.println(Arrays.toString(array1));
		
		//Second way to create and assign values
		String array2[] = {"Ali", "Can", "Kemal", "Mary"};
		System.out.println(Arrays.toString(array2));
		
		//How to update an element
		array2[1] = "Canan";
		System.out.println(Arrays.toString(array2));
		
		//How to add elements more than size
		//If you are try to add elements more than the size of the array, you will get run time error
//		array2[4] = "Angie";
//		System.out.println(Arrays.toString(array2));
		
		//Update all elements to "Joe";
		//In Stings length method is used with () like "length()"
		//In Arrays length method is used without () like "length"
		for(int i = 0; i<array2.length; i++) {
			array2[i] = "Joe";
		}
		System.out.println(Arrays.toString(array2));
		
		//How to print array1 elements one by one on the console in different lines
		for(int i = 0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		int k = 0;
		while(k<array1.length) {
			System.out.println(array1[k]);
			k++;
		}
		
		//How to find the sum of all "array1" elements
		int j = 0;
		int sum = 0;
		do {
			sum = sum + array1[j];
			j++;
		}while(j<array1.length);
		System.out.println("the sum of element is " + sum);
		
		//Replace "*" for the character all 'J' in array2
		for(int a=0; a<array2.length; a++) {
			array2[a] = array2[a].replace("J", "*");
		}
		System.out.println(Arrays.toString(array2));
		
	}

}
