package org.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Zalak");
		hs.add("Surbhi");
		hs.add("Toral");
		hs.add("Shreeya");
		hs.add("Brinda");
		hs.add("Toral");
		hs.add("Nisha");
		
		//System.out.println(hs);
		
		System.out.println("The HashSet list is: ");
		System.out.println("--------------------");
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		//Check if HashSet empty or not?
		System.out.println("Does hs list is empty or not? -> " + hs.isEmpty());
		
		//Remove the element from a list
		System.out.println();
		System.out.println("The element 'Surbhi' has been removed from the list: " + hs.remove("Surbhi"));
		
		// Size of list
		System.out.println();
		System.out.println("The size of list is: " + hs.size());
		
		// Copy set content to another HashSet
		HashSet<String> subset = new HashSet<String>();
		
		subset.add("Jaymil");
		subset.add("Chirag");
		subset.add("Aakash");
		
		hs.addAll(subset);
		
		System.out.println();
		System.out.println("The HashSet list after adding other content in a list: ");
		System.out.println("------------------------------------------------------");
		
		Iterator<String> it = hs.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println();

		//Copy all elements from HashSet to an Array
		String arr[] = new String[hs.size()];
		hs.toArray(arr);
		
		System.out.println("Copied array content: ");
		System.out.println("---------------------");
		
		for(String str : arr)
		{
			System.out.println(str);
		}
		
	}
}
