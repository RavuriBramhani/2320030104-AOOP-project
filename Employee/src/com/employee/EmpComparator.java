package com.employee;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {
	
	public int compare(Employee E1, Employee E2) {
		
		return E1.getname(null).compareTo(E2.getname(null));
		
	}

}
