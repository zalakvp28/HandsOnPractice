package com.java.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		Container<Integer, String> generics = new Container<Integer, String>(27, "Zalak");
		
		//int val1 = generics.getItem1();
		//String val2 = generics.getItem2();
		
		//System.out.println(val1);
		//System.out.println(val2);
		
					//OR
		
		generics.printItems();
		
		Container<Double, Integer> generics1 = new Container<Double, Integer>(27.0, 9);
		generics1.printItems();
		
		Set<String> mySet = new HashSet<String>(); 
		
		mySet.add("Surbhi");
		mySet.add("Toral");
		mySet.add("Jaymil");
		
        Set<String> mySet2 = new HashSet<String>(); 
		
		mySet2.add("Surbhi");
		mySet2.add("Toral");
		mySet2.add("Brinda");
		
		Set<String> resultSet = union(mySet,mySet2);
		
		//System.out.println(resultSet);
		
		Iterator<String> itr = resultSet.iterator();
		
		while(itr.hasNext()) {
			
			/*
			 * String var = itr.next(); 
			 * System.out.println(var);
			 */
			System.out.println(itr.next());
		}
		
}
	
	// Generic Method
	public static <E> Set<E> union(Set<E> i1, Set<E> i2){
		Set<E> result = new HashSet<E>(i1);
		result.addAll(i2);
		return result;
	}
}
