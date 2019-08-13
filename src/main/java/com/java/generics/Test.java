package com.java.generics;

public class Test <T>
{
	T obj;

	public Test(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}
	
	
}
