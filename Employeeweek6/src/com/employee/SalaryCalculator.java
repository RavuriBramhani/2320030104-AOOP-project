package com.employee;

public class SalaryCalculator {
	
	public double calculateSalary(Employee employee) {
        String role = employee.getRole();
        
        switch (role) {
            case "Developer":
                return calculateDeveloperSalary();
            case "Manager":
                return calculateManagerSalary();
            case "Intern":
                return calculateInternSalary();
            default:
                throw new IllegalArgumentException("Unknown role: " + role);
        }
    }

    private double calculateDeveloperSalary() {
        return 80000.0; 
    }

    private double calculateManagerSalary() {
        return 100000.0; 
    }

    private double calculateInternSalary() {
        return 30000.0;  
    }


}
