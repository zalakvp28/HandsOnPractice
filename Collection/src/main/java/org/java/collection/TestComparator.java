package org.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee(67,"Zalak", 27));
		al.add(new Employee(68,"Urvish",28));
		al.add(new Employee(42,"Chirag",25));
		al.add(new Employee(31,"Jaymil",27));
		
		System.out.println("Sorting by Names: ");
		System.out.println("-----------------");
		
		Collections.sort(al, new NameComparator());
		
		for(Employee e1 : al)
		{
			System.out.println(e1.id + " " + e1.name + " " + e1.age);
		}
		
		System.out.println();
		System.out.println("Sorting by Ages: ");
		System.out.println("----------------");
		
		Collections.sort(al, new AgeComparator());
		
		for(Employee e1 : al)
		{
			System.out.println(e1.id + " " + e1.name + " " + e1.age);
		}
	}
}
