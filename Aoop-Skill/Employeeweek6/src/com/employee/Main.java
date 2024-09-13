package com.employee;

public class Main {

	public static void main(String[] args) {
		 Employee employee1 = new Employee("Alice", "Developer");
	        Employee employee2 = new Employee("Bob", "Manager");
	        Employee employee3 = new Employee("Charlie", "Intern");

	        SalaryCalculator salaryCalculator = new SalaryCalculator();

	        System.out.println(employee1.getName() + "'s salary: Rs" + salaryCalculator.calculateSalary(employee1));
	        System.out.println(employee2.getName() + "'s salary: Rs" + salaryCalculator.calculateSalary(employee2));
	        System.out.println(employee3.getName() + "'s salary: Rs" + salaryCalculator.calculateSalary(employee3));

	}

}
