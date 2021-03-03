package day10forloops;

public class ForLoopHomework {

	public static void main(String[] args) {
		printTenToFiftySeven();
		System.out.println();
		printEven100To43();
		System.out.println();
		printOdd200To33();
		System.out.println();
		printAdd23To57();
		System.out.println();
		printMulti7To15();
		System.out.println();
		printDiv5Less200();
	}
	
	//1) Write a program to print counting numbers from 10 to 57 on the console by using for-loop.
	
	public static void printTenToFiftySeven() {
		for(int i=10; i<=57; i++) {
			System.out.print(i + " ");
		}
	}
	
	//2) Write a program to print even counting numbers from 100 to 43 on the console by using for-loop.
	
	public static void printEven100To43() {
		for(int i=100; i>=43; i--) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
	}
	
	//3) Write a program to print odd counting numbers from 200 to 33 on the console by using for-loop.
	
	public static void printOdd200To33() {
		for(int i=100; i>=43; i--) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
	}
	
	//4) Write a program to add counting numbers from 23 to 57 by using for-loop.
	
	public static void printAdd23To57() {
		int sum = 0;
		for(int i=23; i<=57; i++) {
			sum = sum + i;	
		}
		System.out.println(sum);
	}
	
	//5)Write a program to multiply counting numbers from 7 to 15 by using for-loop.
	
	public static void printMulti7To15() {
		int multi = 1;
		for(int i=7; i<=15; i++) {
			multi = multi + i;	
		}
		System.out.println(multi);
	}
	
	//6)Write a program to print counting numbers which are less than 200 and divisible by 5 On the console by using for-loop.
	public static void printDiv5Less200() {
		for(int i=0; i<=200; i++) {
			if(i%5==0) {
				System.out.print(i + " ");
			}
		}
	}
}
