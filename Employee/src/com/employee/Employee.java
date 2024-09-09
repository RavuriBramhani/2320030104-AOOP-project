package com.employee;


public class Employee implements Clonable, Comparable<Employee>{
	
	private int id;
	private String name;
	private int age;
	
	public Employee(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public int getid(int id) {
		return id;
	}
	
	public String getname(String name) {
		return name;
	}
	
	public int getage(int age) {
		return age;
	}
	
	public int compareTo(Employee other) {
		return Integer.compare(this.age,other.age);
	}
	
	public String toString(){
		
		return "Employee [id="+id+"name="+name+"age="+age+"]";
		
	}

}
