package day15arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		//=====split()======
		/*
		 	split() is used to split a String by using specific character/s
		 	split() puts the elements in an array
		 */
		
		String s = "I like Java but Java need to study hard to learn so I will study hard";
		
		String part1[] = s.split("Java");
		System.out.println(Arrays.toString(part1));//[I like ,  but ,  need to study hard to learn so I will study hard]
		//How to split String as word?
		String part2[] = s.split(" ");
		System.out.println(Arrays.toString(part2));
		//How to find the number of words?
		System.out.println(part2.length);//16
		
		//How many characters except for space that are used in String s by using split()?
		String part3[] = s.replace(" ", "").split("");
		System.out.println(Arrays.toString(part3));
		System.out.println(part3.length);
		
		//Count how many times "a" is used in the string
		String part4[] = s.split("a");
		System.out.println(Arrays.toString(part4));
		System.out.println(part4.length-1);//7
	}

}
