package com.encapsulation;

class Employee1 extends Object{
	int emp_id;
	String name;
	int salary;

    public Employee1 (int emp_id,String name,int salary) {
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
	

	class EmployeeApp1 {
	public static void main(String[] args) {
		Employee1 e = new Employee1(101, "Danish", 25000);
//		//in the above program the compiler will look for such a constructor which does not accept any argument but there is no such constructor present in our class  and hence we are going to get a compile time error .
//		only and only if the programmer has not defined a constructor in the class the compiler will add the 0 parameterized constructor.
//		Such a constructor which is provide by the compiler when no constructor was provide by the programmer is known as default constructor .
//		
		System.out.println("Your Employee Id: " + e.getemp_id());
		System.out.println("Your Employee Name: " + e.getname());
		System.out.println("Your Employee Salary: " + e.getsalary());
	}
}


//public class Object{
//	public Object() {
//		
//	}
//}zz