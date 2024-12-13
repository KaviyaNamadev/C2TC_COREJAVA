package com.kaviya.assignment.employees;
import com. kaviya.assignment.employees.Manager;
import com.kaviya.assignment.employees.Developer;
import com.kaviya.assignment.utilities.EmplyeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Manager manager = new Manager();
	        manager.setName("Alice");
	        manager.setEmployeeId(101);
	        manager.setSalary(80000);
	        manager.setDepartment("IT");

	        Developer developer = new Developer();
	        developer.setName("Bob");
	        developer.setEmployeeId(102);
	        developer.setSalary(60000);
	        developer.setProgrammingLanguage("Java");

	        EmplyeeUtilities utils = new EmplyeeUtilities();
	        System.out.println("Manager Details:");
	        utils.displayEmployeeDetails(manager);
	        System.out.println("Developer Details:");
	        utils.displayEmployeeDetails(developer);
	    }
	}
	
