package com.java.generics;

public class GenericFunction {

	static <T> void genericsDisplay(T element)
	{
		System.out.println(element.getClass().getName() + " = " + element);
	}
	
	public static void main(String[] args) {
		genericsDisplay(28);
		
		genericsDisplay("Zalak");
		
		genericsDisplay(1.0);
	}
}
