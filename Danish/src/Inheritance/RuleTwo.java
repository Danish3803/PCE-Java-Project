package Inheritance;

public class RuleTwo {

	public static void main(String[] args) {
		chils c = new chils();
		System.out.println(c.a); //the field parent is not accesible because the method is private now!!
		c.disp();

	}

}

class Parents {
	private int a = 10;
    private int b = 20;

	void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}

class chils extends Parents {

}
