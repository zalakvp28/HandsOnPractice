package org.java.collection;

public class Student implements Comparable<Student>{
	int rollno;
	int age;
	String name;
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Student st)
	{
		if(age == st.age)
		{
			return 0;
		}
		else if(age > st.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
