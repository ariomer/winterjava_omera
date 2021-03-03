package day03wrapperclassconcatenatelogicaloperators;

public class WrapperClss01 {
	
	/*
	 Wrapper class ; Java created some objects whose values are coming from primitive data types
	 but the objects have methods as well.
	 
	 Wrapper for boolean ==> Boolean
	 !!!!Wrapper for char ==> Character
	 Wrapper for byte ==> Byte
	 Wrapper for short ==> Short
	 !!!!Wrapper for int ==> Integer
	 Wrapper for long ==> Long
	 Wrapper for float ==> Float
	 Wrapper for double ==> Double
	 */

	public static void main(String[] args) {
		
		Integer i = 12;
		
		//Find the min and maximum of byte of data type:
		
		Byte minByteValue = Byte.MIN_VALUE;
		System.out.println(minByteValue);
		
		Byte maxByteValue = Byte.MAX_VALUE;
		System.out.println(maxByteValue);
		
		//Find the min and maximum of long of data type:
		
		Long minLongValue = Long.MIN_VALUE;
		System.out.println(minLongValue);
		
		Long maxLongValue = Long.MAX_VALUE;
		System.out.println(maxLongValue);

	}

}
