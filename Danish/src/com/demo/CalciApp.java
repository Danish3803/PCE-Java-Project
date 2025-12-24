package com.demo;

public class CalciApp {
	public static void main(String[] args) {
		Calci c = new Calci();
		float ans = c.add(10.5f, 20);
		System.out.println(ans);
	}
}