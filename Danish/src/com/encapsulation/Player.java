package com.encapsulation;

public class Player {
	String name;
	int age;
}

class Football extends Player {
	int Assist;
	String gender;
	int goals;
	public Football(String name, int age, int Assist, String gender, int goals) {
		this.name = name;
		this.age = age;
		this.Assist = Assist;
		this.gender = gender;
		this.goals = goals;
	}

	public String getname() {
		return name;
	}

	public int getage() {
		return age;
	}

	public int getAssist() {
		return Assist;
	}

	public String getgender() {
		return gender;
	}

	public int getgoals() {
		return goals;
	}

}

//class Cricket extends Player {
//	public Cricket(String name, int age, int Assist, String gender, int goals) {
//		this.name = name;
//		this.age = age;
//		this.Assist = Assist;
//		this.gender = gender;
//		this.goals = goals;
//	}
//
//	public String getname() {
//		return name;
//	}
//
//	public int getage() {
//		return age;
//	}
//
//	public int getAssist() {
//		return Assist;
//	}
//
//	public String getgender() {
//		return gender;
//	}
//
//	public int getgoals() {
//		return goals;
//	}
//
//}