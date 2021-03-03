package day11whileloopdowhileloop;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 	For the String "1234_?!abcdef", type a code to count the number of letters,
	 		the number of digits and the number of others by using do-while loop
		 */
		
		String str = "1234_?!abcdef";
		int i = 0;
		int l = 0;
		int n = 0;
		int o = 0;
		do {
			char c = str.charAt(i);
			if((c>='A' && c<='Z') || (c>='a' && c<='z')) {
				l = l + 1;
				i++;
			}else if(c>= '0' && c<='9') {
				n = n + 1;
				i++;
			}else {
				o = o + 1;
				i++;
			}
		}while(i<str.length());
		System.out.println("Numbers:" + n);
		System.out.println("Letters:" + l);
		System.out.println("Others:" + o);

	}

}
