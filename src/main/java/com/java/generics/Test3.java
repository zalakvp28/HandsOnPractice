package com.java.generics;

public class Test3<T,U> {

	T obj1;
	U obj2;
	public Test3(T obj1, U obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
	
}
