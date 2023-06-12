package com.rakib.object_class;

public class arithmaticOperator {
	
	public int performAddition ( int a, int b )
	{
		return a + b;
	}
	
	public int performSubstruction ( int a, int b )
	{
		return a - b;
	}
	
	public static void main(String[] args) {
		arithmaticOperator calculator = new arithmaticOperator();
		
		System.out.println(calculator.performAddition(5, 3));
		System.out.println(calculator.performSubstruction( 7, 6 ));
	
		
	}

}
