package com.java.generics;

public class Test4 {

	public static void main(String[] args) {
		Test3<String, Integer> si= new Test3<String, Integer>("Zalak", 28);
		
		si.print();
	}
}
