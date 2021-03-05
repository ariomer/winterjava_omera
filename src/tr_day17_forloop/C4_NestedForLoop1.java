package tr_day17_forloop;

import java.util.Scanner;

public class C4_NestedForLoop1 {

	public static void main(String[] args) {
		/*
		 	Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
			  *
			  * *
			  * * *
			  * * * *
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++){
			System.out.println(" ");
			for(int j=0;j<i;j++) {
				System.out.print("* ");
		}
		}
		
		scan.close();
		
	}

}
