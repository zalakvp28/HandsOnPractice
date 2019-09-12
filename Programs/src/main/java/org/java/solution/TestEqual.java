package org.java.solution;

import java.util.HashSet;
import java.util.Set;

public class TestEqual {

	private String name;
	private int id;

	public TestEqual(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "TestEqual [name=" + name + ", id=" + id + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestEqual other = (TestEqual) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	public static void main(String[] args) {
		
		TestEqual te = new TestEqual("Jim", 101);
		TestEqual te1 = new TestEqual("Zak", 201);
		
		System.out.println(te == te1);
		System.out.println(te.equals(te1));
		System.out.println(" ");
		
		Set<String> hs = new HashSet<String>();
		hs.add("Jim");
		
		Set<String> hs1 = new HashSet<String>();
		hs1.add("Jim");
		
		Set<String> hs2 = new HashSet<String>();
		hs2.add("John");
		
		Set<String> hs3 = new HashSet<String>();
		hs3.add("Lily");
		
		System.out.println("hashcode of hs"+ " "+ hs.hashCode());
		System.out.println("hashcode of hs"+ " "+hs1.hashCode());
		System.out.println(hs == hs1);
		System.out.println(hs.equals(hs1));
		System.out.println(hs.equals(hs2));
	}

}
