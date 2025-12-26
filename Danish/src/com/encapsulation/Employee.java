package com.encapsulation;

class Employee extends Object{
	int emp_id;
	String name;
	int salary;

    public Employee(int emp_id,String name,int salary) {
    //	super();
	this.emp_id = emp_id;
	this.name = name;
	this.salary = salary;
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
	

	class EmployeeApp {
	public static void main(String[] args) {
		Employee e = new Employee(101, "Danish", 25000);
		
		System.out.println("Your Employee Id: " + e.getemp_id());
		System.out.println("Your Employee Name: " + e.getname());
		System.out.println("Your Employee Salary: " + e.getsalary());
	}
}


//public class Object{
//	public Object() {
//		
//	}
//}