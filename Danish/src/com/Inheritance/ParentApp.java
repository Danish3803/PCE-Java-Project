package com.Inheritance;

public class ParentApp {

	public static void main(String[] args) {
		Child4 ch = new Child4();
		System.out.println(ch.a + " " + ch.b);
	}
}

class Parent5 {
	int a;
	int b;

	public Parent5() {
		a = 10;
		b = 20;
	}

	public Parent5(int a, int b) {
		this.a = a;
		this.b = b;
	}

}

class Child4 extends Parent5 {
	int a;
	int b;

	public Child4() {
		a = 30;
		b = 40;
	}

	public Child4(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
