package org.java.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		
		list.add(new Student("Zimnaky","Catherine",107, new Department("IT")));
		list.add(new Student("Burucel","Irina",147,new Department("CS")));
		list.add(new Student("Ferries","Jennifer",106,new Department("EC")));
		list.add(new Student("Haggerty","Sean",111,new Department("Mech")));
		list.add(new Student("Paul","Katie",136,new Department("IT")));
		
		Collections.sort(list);
		
		
		//list.forEach(System.out::println);
		
		for (Student student : list) {
			
			System.out.println("Department = " + student.getDepartment() + "Lastname = " + student.getLastName());
		}
	}

}
