package com.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Sorting {

	public static void main(String[] args) {
		ArrayList<Employee> employees= new ArrayList<>();
		
		employees.add(new Employee(1, "shiva",23));
		employees.add(new Employee(2,"krishna",35));
		employees.add(new Employee(3,"priya",26));
		employees.add(new Employee(4,"Sita",38));
		employees.add(new Employee(5,"Ravi",30));
		employees.add(new Employee(6,"Geetha",43));
		
		
		Collections.sort(employees);
		System.out.println("Sorted");
		iterateEmployee(employees);
		

	}

	private static void iterateEmployee(ArrayList<Employee> employees) {
		
		Iterator<Employee> iterator= employees.iterator();
		while(iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.println(employee);
			
		}
		
	}
	
	

}
