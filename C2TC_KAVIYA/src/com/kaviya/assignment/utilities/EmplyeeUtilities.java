package com.kaviya.assignment.utilities;
import com. kaviya.assignment.employees.Employee;
public class EmplyeeUtilities {
	public void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }
}
