package Inheritance;

public class RuleFour {

	public static void main(String[] args) {
		child2 ch = new child2();
	}

	class Parent2 {
		int a = 10;

		public Parent2() {
			System.out.println("this is parent constructor");

		}

	}

	class Parent3 {
		int b = 20;

		public Parent3() {
			System.out.println("this is parent constructor");

		}

	}

	class child2 extends Parent2,Parent3 {   //Syntax Error this is not proper way to inherit from two parent class to the child class

		public child2() {
			System.out.println("this is child class");
		}

}
