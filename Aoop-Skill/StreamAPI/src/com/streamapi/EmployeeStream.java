package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class EmployeeStream {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
	            new Employee("Alice", 60000),
	            new Employee("Bob", 50000),
	            new Employee("Charlie", 75000),
	            new Employee("David", 82000),
	            new Employee("Eve", 72000),
	            new Employee("Frank", 90000),
	            new Employee("Grace", 48000),
	            new Employee("Hannah", 65000),
	            new Employee("Ivy", 55000),
	            new Employee("Jack", 78000)
	        );

	        System.out.println("Employees with salary greater than 60000:");
	        employees.stream()
	                 .filter(emp -> emp.getSalary() > 60000)
	                 .forEach(System.out::println);

	        System.out.println("\nEmployees sorted by salary:");
	        employees.stream()
	                 .sorted(Comparator.comparing(Employee::getSalary))
	                 .forEach(System.out::println);

	        Employee highestSalaryEmployee = employees.stream()
	                                                  .max(Comparator.comparing(Employee::getSalary))
	                                                  .orElseThrow();
	        System.out.println("\nEmployee with the highest salary: " + highestSalaryEmployee);

	        OptionalDouble averageSalary = employees.stream()
	                                                .mapToDouble(Employee::getSalary)
	                                                .average();

	        if (averageSalary.isPresent()) {
	            System.out.println("\nAverage salary of employees: " + averageSalary.getAsDouble());
	        } 
	        else {
	            System.out.println("\nNo employees found.");
	        }

	}

}
