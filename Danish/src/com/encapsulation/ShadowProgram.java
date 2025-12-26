package com.encapsulation;

class Shadow {
	private String name;
	private int age;
	private String gender;

	public Shadow(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getage() {
		return age;
	}

	public String getgender() {
		return gender;
	}
}

public class ShadowProgram {
	public static void main(String[] args) {

		Shadow s = new Shadow("Danish", 22, "Male");

		System.out.println("your name is: " + s.getName());
		System.out.println("your age is: " + s.getage());
		System.out.println("your gender is: " + s.getgender());
	}
}
