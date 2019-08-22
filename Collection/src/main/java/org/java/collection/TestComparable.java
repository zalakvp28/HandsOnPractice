package org.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		
		arr.add(new Student(67,"Zalak", 27));
		arr.add(new Student(68,"Urvish",28));
		arr.add(new Student(42,"Chirag",25));
		arr.add(new Student(31,"Jaymil",27));
		
		Collections.sort(arr);
		
		for(Student st : arr)
		{
			System.out.println(st.rollno + " " + st.name + " " + st.age );
		}
		
	}
}
