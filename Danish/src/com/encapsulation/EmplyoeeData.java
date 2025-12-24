package com.encapsulation;

class Emplyoee {
	private String name;
	private int Id;
	private int salary;

	public Emplyoee(String n, int i, int s) {
		name = n;
		Id = i;
		salary = s;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return Id;
	}

	public int getsalary() {
		return salary;
	}
}

public class EmplyoeeData {
	public static void main(String[] args) {
		
		Emplyoee s = new Emplyoee("Danish", 133, 25000);

		System.out.println("your name is: " + s.getName());
		System.out.println("your Id is: " + s.getId());
		System.out.println("your salary is: "+ s.getsalary());
	}
}
