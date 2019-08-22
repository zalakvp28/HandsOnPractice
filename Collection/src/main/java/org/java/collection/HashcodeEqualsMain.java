package org.java.collection;

public class HashcodeEqualsMain {
	public static void main(String[] args) {
		
		HashCodeEquals he = new HashCodeEquals(11,"Zalak");
		HashCodeEquals he1 = new HashCodeEquals(11,"Zalak");
		
		System.out.println("he hashcode = " + he.hashCode());
		System.out.println("he1 hashcode = " + he1.hashCode());
		
		System.out.println("Checking equality between he and he1 = " + he.equals(he1));
	}
}
