package org.java.email;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int defaultPasswordLength = 8;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String email;
	private String companySuffix = "saturn.com";
	
	// Constructor to receive firstName and lastName
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		//System.out.println();
		
	// Call a method asking for the department - return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
	// Call a method that returns a random password	
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your temporary password is: " + this.password);
		
	// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is: " + email);
	}
	
	//Ask for the Department
	private String setDepartment() {
		System.out.print("Department Codes:\n1. Sales\n2. Development\n3. Accounting\n4. None Of Above");
		System.out.println("  ");
		System.out.println("Enter the department code: ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int depChoice = sc.nextInt();
		
		if(depChoice == 1) {
			return "sales";
		} else if(depChoice == 2) {
			return "development";
		}else if(depChoice == 3) {
			return "accounting";
		}else {
			return " ";
		}
	}
	
	// Generate a random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
	
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i]  = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + "." + 
				"\n" + "Company Email: " + email + "." +
				"\n" + "MailBox Capacity: " + mailboxCapacity + "mb.";
	}
}
