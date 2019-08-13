package com.java.generics;

// Generic Class
public class Container<g1, g2> {
    g1 item1;
    g2 item2;

public Container(g1 item1, g2 item2) {
	super();
	this.item1 = item1;
	this.item2 = item2;
}

public void printItems() {
	System.out.println("Printing contents of containers: ");
	System.out.println("Item-1: " + item1);
	System.out.println("Item-2: " + item2);
	System.out.println();
}

public g1 getItem1() {
	return item1;
}

public void setItem1(g1 item1) {
	this.item1 = item1;
}

public g2 getItem2() {
	return item2;
}

public void setItem2(g2 item2) {
	this.item2 = item2;
}
}
