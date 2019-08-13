package com.java.generics;

public class Test2 {
	
public static void main(String[] args) {
	Test<Integer> i = new Test<Integer>(28);
	System.out.println(i.getObj());
	
	Test<String> s = new Test<String>("Zalak");
	System.out.println(s.getObj());
}
}
