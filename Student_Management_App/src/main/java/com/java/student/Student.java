package com.java.student;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private double tutionBalance = 0;
	private static double costOfCourse = 800.00;
	private static int id = 1000;
	
	Scanner sc = new Scanner(System.in);
	
	//Constructor
	public Student() {
		
		System.out.print("Enter Student firstname: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter Student lastname: ");
		this.lastName = sc.nextLine();
		
		System.out.println();
		System.out.println("Select a Grade Level: ");
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student's Grade Level: ");
		this.gradeYear = sc.nextInt();
		
		setStudentID();
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}
	
	//Generate ID
	private void setStudentID() {
		
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		System.out.print("Enter course to enroll (Q to Quit): ");
		do{
			String course = sc.nextLine();
			if(!course.equals("Q")) {
				
				if(courses != null) {
					courses = courses + "\n" + course ;
				} else {
					courses = course;
				}
				
				
				tutionBalance = tutionBalance + costOfCourse;
			} 
			else {
				break;
			}
		} while(1 != 0);
			
		//System.out.println("You are enrolled in: " + courses);
	}
	
	public void balance() {
		System.out.println();
		System.out.println("Your balance is: $" + tutionBalance);
	}
	// View Balance
	public void viewBalance() {
		System.out.println("Now your new balance is: $" + tutionBalance);
	}
	
	// Pay tution
	public void payTution() {
		balance();
		System.out.print("Enter your payment: $");
		double payment = sc.nextDouble();
		
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment: $" + payment);
		viewBalance();
	}
	
	// Show Status
	public String showInfo() {
		System.out.println(" ");
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nEnrolled Courses are: " + courses + 
				"\nYour remain balance is: $" + tutionBalance;
	}
}
