//Inheritance Rule No. 1

package Inheritance;

public class RuleOne {

	public static void main(String[] args) {
		child c = new child();
		System.out.println(c.a);
		c.disp();

	}

}

class Parent {
	int a = 10;
	int b = 20;

	void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}

class child extends Parent {

}
