package org.java.solution;

public class Student implements Comparable<Student>{

	private String lastName;
	private String firstName;
	private int id;
	private Department department;

	public Student(String lastName, String firstName, int id, Department department) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.id = id;
		this.department = department;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", id=" + id + ", department="
				+ department + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.department.getName().compareTo(o.department.getName())== 0){
			return this.getLastName().compareTo(o.getLastName());
		} else {
			return this.department.getName().compareTo(o.department.getName());
		}
	}

}
