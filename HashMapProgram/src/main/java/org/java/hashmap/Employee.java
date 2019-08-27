package org.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> emp = new HashMap<String, Integer>();
		
		emp.put("Bob", 50);
		emp.put("Crystal", 35);
		emp.put("Jen", 28);
		emp.put("John",41);
		emp.put("Brian",50);
		emp.put("Cathie", 38);
		emp.put("Greg", 61);
		emp.put("Marius", 46);
		emp.put("Nancy", 40);
		
		System.out.println("The list of Employee is: ");
		System.out.println("------------------------");
		System.out.println("Name" + "\t\t Age");
		
		
		for (Map.Entry<String,Integer> entry : emp.entrySet())  
		{  
			System.out.println(entry.getKey() + "\t\t " + entry.getValue());
		}
			System.out.println(" ");
			System.out.println("The list of Employee above age 40 is:");
			System.out.println("-------------------------------------");
			
		
		for (Map.Entry<String,Integer> entry : emp.entrySet())  
		{  
			if(entry.getValue() > 40)
			{
				System.out.println(entry.getKey());
			}
		}
	}
	
	
	
	
}
