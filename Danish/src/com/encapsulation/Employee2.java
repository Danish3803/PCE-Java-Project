package com.encapsulation;

class Employee2 extends Object {
	int emp_id;
	String name;
	int salary;
	
     	public Employee2() {
		System.out.println("Default Constructor Logic");
	}
	
        public Employee2(int emp_id, String name, int salary) {
	    this.emp_id = emp_id;
	    this.name = name;
        this.salary = salary;
	    System.out.println("Parameterized Constructor Logic");
	}
	

	public int getemp_id() {
		return emp_id;
	}

	public String getname() {
		return name;
	}

	public int getsalary() {
		return salary;
	}
}

class EmployeeApp2 {
	public static void main(String[] args) {
		Employee2 e = new Employee2();

		System.out.println("Your Employee Id: " + e.getemp_id());
		System.out.println("Your Employee Name: " + e.getname());
		System.out.println("Your Employee Salary: " + e.getsalary());

		Employee2 e1 = new Employee2(101, "Danish", 25000);

		System.out.println("Your Employee Id: " + e1.getemp_id());
		System.out.println("Your Employee Name: " + e1.getname());
		System.out.println("Your Employee Salary: " + e1.getsalary());
	}
}
