package com.encapsulation;

public class Signatures {

	public static void main(String[] args) {
		main("s");
		main('a');
		main(10);
		main(2.2f);
	}

	public static void main(String s) {
		System.out.println("Hello PCE");
	}

	public static void main(char args) {
		System.out.println("Hello PCE1");
	}

	static void main(int args) {
		System.out.println("Hello PCE2");
	}

	static void main(float args) {
		System.out.println("Hello PCE3");
	}
}


//method overloading does not depend on datatype !!