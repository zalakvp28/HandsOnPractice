package com.java.student;

import java.util.Scanner;

public class StudentApplication {
	
    static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * Student st = new Student(); st.enroll(); st.payTution();
		 * System.out.println(st.showInfo());
		 */
		
		// Ask how many new students we want to add
		System.out.println("Enter number of new students to enroll: ");
		int numOfStudent = sc.nextInt();
		
		Student students[] = new Student[numOfStudent];
		
		// Create n number of new students
		for(int i=0; i<numOfStudent; i++) {
			
			students[i] = new Student();
			students[i].enroll();
			students[i].payTution();
			System.out.println(students[i].showInfo());
		}
	}
}
