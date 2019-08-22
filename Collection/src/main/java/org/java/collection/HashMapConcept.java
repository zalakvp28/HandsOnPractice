package org.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapConcept {
	public static void main(String[] args) {
		
		/* This is how to declare HashMap */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		/*Adding elements to HashMap*/
		hmap.put(28, "Zalak");
		hmap.put(2, "Toral");
		hmap.put(33, "Shreeya");
		hmap.put(15, "Brinda");
		hmap.put(13, "Surbhi");
		hmap.put(26, "Nisha");
		
		/* Display content using Iterator*/
		Set set = hmap.entrySet();
		Iterator itr = set.iterator();

		while(itr.hasNext())
		{
			Map.Entry e = (Map.Entry)itr.next();
			System.out.println("Key is: " + e.getKey() + " and Value is: " + e.getValue());
		}
		
									//OR
		
		//for(Map.Entry pairEntry : hmap.entrySet())
		//{
		//	System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
		//}
		
		/* Get values based on key*/
		System.out.println();
		System.out.println("The value at index 2 is: " + hmap.get(2));
		
	    /* Remove values based on key*/
		System.out.println();
		System.out.println("The value removed at index 1 is: " + hmap.remove(1)); // null
		
		System.out.println();
		System.out.println("The value removed at index 28 is: " + hmap.remove(28)); 
		
		System.out.println();
		System.out.println("List after remove an element 28 from map: ");
		System.out.println("-----------------------------------------");
		
		for(Map.Entry pairEntry : hmap.entrySet())
		{
			System.out.println("Key is: " + pairEntry.getKey() + " and Value is: " + pairEntry.getValue());
		}
		
		// Check if a HashMap is empty
		System.out.println();
		System.out.println("Is Hmap list empty? -> " + hmap.isEmpty());
		
		// Find the size of a HashMap
		System.out.println();
		System.out.println("What is the size of Hmap? -> " + hmap.size());
		
		// Check if the key exist or not?
		System.out.println();
		System.out.println("Does a key 28 is exist or not in hmap list? -> " + hmap.containsKey(28));
		System.out.println("Does a key 33 is exist or not in hmap list? -> " + hmap.containsKey(33));
		
		// Check if the value exist or not?
		System.out.println();
		System.out.println("Does a value is exist or not in hmap list? -> " + hmap.containsValue("Zalak"));
		System.out.println("Does a value is exist or not in hmap list? -> " + hmap.containsValue("Toral"));
		
		// Get the value associated with a given key
		System.out.println();
		System.out.println("A value associated with key 15 is -> " + hmap.get(15));
		}
}
