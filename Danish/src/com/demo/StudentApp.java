package com.demo;

public class StudentApp {
	public static void main(String[] args) {
		UseStudent us = new UseStudent();
		Student res = us.dispStudent();
		System.out.println(res);
	}
}