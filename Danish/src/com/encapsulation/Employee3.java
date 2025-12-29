package com.encapsulation;

class Employee3 {
	int emp_id;
	String name;
	int salary;
	
	public Employee3() {
		this(102,"Arsh",24);
		System.out.println("0 parameterized constructor is called");
	}
	public Employee3(int emp_id) {
		
		System.out.println("1 parameterized constructor is called");
	}
	public Employee3(int emp_id, String name) {
		this(101);
		System.out.println("2 parameterized constructor is called");
	}
	public Employee3(int emp_id, String name, int salary) {
		this(101,"Arsh");
		System.out.println("3 parameterized constructor is called");
	}
}

class EmployeeApp3 {
	public static void main(String[] args) {
		Employee3 e = new Employee3();
	}
}
