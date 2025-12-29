package com.encapsulation;

class Circle {
	int r;
   float Pi;

	public Circle(int r, float Pi) {
		// super();
		this.r = r;
		this.Pi = Pi;

	}

	float disp() {
		float area = Pi * r * r;
		return area;
	}

	public class CircleApp {
		public static void main(String[] args) {
			Circle a = new Circle(10, 3.14f);
			System.out.println(a.disp());
		}
	}
}
