package Inheritance;

public class RuleFive {

	public static void main(String[] args) {
		child3 ch = new child3();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}

class GrandParent {
	int a = 10;

}

class Parent4 extends GrandParent {
	int b = 20;

}

class child3 extends Parent4 {   // Its a proper syntax to inherit properties of two parent class to the child class 

}
